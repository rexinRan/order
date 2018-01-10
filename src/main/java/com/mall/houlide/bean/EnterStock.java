package com.mall.houlide.bean;

import java.io.Serializable;
import java.util.Date;

public class EnterStock implements Serializable {
    private static final long serialVersionUID = 1L;
    /**
     * 入库单编号 , 主键(需添加 仓库保管员如何来验证入库单 ?? )
     */
    private Integer enterstockId;
    /**
     * 入库时间
     */
    private Date enterdate;
    /**
     * 入库部门 ,外键 ( 参照 DEPT 表 )
     */
    private Integer deptId;
    /**
     * 所入仓库 ,外键 ( 参照 STOREHOUSE 表)
     */
    private Integer storehouseId;
    /**
     * 入库人 ,  外键 ( 参照 EMPLOYEE 表)
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

    public Integer getEnterstockId() {
        return enterstockId;
    }

    public void setEnterstockId(Integer enterstockId) {
        this.enterstockId = enterstockId;
    }

    public Date getEnterdate() {
        return enterdate;
    }

    public void setEnterdate(Date enterdate) {
        this.enterdate = enterdate;
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
        sb.append(", enterstockId=").append(enterstockId);
        sb.append(", enterdate=").append(enterdate);
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