package com.wfw.manager.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.wfw.common.vo.EUDataGridPageVO;
import com.wfw.manager.dto.TbItemDTO;
import com.wfw.manager.mapper.TbItemMapper;
import com.wfw.manager.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by killer9527 on 2018/4/22.
 */
@Service
public class ItemServiceImpl implements ItemService {
    @Autowired
    private TbItemMapper itemMapper;

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
}
