package com.wfw.manager.vo;

import com.wfw.common.vo.BaseResponseVO;

/**
 * Created by killer9527 on 2018/5/2.
 * 添加商品响应
 */
public class SaveItemResponseVO extends BaseResponseVO {

    public SaveItemResponseVO() {
        this.setStatus(200);
        this.setMsg("OK");
    }
}
