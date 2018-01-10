package com.mall.houlide.bean;

import java.io.Serializable;

public class OrderManagerWithBLOBs extends OrderManager implements Serializable {
    private static final long serialVersionUID = 1L;
    /**
     * 厂家名称
     */
    private byte[] ordDeptName;
    /**
     * 买家款项
     */
    private byte[] orderBuyMoney;

    public byte[] getOrdDeptName() {
        return ordDeptName;
    }

    public void setOrdDeptName(byte[] ordDeptName) {
        this.ordDeptName = ordDeptName;
    }

    public byte[] getOrderBuyMoney() {
        return orderBuyMoney;
    }

    public void setOrderBuyMoney(byte[] orderBuyMoney) {
        this.orderBuyMoney = orderBuyMoney;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", ordDeptName=").append(ordDeptName);
        sb.append(", orderBuyMoney=").append(orderBuyMoney);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}