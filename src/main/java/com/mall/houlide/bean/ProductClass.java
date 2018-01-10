package com.mall.houlide.bean;

import java.io.Serializable;
import java.util.Date;

public class ProductClass implements Serializable {
    private static final long serialVersionUID = 1L;
    /**
     * 商品总分类编号, 主键
     */
    private Integer productclassId;
    /**
     * 商品分类名称
     */
    private String proClName;
    /**
     * 建分类人 ,外键
     */
    private Integer employeeId;
    /**
     * 建分类时间
     */
    private Date createdate;
    /**
     * 描述,备注
     */
    private String remark;

    public Integer getProductclassId() {
        return productclassId;
    }

    public void setProductclassId(Integer productclassId) {
        this.productclassId = productclassId;
    }

    public String getProClName() {
        return proClName;
    }

    public void setProClName(String proClName) {
        this.proClName = proClName == null ? null : proClName.trim();
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
        sb.append(", productclassId=").append(productclassId);
        sb.append(", proClName=").append(proClName);
        sb.append(", employeeId=").append(employeeId);
        sb.append(", createdate=").append(createdate);
        sb.append(", remark=").append(remark);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}