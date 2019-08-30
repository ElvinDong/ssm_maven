package cn.hbstd.vo;

import java.util.List;
/*
 * User类的封装类
  *   响应EasyUI显示
 */
public class EasyuiResult {

    private Long total;

    private List<?> rows;

    public EasyuiResult() {

    }

    public EasyuiResult(Long total, List<?> rows) {
        this.total = total;
        this.rows = rows;
    }

    public Long getTotal() {
        return total;
    }

    public void setTotal(Long total) {
        this.total = total;
    }

    public List<?> getRows() {
        return rows;
    }

    public void setRows(List<?> rows) {
        this.rows = rows;
    }

}
