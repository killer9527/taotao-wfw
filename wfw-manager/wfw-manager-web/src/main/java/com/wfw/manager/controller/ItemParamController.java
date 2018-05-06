package com.wfw.manager.controller;

import com.wfw.common.vo.SingleDataResponseVO;
import com.wfw.manager.entity.TbItemParamDO;
import com.wfw.manager.service.ItemParamService;
import com.wfw.manager.vo.SaveItemParamResponseVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by killer9527 on 2018/5/6.
 * 商品规格参数
 */
@RestController
@RequestMapping(value = "/item/param")
public class ItemParamController {
    @Autowired
    private ItemParamService itemParamService;

    @RequestMapping(value = "/query/itemcatid/{itemCatId}", method = RequestMethod.GET)
    public SingleDataResponseVO<TbItemParamDO> getItemParam(@PathVariable(value = "itemCatId") Long itemCategoryId){
        SingleDataResponseVO<TbItemParamDO> response = this.itemParamService.getItemParamByCategoryId(itemCategoryId);
        return response;
    }

    @RequestMapping(value = "/save/{itemCatId}", method = RequestMethod.POST)
    public SaveItemParamResponseVO saveItemParam(String paramData,
                                                 @PathVariable(value = "itemCatId") Long itemCategoryId){
        SaveItemParamResponseVO response = this.itemParamService.insertItemParam(paramData, itemCategoryId);
        return response;
    }
}
