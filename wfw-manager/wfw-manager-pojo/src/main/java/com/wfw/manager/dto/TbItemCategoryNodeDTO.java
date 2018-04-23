package com.wfw.manager.dto;

/**
 * Created by killer9527 on 2018/4/23.
 * 商品目录节点
 */
public class TbItemCategoryNodeDTO {
    private Long id;

    private Long parentId;

    private String name;

    private Boolean parent;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getParentId() {
        return parentId;
    }

    public void setParentId(Long parentId) {
        this.parentId = parentId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Boolean getParent() {
        return parent;
    }

    public void setParent(Boolean parent) {
        this.parent = parent;
    }
}
