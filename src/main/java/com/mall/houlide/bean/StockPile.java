package com.mall.houlide.bean;

import java.io.Serializable;
import java.util.Date;

public class StockPile implements Serializable {
    private static final long serialVersionUID = 1L;
    /**
     * 库存编号 , 主键
     */
    private Integer stockpileId;
    /**
     * 商品所属部门, 外键 ( 参照 DEPT 表 )
     */
    private Integer deptId;
    /**
     * 所在仓库,外键 ( 参照 SOTREHOUSE 表 )
     */
    private Integer storehouseId;
    /**
     * 商品编号,外键 ( 参照 PRODUCT 表 )
     */
    private Integer productId;
    /**
     * 此种商品第一次入库时间
     */
    private Date firstenterdate;
    /**
     * 此种商品最后一次出库时间(LASTLEAVEDATE 为NULL 时,此种商品从来没有 卖过 )
     */
    private Date lastleavedate;
    /**
     * 所存数量
     */
    private Integer quantity;
    /**
     * 加权价
     */
    private Double price;
    /**
     * 备注
     */
    private String remark;
    /**
     * 是否已删除:1:未,0:删除了
     */
    private Boolean isDel;

    public Integer getStockpileId() {
        return stockpileId;
    }

    public void setStockpileId(Integer stockpileId) {
        this.stockpileId = stockpileId;
    }

    public Integer getDeptId() {
        return deptId;
    }

    public void setDeptId(Integer deptId) {
        this.deptId = deptId;
    }

    public Integer getStorehouseId() {
        return storehouseId;
    }

    public void setStorehouseId(Integer storehouseId) {
        this.storehouseId = storehouseId;
    }

    public Integer getProductId() {
        return productId;
    }

    public void setProductId(Integer productId) {
        this.productId = productId;
    }

    public Date getFirstenterdate() {
        return firstenterdate;
    }

    public void setFirstenterdate(Date firstenterdate) {
        this.firstenterdate = firstenterdate;
    }

    public Date getLastleavedate() {
        return lastleavedate;
    }

    public void setLastleavedate(Date lastleavedate) {
        this.lastleavedate = lastleavedate;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    public Boolean getIsDel() {
        return isDel;
    }

    public void setIsDel(Boolean isDel) {
        this.isDel = isDel;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", stockpileId=").append(stockpileId);
        sb.append(", deptId=").append(deptId);
        sb.append(", storehouseId=").append(storehouseId);
        sb.append(", productId=").append(productId);
        sb.append(", firstenterdate=").append(firstenterdate);
        sb.append(", lastleavedate=").append(lastleavedate);
        sb.append(", quantity=").append(quantity);
        sb.append(", price=").append(price);
        sb.append(", remark=").append(remark);
        sb.append(", isDel=").append(isDel);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}