package com.wfw.manager.controller;

import com.wfw.common.vo.EUDataGridPageVO;
import com.wfw.manager.dto.TbItemDTO;
import com.wfw.manager.entity.TbItemDO;
import com.wfw.manager.service.ItemService;
import com.wfw.manager.vo.SaveItemResponseVO;
import com.wfw.manager.vo.TbItemVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

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

    @RequestMapping(value = "/save", method = RequestMethod.POST)
    public SaveItemResponseVO save(TbItemDO item, String desc, String itemParams) {
        SaveItemResponseVO response;
        try {
            response = this.itemService.saveItem(item, desc, itemParams);
        } catch (Exception e) {
            e.printStackTrace();
            response = new SaveItemResponseVO();
            response.setStatus(500);
            response.setMsg("商品添加出现异常");
        }
        return response;
    }
}
