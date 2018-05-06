package com.wfw.manager.service;

import com.wfw.common.vo.SingleDataResponseVO;
import com.wfw.manager.entity.TbItemParamDO;
import com.wfw.manager.vo.SaveItemParamResponseVO;

/**
 * Created by killer9527 on 2018/5/6.
 */
public interface ItemParamService {
    /**
     * 根据商品类名id查询商品参数规格
     * @param categoryId
     * @return
     */
    SingleDataResponseVO<TbItemParamDO> getItemParamByCategoryId(long categoryId);

    /**
     * 保存商品类别规格参数分组
     * @param paramData
     * @param itemCategoryId
     * @return
     */
    SaveItemParamResponseVO insertItemParam(String paramData, Long itemCategoryId);
}
