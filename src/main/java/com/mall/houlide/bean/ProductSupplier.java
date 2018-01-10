package com.mall.houlide.bean;

import java.io.Serializable;

public class ProductSupplier implements Serializable {
    private static final long serialVersionUID = 1L;
    /**
     * 商品名称编号,主键 , 外键( 参照 PRODUCT 表  )
     */
    private Integer productId;
    /**
     * 供应商编号 , 主键,  外键( 参照 SUPPLIER 表)
     */
    private Integer supplierId;

    public Integer getProductId() {
        return productId;
    }

    public void setProductId(Integer productId) {
        this.productId = productId;
    }

    public Integer getSupplierId() {
        return supplierId;
    }

    public void setSupplierId(Integer supplierId) {
        this.supplierId = supplierId;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", productId=").append(productId);
        sb.append(", supplierId=").append(supplierId);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}