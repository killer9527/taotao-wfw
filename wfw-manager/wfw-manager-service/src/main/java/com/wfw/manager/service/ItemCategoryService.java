package com.wfw.manager.service;

import com.wfw.common.vo.EUTreeNodeVO;

import java.util.List;

/**
 * Created by killer9527 on 2018/4/23.
 */
public interface ItemCategoryService {
    /**
     * 根据parentId查询商品目录
     * @param parentId
     * @return
     */
    List<EUTreeNodeVO> getItemCategory(long parentId);
}
