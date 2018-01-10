package com.mall.houlide.bean;

import java.io.Serializable;

public class BackStockDetail implements Serializable {
    private static final long serialVersionUID = 1L;
    /**
     * 退库单编号 , 主键, 外键 (参照 BACKSTOCK 表 )
     */
    private Integer backstockId;
    /**
     * 所退商品编号,主键, 外键 (参照 PRODUCT 表 )
     */
    private Integer productId;
    /**
     * 退入数量
     */
    private Integer quantity;
    /**
     * 参考价格
     */
    private Double price;

    public Integer getBackstockId() {
        return backstockId;
    }

    public void setBackstockId(Integer backstockId) {
        this.backstockId = backstockId;
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
        sb.append(", backstockId=").append(backstockId);
        sb.append(", productId=").append(productId);
        sb.append(", quantity=").append(quantity);
        sb.append(", price=").append(price);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}