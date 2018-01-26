package com.mall.houlide.bean;

import java.io.Serializable;
import java.util.Date;

public class Sale implements Serializable {
    /**
     * 销售 编号
     */
    private Integer saleId;

    /**
     * 销售 日期
     */
    private Date saledate;

    /**
     * 销售部门, 外键 ( 参照 DEPT 表 )
     */
    private Integer deptId;

    /**
     * 售货人,   外键 ( 参照 EMPLOYEE 表)
     */
    private Integer employeeId;

    /**
     * 备注
     */
    private String remark;

    /**
     * 发货状态
     */
    private String saleState;

    /**
     * 是否已删除:1:未,0:删除了
     */
    private Boolean isDel;

    private static final long serialVersionUID = 1L;

    public Integer getSaleId() {
        return saleId;
    }

    public void setSaleId(Integer saleId) {
        this.saleId = saleId;
    }

    public Date getSaledate() {
        return saledate;
    }

    public void setSaledate(Date saledate) {
        this.saledate = saledate;
    }

    public Integer getDeptId() {
        return deptId;
    }

    public void setDeptId(Integer deptId) {
        this.deptId = deptId;
    }

    public Integer getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(Integer employeeId) {
        this.employeeId = employeeId;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    public String getSaleState() {
        return saleState;
    }

    public void setSaleState(String saleState) {
        this.saleState = saleState == null ? null : saleState.trim();
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
        sb.append(", saleId=").append(saleId);
        sb.append(", saledate=").append(saledate);
        sb.append(", deptId=").append(deptId);
        sb.append(", employeeId=").append(employeeId);
        sb.append(", remark=").append(remark);
        sb.append(", saleState=").append(saleState);
        sb.append(", isDel=").append(isDel);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}