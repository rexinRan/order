package com.mall.houlide.bean;

import java.io.Serializable;
import java.util.Date;

public class Buy implements Serializable {
    private static final long serialVersionUID = 1L;
    /**
     * 进货编号 , 主键
     */
    private Integer buyId;
    /**
     * 进货日期
     */
    private Date comedate;
    /**
     * 进货部门, 外键 ( 参照 DEPT 表 )
     */
    private Integer deptId;
    /**
     * 验货人,   外键 ( 参照 EMPLOYEE 表)
     */
    private Integer employeeId;
    /**
     * 是否已删除:1:未,0:删除了
     */
    private Boolean isDel;

    public Integer getBuyId() {
        return buyId;
    }

    public void setBuyId(Integer buyId) {
        this.buyId = buyId;
    }

    public Date getComedate() {
        return comedate;
    }

    public void setComedate(Date comedate) {
        this.comedate = comedate;
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
        sb.append(", buyId=").append(buyId);
        sb.append(", comedate=").append(comedate);
        sb.append(", deptId=").append(deptId);
        sb.append(", employeeId=").append(employeeId);
        sb.append(", isDel=").append(isDel);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}