package com.wfw.manager.vo;

import java.util.List;

/**
 * Created by killer9527 on 2018/5/6.
 */
public class ItemGroupParamVO {
    /**
     * 分组名称
     */
    private String group;

    /**
     * 规格项
     */
    private List<String> params;

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public List<String> getParams() {
        return params;
    }

    public void setParams(List<String> params) {
        this.params = params;
    }
}
