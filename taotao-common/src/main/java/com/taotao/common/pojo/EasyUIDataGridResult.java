package com.taotao.common.pojo;

import java.io.Serializable;
import java.util.List;

/**
 * @Author: Small Bear
 * @Description:使用easy的分页插件的包装类
 * @Data:Create in 20:54 2017/10/10
 * @Modified By:Small Bear
 */
public class EasyUIDataGridResult implements Serializable{
    private long total;
    private List rows;

    public long getTotal() {
        return total;
    }

    public void setTotal(long total) {
        this.total = total;
    }

    public List getRows() {
        return rows;
    }

    public void setRows(List rows) {
        this.rows = rows;
    }
}
