package com.mall.houlide.bean;

import java.io.Serializable;
import java.util.Date;

public class LeaveStock implements Serializable {
    private static final long serialVersionUID = 1L;
    /**
     * 出库单编号 , 主键, 外键 (参照 LEAVESTOCK 表 )
     */
    private Integer leavestockId;
    /**
     * 出库时间
     */
    private Date leavedate;
    /**
     * 出库部门 ,外键 ( 参照 DEPT 表 )
     */
    private Integer deptId;
    /**
     * 所出仓库 ,外键 ( 参照 STOREHOUSE 表)
     */
    private Integer storehouseId;
    /**
     * 所入仓库 ,外键 ( 参照 STOREHOUSE 表)
     */
    private Integer tostorehouseId;
    /**
     * 出库人 ,外键 ( 参照 EMPLOYEE 表)
     */
    private Integer employeeId;
    /**
     * 备注
     */
    private String remark;
    /**
     * 是否已删除:1:未,0:删除了
     */
    private Boolean isDel;

    public Integer getLeavestockId() {
        return leavestockId;
    }

    public void setLeavestockId(Integer leavestockId) {
        this.leavestockId = leavestockId;
    }

    public Date getLeavedate() {
        return leavedate;
    }

    public void setLeavedate(Date leavedate) {
        this.leavedate = leavedate;
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

    public Integer getTostorehouseId() {
        return tostorehouseId;
    }

    public void setTostorehouseId(Integer tostorehouseId) {
        this.tostorehouseId = tostorehouseId;
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
        sb.append(", leavestockId=").append(leavestockId);
        sb.append(", leavedate=").append(leavedate);
        sb.append(", deptId=").append(deptId);
        sb.append(", storehouseId=").append(storehouseId);
        sb.append(", tostorehouseId=").append(tostorehouseId);
        sb.append(", employeeId=").append(employeeId);
        sb.append(", remark=").append(remark);
        sb.append(", isDel=").append(isDel);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}