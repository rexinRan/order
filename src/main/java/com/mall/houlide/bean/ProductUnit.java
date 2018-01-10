package com.mall.houlide.bean;

import java.io.Serializable;
import java.util.Date;

public class ProductUnit implements Serializable {
    private static final long serialVersionUID = 1L;
    /**
     * 计量单位编号 ,主键
     */
    private Integer productunitId;
    /**
     * 计量单位名称
     */
    private String proUnName;
    /**
     * 操作员 ,外键 ( 参照 EMPLOYEE 表 )
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

    public Integer getProductunitId() {
        return productunitId;
    }

    public void setProductunitId(Integer productunitId) {
        this.productunitId = productunitId;
    }

    public String getProUnName() {
        return proUnName;
    }

    public void setProUnName(String proUnName) {
        this.proUnName = proUnName == null ? null : proUnName.trim();
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
        sb.append(", productunitId=").append(productunitId);
        sb.append(", proUnName=").append(proUnName);
        sb.append(", employeeId=").append(employeeId);
        sb.append(", createdate=").append(createdate);
        sb.append(", remark=").append(remark);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}