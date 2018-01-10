package com.mall.houlide.bean;

import java.io.Serializable;
import java.util.Date;

public class ProductSpec implements Serializable {
    private static final long serialVersionUID = 1L;
    /**
     * 商品规格编号,主键
     */
    private Integer productspecId;
    /**
     * 商品规格名称
     */
    private String proSpName;
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

    public Integer getProductspecId() {
        return productspecId;
    }

    public void setProductspecId(Integer productspecId) {
        this.productspecId = productspecId;
    }

    public String getProSpName() {
        return proSpName;
    }

    public void setProSpName(String proSpName) {
        this.proSpName = proSpName == null ? null : proSpName.trim();
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
        sb.append(", productspecId=").append(productspecId);
        sb.append(", proSpName=").append(proSpName);
        sb.append(", employeeId=").append(employeeId);
        sb.append(", createdate=").append(createdate);
        sb.append(", remark=").append(remark);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}