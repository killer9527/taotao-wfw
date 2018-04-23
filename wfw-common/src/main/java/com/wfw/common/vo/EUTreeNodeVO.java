package com.wfw.common.vo;

/**
 * Created by killer9527 on 2018/4/23.
 * EasyUI的树节点
 */
public class EUTreeNodeVO {
    /**
     * 节点id
     */
    private Long id;

    /**
     * 节点名称
     */
    private String text;

    /**
     * 节点状态：closed为非叶子节点，open为叶子节点
     */
    private String state;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }
}
