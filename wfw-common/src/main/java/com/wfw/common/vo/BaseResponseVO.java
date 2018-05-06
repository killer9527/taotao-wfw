package com.wfw.common.vo;

/**
 * Created by killer9527 on 2018/5/1.
 * 响应基类
 */
public abstract class BaseResponseVO {
    // 响应业务状态
    private Integer status;

    // 响应消息
    private String msg;

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
