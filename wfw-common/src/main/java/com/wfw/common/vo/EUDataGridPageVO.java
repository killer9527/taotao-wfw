package com.wfw.common.vo;

import java.util.List;

/**
 * Created by killer9527 on 2018/4/22.
 * EasyUi列表数据结构
 */
public class EUDataGridPageVO<T> {
    private Long total;
    private List<T> rows;

    public Long getTotal() {
        return total;
    }

    public void setTotal(Long total) {
        this.total = total;
    }

    public List<T> getRows() {
        return rows;
    }

    public void setRows(List<T> rows) {
        this.rows = rows;
    }
}
