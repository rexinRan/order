package com.mall.houlide.bean;

import java.io.Serializable;

public class EnterStockDetail implements Serializable {
    private static final long serialVersionUID = 1L;
    /**
     * 入库单编号 , 主键, 外键 (参照 ENTERSTOCK 表 )
     */
    private Integer enterstockId;
    /**
     * 此种商品编号,主键, 外键 (参照 PRODUCT 表 )
     */
    private Integer productId;
    /**
     * 此种商品数量
     */
    private Integer quantity;
    /**
     * 此种商品参考价格
     */
    private Double price;
    /**
     * 此种商品有没有开发票 ( 缺省为 0 , 有没有开票 )
     */
    private Boolean haveinvoice;
    /**
     * 发票号
     */
    private String invoicenum;

    public Integer getEnterstockId() {
        return enterstockId;
    }

    public void setEnterstockId(Integer enterstockId) {
        this.enterstockId = enterstockId;
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

    public Boolean getHaveinvoice() {
        return haveinvoice;
    }

    public void setHaveinvoice(Boolean haveinvoice) {
        this.haveinvoice = haveinvoice;
    }

    public String getInvoicenum() {
        return invoicenum;
    }

    public void setInvoicenum(String invoicenum) {
        this.invoicenum = invoicenum == null ? null : invoicenum.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", enterstockId=").append(enterstockId);
        sb.append(", productId=").append(productId);
        sb.append(", quantity=").append(quantity);
        sb.append(", price=").append(price);
        sb.append(", haveinvoice=").append(haveinvoice);
        sb.append(", invoicenum=").append(invoicenum);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}