package com.mall.houlide.bean;

import java.io.Serializable;

public class SaleOrderDetail implements Serializable {
    private static final long serialVersionUID = 1L;
    /**
     * 销售合同编号,主键, 外键 ( 参照 BUYORDER 表 )
     */
    private Integer saleorderId;
    /**
     * 销售商品编号,主键, 外键 (参照 PRODUCT 表 )
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

    public Double getCount() {
        return count;
    }

    public void setCount(Double count) {
        this.count = price * quantity;
    }

    private Double count;


    public Integer getSaleorderId() {
        return saleorderId;
    }

    public void setSaleorderId(Integer saleorderId) {
        this.saleorderId = saleorderId;
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
        sb.append(", saleorderId=").append(saleorderId);
        sb.append(", productId=").append(productId);
        sb.append(", quantity=").append(quantity);
        sb.append(", price=").append(price);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}