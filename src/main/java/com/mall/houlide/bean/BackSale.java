package com.mall.houlide.bean;

import java.io.Serializable;
import java.util.Date;

public class BackSale implements Serializable {
    private static final long serialVersionUID = 1L;
    /**
     * 退货单编号 , 主键
     */
    private Integer backsaleId;
    /**
     * 退货日期
     */
    private Date backdate;
    /**
     * 退货部门 ,  外键 ( 参照 DEPT 表 )
     */
    private Integer deptId;
    /**
     * 退入仓库 ,  外键 ( 参照 STOREHOUSE 表)
     */
    private Integer storehouseId;
    /**
     * 退货人 ,    外键 ( 参照 EMPLOYEE 表)
     */
    private Integer employeeId;
    /**
     * 退货原因
     */
    private String remark;
    /**
     * 是否已删除:1:未,0:删除了
     */
    private Boolean isDel;

    public Integer getBacksaleId() {
        return backsaleId;
    }

    public void setBacksaleId(Integer backsaleId) {
        this.backsaleId = backsaleId;
    }

    public Date getBackdate() {
        return backdate;
    }

    public void setBackdate(Date backdate) {
        this.backdate = backdate;
    }

    public Integer getDeptId() {
        return deptId;
    }

    public void setDeptId(Integer deptId) {
        this.deptId = deptId;
    }

    public Integer getStorehouseId() {
        return storehouseId;
    }

    public void setStorehouseId(Integer storehouseId) {
        this.storehouseId = storehouseId;
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
        sb.append(", backsaleId=").append(backsaleId);
        sb.append(", backdate=").append(backdate);
        sb.append(", deptId=").append(deptId);
        sb.append(", storehouseId=").append(storehouseId);
        sb.append(", employeeId=").append(employeeId);
        sb.append(", remark=").append(remark);
        sb.append(", isDel=").append(isDel);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}