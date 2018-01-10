package com.mall.houlide.bean;

import java.io.Serializable;
import java.util.Date;

public class OrderManager implements Serializable {
    private static final long serialVersionUID = 1L;
    /**  */
    private String id;
    /**
     * 项目名称
     */
    private String orderName;
    /**
     * 买家名称
     */
    private String orderBuyName;
    /**
     * 销售合同状态
     */
    private Boolean orderXsState;
    /**
     * 采购合同状态
     */
    private Boolean orderCgState;
    /**
     * 厂家款项
     */
    private String orderDeptName;
    /**
     * 质保金
     */
    private String orderZbj;
    /**
     * 质保金到期时间
     */
    private Date orderZbjdqsj;
    /**
     * 签订时间
     */
    private Date orderQdrq;
    /**
     * 备注
     */
    private String remark;
    /**
     * 是否已删除:1:未,0:删除了
     */
    private Boolean state;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getOrderName() {
        return orderName;
    }

    public void setOrderName(String orderName) {
        this.orderName = orderName == null ? null : orderName.trim();
    }

    public String getOrderBuyName() {
        return orderBuyName;
    }

    public void setOrderBuyName(String orderBuyName) {
        this.orderBuyName = orderBuyName == null ? null : orderBuyName.trim();
    }

    public Boolean getOrderXsState() {
        return orderXsState;
    }

    public void setOrderXsState(Boolean orderXsState) {
        this.orderXsState = orderXsState;
    }

    public Boolean getOrderCgState() {
        return orderCgState;
    }

    public void setOrderCgState(Boolean orderCgState) {
        this.orderCgState = orderCgState;
    }

    public String getOrderDeptName() {
        return orderDeptName;
    }

    public void setOrderDeptName(String orderDeptName) {
        this.orderDeptName = orderDeptName == null ? null : orderDeptName.trim();
    }

    public String getOrderZbj() {
        return orderZbj;
    }

    public void setOrderZbj(String orderZbj) {
        this.orderZbj = orderZbj == null ? null : orderZbj.trim();
    }

    public Date getOrderZbjdqsj() {
        return orderZbjdqsj;
    }

    public void setOrderZbjdqsj(Date orderZbjdqsj) {
        this.orderZbjdqsj = orderZbjdqsj;
    }

    public Date getOrderQdrq() {
        return orderQdrq;
    }

    public void setOrderQdrq(Date orderQdrq) {
        this.orderQdrq = orderQdrq;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    public Boolean getState() {
        return state;
    }

    public void setState(Boolean state) {
        this.state = state;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", orderName=").append(orderName);
        sb.append(", orderBuyName=").append(orderBuyName);
        sb.append(", orderXsState=").append(orderXsState);
        sb.append(", orderCgState=").append(orderCgState);
        sb.append(", orderDeptName=").append(orderDeptName);
        sb.append(", orderZbj=").append(orderZbj);
        sb.append(", orderZbjdqsj=").append(orderZbjdqsj);
        sb.append(", orderQdrq=").append(orderQdrq);
        sb.append(", remark=").append(remark);
        sb.append(", state=").append(state);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}