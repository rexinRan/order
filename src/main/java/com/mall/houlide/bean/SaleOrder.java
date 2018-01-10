package com.mall.houlide.bean;

import java.io.Serializable;
import java.util.Date;

public class SaleOrder implements Serializable {
    private static final long serialVersionUID = 1L;
    /**
     * 合同编号 , 主键
     */
    private Integer saleorderId;
    /**
     * 合同编号 , 主键
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
     * 客户编号, 外键 ( 参照 CUSTOMER 表 )
     */
    private Integer customerId;
    /**
     * 合同主要负责人, 外键 ( 参照 EMPLOYEE 表)
     */
    private Integer employeeId;
    /**
     * 是否已删除:1:未,0:删除了
     */
    private Boolean isDel;

    public Integer getSaleorderId() {
        return saleorderId;
    }

    public void setSaleorderId(Integer saleorderId) {
        this.saleorderId = saleorderId;
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

    public Integer getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Integer customerId) {
        this.customerId = customerId;
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
        sb.append(", saleorderId=").append(saleorderId);
        sb.append(", writedate=").append(writedate);
        sb.append(", insuredate=").append(insuredate);
        sb.append(", enddate=").append(enddate);
        sb.append(", deptId=").append(deptId);
        sb.append(", customerId=").append(customerId);
        sb.append(", employeeId=").append(employeeId);
        sb.append(", isDel=").append(isDel);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}