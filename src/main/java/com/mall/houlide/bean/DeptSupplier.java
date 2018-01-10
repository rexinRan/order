package com.mall.houlide.bean;

import java.io.Serializable;

public class DeptSupplier implements Serializable {
    private static final long serialVersionUID = 1L;
    /**
     * 部门编号,主键,外键
     */
    private Integer deptId;
    /**
     * 供应商编号,主键，外键
     */
    private Integer supplierId;

    public Integer getDeptId() {
        return deptId;
    }

    public void setDeptId(Integer deptId) {
        this.deptId = deptId;
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
        sb.append(", deptId=").append(deptId);
        sb.append(", supplierId=").append(supplierId);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}