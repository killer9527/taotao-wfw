package com.wfw.manager.service.impl;

import com.wfw.common.vo.SingleDataResponseVO;
import com.wfw.manager.entity.TbItemParamDO;
import com.wfw.manager.mapper.TbItemParamMapper;
import com.wfw.manager.service.ItemParamService;
import com.wfw.manager.vo.SaveItemParamResponseVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;

/**
 * Created by killer9527 on 2018/5/6.
 */
@Service
public class ItemParamServiceImpl implements ItemParamService {
    @Autowired
    private TbItemParamMapper itemParamMapper;

    @Override
    public SingleDataResponseVO<TbItemParamDO> getItemParamByCategoryId(long categoryId) {
        TbItemParamDO itemParam = this.itemParamMapper.selectByCategoryId(categoryId);
        SingleDataResponseVO<TbItemParamDO> response = new SingleDataResponseVO<>(itemParam);
        return response;
    }

    @Override
    public SaveItemParamResponseVO insertItemParam(String paramData, Long itemCategoryId) {
        TbItemParamDO itemParam = new TbItemParamDO();
        itemParam.setItemCatId(itemCategoryId);
        itemParam.setParamData(paramData);
        itemParam.setCreated(new Date());
        itemParam.setUpdated(new Date());
        SaveItemParamResponseVO response = new SaveItemParamResponseVO();
        int result = this.itemParamMapper.insert(itemParam);
        if (result > 0){
            return response;
        }
        response.setStatus(500);
        response.setMsg("保存商品类别规格参数分组失败");
        return response;
    }
}
