package com.mall.houlide.bean;

import java.io.Serializable;

public class BuyOrderDetail implements Serializable {
    private static final long serialVersionUID = 1L;
    /**
     * 进货合同编号,主键, 外键 ( 参照 BUYORDER 表 )
     */
    private Integer buyorderId;
    /**
     * 所进商品编号,主键, 外键 (参照 PRODUCT 表 )
     */
    private Integer productId;
    /**
     * 商品数量
     */
    private Integer quantity;
    /**
     * 商品进价
     */
    private Double price;

    public Integer getBuyorderId() {
        return buyorderId;
    }

    public void setBuyorderId(Integer buyorderId) {
        this.buyorderId = buyorderId;
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
        sb.append(", buyorderId=").append(buyorderId);
        sb.append(", productId=").append(productId);
        sb.append(", quantity=").append(quantity);
        sb.append(", price=").append(price);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}