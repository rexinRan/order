package com.mall.houlide.bean;

import java.io.Serializable;

public class SaleDetail implements Serializable {
    private static final long serialVersionUID = 1L;
    /**
     * 销售编号,主键, 外键 ( 参照 SALE 表 )
     */
    private Integer saleId;
    /**
     * 商品编号,主键, 外键 ( 参照 PRODUCT 表
     */
    private Integer productId;
    /**
     * 销售合同, 外键 ( 参照 SALEORDER 表 )SALEORDER_ID 为 NULL 时, 为现金销售
     */
    private Integer saleorderId;
    /**
     * 数量
     */
    private Integer quantity;
    /**
     * 价格
     */
    private Double price;
    /**
     * 折扣
     */
    private Double discount;

    public Integer getSaleId() {
        return saleId;
    }

    public void setSaleId(Integer saleId) {
        this.saleId = saleId;
    }

    public Integer getProductId() {
        return productId;
    }

    public void setProductId(Integer productId) {
        this.productId = productId;
    }

    public Integer getSaleorderId() {
        return saleorderId;
    }

    public void setSaleorderId(Integer saleorderId) {
        this.saleorderId = saleorderId;
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

    public Double getDiscount() {
        return discount;
    }

    public void setDiscount(Double discount) {
        this.discount = discount;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", saleId=").append(saleId);
        sb.append(", productId=").append(productId);
        sb.append(", saleorderId=").append(saleorderId);
        sb.append(", quantity=").append(quantity);
        sb.append(", price=").append(price);
        sb.append(", discount=").append(discount);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}