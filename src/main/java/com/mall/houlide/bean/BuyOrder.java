package com.mall.houlide.bean;

import java.io.Serializable;
import java.util.Date;

public class BuyOrder implements Serializable {
    private static final long serialVersionUID = 1L;
    /**
     * 进货合同编号 , 主键
     */
    private Integer buyorderId;
    /**
     * 合同签订日期
     */
    private Date writedate;
    /**
     * 合同生效日期
     */
    private Date insuredate;
    /**
     * 合同到期日期
     */
    private Date enddate;
    /**
     * 签订部门, 外键 ( 参照 DEPT 表 )
     */
    private Integer deptId;
    /**
     * 供应商,   外键 ( 参照 SUPPLIER 表 )
     */
    private Integer supplierId;
    /**
     * 合同主要负责人, 外键 ( 参照 EMPLOYEE 表)
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

    public Integer getBuyorderId() {
        return buyorderId;
    }

    public void setBuyorderId(Integer buyorderId) {
        this.buyorderId = buyorderId;
    }

    public Date getWritedate() {
        return writedate;
    }

    public void setWritedate(Date writedate) {
        this.writedate = writedate;
    }

    public Date getInsuredate() {
        return insuredate;
    }

    public void setInsuredate(Date insuredate) {
        this.insuredate = insuredate;
    }

    public Date getEnddate() {
        return enddate;
    }

    public void setEnddate(Date enddate) {
        this.enddate = enddate;
    }

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
        sb.append(", buyorderId=").append(buyorderId);
        sb.append(", writedate=").append(writedate);
        sb.append(", insuredate=").append(insuredate);
        sb.append(", enddate=").append(enddate);
        sb.append(", deptId=").append(deptId);
        sb.append(", supplierId=").append(supplierId);
        sb.append(", employeeId=").append(employeeId);
        sb.append(", remark=").append(remark);
        sb.append(", isDel=").append(isDel);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}