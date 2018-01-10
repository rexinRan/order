package com.mall.houlide.bean;

import java.io.Serializable;

public class BackSaleDetail implements Serializable {
    private static final long serialVersionUID = 1L;
    /**
     * 退货单编号 , 主键, 外键 (参照 BACKSTOCK 表
     */
    private Integer backsaleId;
    /**
     * 所退商品编号,主键, 外键 (参照 PRODUCT 表 )
     */
    private Integer productId;
    /**
     * 退货数量
     */
    private Integer quantity;
    /**
     * 价格
     */
    private Double price;

    public Integer getBacksaleId() {
        return backsaleId;
    }

    public void setBacksaleId(Integer backsaleId) {
        this.backsaleId = backsaleId;
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
        sb.append(", backsaleId=").append(backsaleId);
        sb.append(", productId=").append(productId);
        sb.append(", quantity=").append(quantity);
        sb.append(", price=").append(price);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}