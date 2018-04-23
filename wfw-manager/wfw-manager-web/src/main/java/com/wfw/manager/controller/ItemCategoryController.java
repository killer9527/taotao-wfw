package com.wfw.manager.controller;

import com.wfw.common.vo.EUTreeNodeVO;
import com.wfw.manager.service.ItemCategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by killer9527 on 2018/4/23.
 */
@RestController
@RequestMapping(value = "/item/cat")
public class ItemCategoryController {
    @Autowired
    private ItemCategoryService itemCategoryService;

    @RequestMapping(value = "/list", method = RequestMethod.POST)
    public List<EUTreeNodeVO> getTreeNodes(@RequestParam(value = "id", defaultValue = "0") Long parentId){
        return this.itemCategoryService.getItemCategory(parentId);
    }
}
