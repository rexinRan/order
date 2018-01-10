package com.mall.houlide.bean;

import java.io.Serializable;

public class LeaveStockDetail implements Serializable {
    private static final long serialVersionUID = 1L;
    /**
     * 出库单编号 , 主键, 外键 (参照 BACKSTOCK 表 )
     */
    private Integer leavestockId;
    /**
     * 所出商品编号,主键, 外键 (参照 PRODUCT 表 )
     */
    private Integer productId;
    /**
     * 出库数量
     */
    private Integer quantity;
    /**
     * 出库价格
     */
    private Double price;

    public Integer getLeavestockId() {
        return leavestockId;
    }

    public void setLeavestockId(Integer leavestockId) {
        this.leavestockId = leavestockId;
    }

    public Integer getProductId() {
        return productId;
    }

    public void setProductId(Integer productId) {
        this.productId = productId;
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

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", leavestockId=").append(leavestockId);
        sb.append(", productId=").append(productId);
        sb.append(", quantity=").append(quantity);
        sb.append(", price=").append(price);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}