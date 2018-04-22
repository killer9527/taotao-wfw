package com.wfw.manager.controller;

import com.wfw.common.vo.EUDataGridPageVO;
import com.wfw.manager.dto.TbItemDTO;
import com.wfw.manager.service.ItemService;
import com.wfw.manager.vo.TbItemVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * Created by killer9527 on 2018/4/22.
 */
@RestController
@RequestMapping(value = "/item")
public class ItemController {
    @Autowired
    private ItemService itemService;

    @RequestMapping(value = "/getItemById/{itemId}", method = RequestMethod.GET)
    public TbItemVO getItemById(@PathVariable("itemId") Long itemId) {
        TbItemDTO item = this.itemService.getItemById(itemId);
        TbItemVO tbItemVO = new TbItemVO();
        tbItemVO.setId(item.getId());
        tbItemVO.setTitle(item.getTitle());
        tbItemVO.setSellPoint(item.getSellPoint());
        tbItemVO.setBarcode(item.getBarcode());
        tbItemVO.setCid(item.getCid());
        tbItemVO.setImage(item.getImage());
        tbItemVO.setNum(item.getNum());
        tbItemVO.setStatus(item.getStatus());
        return tbItemVO;
    }

    @RequestMapping(value = "/list", method = RequestMethod.GET)
    public EUDataGridPageVO<TbItemDTO> list(Integer page, Integer rows) {
        return this.itemService.getItems(page, rows);
    }
}
