package com.wfw.manager.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.wfw.common.vo.EUDataGridPageVO;
import com.wfw.manager.dto.TbItemDTO;
import com.wfw.manager.entity.TbItemDO;
import com.wfw.manager.entity.TbItemDescDO;
import com.wfw.manager.entity.TbItemParamItemDO;
import com.wfw.manager.mapper.TbItemDescMapper;
import com.wfw.manager.mapper.TbItemMapper;
import com.wfw.manager.mapper.TbItemParamItemMapper;
import com.wfw.manager.service.ItemService;
import com.wfw.manager.vo.SaveItemResponseVO;
import com.wfw.utils.UniqueIdUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

/**
 * Created by killer9527 on 2018/4/22.
 */
@Service
public class ItemServiceImpl implements ItemService {
    @Autowired
    private TbItemMapper itemMapper;

    @Autowired
    private TbItemDescMapper itemDescMapper;

    @Autowired
    private TbItemParamItemMapper itemParamItemMapper;

    @Override
    public TbItemDTO getItemById(long itemId) {
        return this.itemMapper.selectByItemId(itemId);
    }

    @Override
    public EUDataGridPageVO<TbItemDTO> getItems(int pageNum, int pageSize) {
        PageHelper.startPage(pageNum, pageSize);
        List<TbItemDTO> tbItems = this.itemMapper.selectAll();
        PageInfo<TbItemDTO> pageInfo = new PageInfo<>(tbItems);
        EUDataGridPageVO<TbItemDTO> result = new EUDataGridPageVO<>();
        result.setRows(tbItems);
        result.setTotal(pageInfo.getTotal());
        return result;
    }

    @Override
    public SaveItemResponseVO saveItem(TbItemDO tbItemDO, String desc, String itemParams) throws Exception {
        //生成商品Id
        long itemId = UniqueIdUtil.genItemId();
        tbItemDO.setId(itemId);
        //status置为正常
        tbItemDO.setStatus((byte) 1);
        tbItemDO.setCreated(new Date());
        tbItemDO.setUpdated(new Date());

        //插入商品描述
        int itemDescResult = insertItemDesc(tbItemDO.getId(), desc);
        int itemResult = this.itemMapper.insert(tbItemDO);

        //插入商品规格参数
        TbItemParamItemDO itemParamItem = new TbItemParamItemDO();
        itemParamItem.setItemId(tbItemDO.getId());
        itemParamItem.setParamData(itemParams);
        itemParamItem.setCreated(new Date());
        itemParamItem.setUpdated(new Date());
        int itemParamItemResult = this.itemParamItemMapper.insert(itemParamItem);

        if (itemDescResult == 0) {
            throw new Exception("商品描述添加失败");
        }
        if (itemResult == 0) {
            throw new Exception("商品添加失败");
        }
        if (itemParamItemResult == 0){
            throw new Exception("商品规格参数添加失败");
        }
        return new SaveItemResponseVO();
    }

    /**
     * 添加商品描述
     *
     * @param itemId
     * @param desc
     * @return
     */
    private int insertItemDesc(long itemId, String desc) {
        TbItemDescDO tbItemDesc = new TbItemDescDO();
        tbItemDesc.setItemId(itemId);
        tbItemDesc.setItemDesc(desc);
        tbItemDesc.setCreated(new Date());
        tbItemDesc.setUpdated(new Date());
        return this.itemDescMapper.insert(tbItemDesc);
    }
}
