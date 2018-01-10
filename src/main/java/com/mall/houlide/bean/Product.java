package com.mall.houlide.bean;

import java.io.Serializable;
import java.util.Date;

public class Product implements Serializable {
    private static final long serialVersionUID = 1L;
    /**
     * 商品名称编号, 主键
     */
    private Integer productId;
    /**
     * 商品细分类编号, 外键 ( 参照 PRODUCTLIST 表 )
     */
    private Integer productlistId;
    /**
     * 商品名称
     */
    private String proName;
    /**
     * 商品规格, 外键 ( 参照 PRODUCTSPEC 表
     */
    private Integer productspecId;
    /**
     * 计量单位, 外键 ( 参照 PRODUCTUNIT 表 )
     */
    private Integer productunitId;
    /**
     * 参考价格
     */
    private Double price;
    /**
     * 操作员,   外键 ( 参照 EMPLOYEE 表 )
     */
    private Integer employeeId;
    /**
     * 创建时间
     */
    private Date createdate;
    /**
     * 描述,备注
     */
    private String remark;
    /**
     * 是否已删除:1:未,0:删除了
     */
    private Boolean isDel;

    public Integer getProductId() {
        return productId;
    }

    public void setProductId(Integer productId) {
        this.productId = productId;
    }

    public Integer getProductlistId() {
        return productlistId;
    }

    public void setProductlistId(Integer productlistId) {
        this.productlistId = productlistId;
    }

    public String getProName() {
        return proName;
    }

    public void setProName(String proName) {
        this.proName = proName == null ? null : proName.trim();
    }

    public Integer getProductspecId() {
        return productspecId;
    }

    public void setProductspecId(Integer productspecId) {
        this.productspecId = productspecId;
    }

    public Integer getProductunitId() {
        return productunitId;
    }

    public void setProductunitId(Integer productunitId) {
        this.productunitId = productunitId;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Integer getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(Integer employeeId) {
        this.employeeId = employeeId;
    }

    public Date getCreatedate() {
        return createdate;
    }

    public void setCreatedate(Date createdate) {
        this.createdate = createdate;
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
        sb.append(", productId=").append(productId);
        sb.append(", productlistId=").append(productlistId);
        sb.append(", proName=").append(proName);
        sb.append(", productspecId=").append(productspecId);
        sb.append(", productunitId=").append(productunitId);
        sb.append(", price=").append(price);
        sb.append(", employeeId=").append(employeeId);
        sb.append(", createdate=").append(createdate);
        sb.append(", remark=").append(remark);
        sb.append(", isDel=").append(isDel);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}