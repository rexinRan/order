package com.mall.houlide.bean;

import java.io.Serializable;
import java.util.Date;

public class ProductList implements Serializable {
    private static final long serialVersionUID = 1L;
    /**
     * 商品细分类编号,主键( 参照PRODUCTCLASS 表
     */
    private Integer productlistId;
    /**
     * 商品总分类编号, 外键
     */
    private Integer productclassId;
    /**
     * 商品名称
     */
    private String proLiName;
    /**
     * 建分类人,外键 ( 参照 EMPLOYEE 表 )
     */
    private Integer employeeId;
    /**
     * 建分类时间
     */
    private Date createdate;
    /**
     * 描述 ,备注
     */
    private String remark;

    public Integer getProductlistId() {
        return productlistId;
    }

    public void setProductlistId(Integer productlistId) {
        this.productlistId = productlistId;
    }

    public Integer getProductclassId() {
        return productclassId;
    }

    public void setProductclassId(Integer productclassId) {
        this.productclassId = productclassId;
    }

    public String getProLiName() {
        return proLiName;
    }

    public void setProLiName(String proLiName) {
        this.proLiName = proLiName == null ? null : proLiName.trim();
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

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", productlistId=").append(productlistId);
        sb.append(", productclassId=").append(productclassId);
        sb.append(", proLiName=").append(proLiName);
        sb.append(", employeeId=").append(employeeId);
        sb.append(", createdate=").append(createdate);
        sb.append(", remark=").append(remark);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}