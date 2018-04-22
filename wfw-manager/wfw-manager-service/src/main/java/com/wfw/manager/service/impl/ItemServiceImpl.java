package com.wfw.manager.service.impl;

import com.wfw.manager.dto.TbItemDTO;
import com.wfw.manager.mapper.TbItemMapper;
import com.wfw.manager.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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
}
