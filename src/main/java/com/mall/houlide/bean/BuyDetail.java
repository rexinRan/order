package com.mall.houlide.bean;

import java.io.Serializable;

public class BuyDetail implements Serializable {
    private static final long serialVersionUID = 1L;
    /**
     * 进货编号,主键, 外键 ( 参照 BUY 表 )
     */
    private Integer buyId;
    /**
     * 商品编号,主键, 外键 ( 参照 PRODUCT 表 )
     */
    private Integer productId;
    /**
     * 采购合同,  外键 ( 参照 BUYORDER 表 )BUYORDER_ID 为 NULL 时, 为现金进货
     */
    private Integer buyorderId;
    /**
     * 数量
     */
    private Integer quantity;
    /**
     * 价格
     */
    private Double price;

    public Integer getBuyId() {
        return buyId;
    }

    public void setBuyId(Integer buyId) {
        this.buyId = buyId;
    }

    public Integer getProductId() {
        return productId;
    }

    public void setProductId(Integer productId) {
        this.productId = productId;
    }

    public Integer getBuyorderId() {
        return buyorderId;
    }

    public void setBuyorderId(Integer buyorderId) {
        this.buyorderId = buyorderId;
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
        sb.append(", buyId=").append(buyId);
        sb.append(", productId=").append(productId);
        sb.append(", buyorderId=").append(buyorderId);
        sb.append(", quantity=").append(quantity);
        sb.append(", price=").append(price);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}