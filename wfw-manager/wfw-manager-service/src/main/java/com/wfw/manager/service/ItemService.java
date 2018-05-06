package com.wfw.manager.service;

import com.wfw.common.vo.EUDataGridPageVO;
import com.wfw.manager.dto.TbItemDTO;
import com.wfw.manager.entity.TbItemDO;
import com.wfw.manager.vo.SaveItemResponseVO;

/**
 * Created by killer9527 on 2018/4/21.
 */
public interface ItemService {
    /**
     * 根据id查询商品
     * @param itemId
     * @return
     */
    TbItemDTO getItemById(long itemId);

    /**
     * 查询商品列表
     * @param pageNum
     * @param pageSize
     * @return
     */
    EUDataGridPageVO<TbItemDTO> getItems(int pageNum,int pageSize);

    /**
     * 添加商品
     * @param tbItemDO
     * @return
     */
    SaveItemResponseVO saveItem(TbItemDO tbItemDO, String desc) throws Exception;
}
