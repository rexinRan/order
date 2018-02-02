package com.mall.houlide.bean;

import java.io.Serializable;

public class OrderState implements Serializable {
    private static final long serialVersionUID = 1L;
    /**
     * 状态id
     */
    private String stateId;
    /**
     * 状态名字
     */
    private String stateName;

    public String getStateId() {
        return stateId;
    }

    public void setStateId(String stateId) {
        this.stateId = stateId == null ? null : stateId.trim();
    }

    public String getStateName() {
        return stateName;
    }

    public void setStateName(String stateName) {
        this.stateName = stateName == null ? null : stateName.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", stateId=").append(stateId);
        sb.append(", stateName=").append(stateName);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}