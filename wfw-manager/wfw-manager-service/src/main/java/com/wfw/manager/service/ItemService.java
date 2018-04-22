package com.wfw.manager.service;

import com.wfw.manager.dto.TbItemDTO;

/**
 * Created by killer9527 on 2018/4/21.
 */
public interface ItemService {
    TbItemDTO getItemById(long itemId);
}
