package com.mall.houlide.bean;

import java.io.Serializable;

public class User implements Serializable {
    private static final long serialVersionUID = 1L;
    /**
     * 系统人员id
     */
    private String userId;
    /**
     * 用户头像
     */
    private String userImg;
    /**
     * 姓名
     */
    private String userName;
    /**
     * 密码
     */
    private String userPwd;
    /**
     * 分组
     */
    private String belGroup;
    /**
     * 类型
     */
    private String divType;
    /**
     * 用户权限
     */
    private String userAuth;
    /**
     * 权限类型
     */
    private String authType;
    /**
     * 用户状态
     */
    private String userStatus;
    /**
     * 创建人
     */
    private String createUser;
    /**
     * 创建日期
     */
    private String createDate;
    /**
     * 创建时间
     */
    private String createTime;
    /**
     * 审核人
     */
    private String apprUser;
    /**
     * 审核日期
     */
    private String apprDate;
    /**
     * 审核时间
     */
    private String apprTime;
    /**
     * 备注
     */
    private String remark;
    /**
     * 是否已删除:1:未,0:删除了
     */
    private Boolean isDel;

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId == null ? null : userId.trim();
    }

    public String getUserImg() {
        return userImg;
    }

    public void setUserImg(String userImg) {
        this.userImg = userImg == null ? null : userImg.trim();
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName == null ? null : userName.trim();
    }

    public String getUserPwd() {
        return userPwd;
    }

    public void setUserPwd(String userPwd) {
        this.userPwd = userPwd == null ? null : userPwd.trim();
    }

    public String getBelGroup() {
        return belGroup;
    }

    public void setBelGroup(String belGroup) {
        this.belGroup = belGroup == null ? null : belGroup.trim();
    }

    public String getDivType() {
        return divType;
    }

    public void setDivType(String divType) {
        this.divType = divType == null ? null : divType.trim();
    }

    public String getUserAuth() {
        return userAuth;
    }

    public void setUserAuth(String userAuth) {
        this.userAuth = userAuth == null ? null : userAuth.trim();
    }

    public String getAuthType() {
        return authType;
    }

    public void setAuthType(String authType) {
        this.authType = authType == null ? null : authType.trim();
    }

    public String getUserStatus() {
        return userStatus;
    }

    public void setUserStatus(String userStatus) {
        this.userStatus = userStatus == null ? null : userStatus.trim();
    }

    public String getCreateUser() {
        return createUser;
    }

    public void setCreateUser(String createUser) {
        this.createUser = createUser == null ? null : createUser.trim();
    }

    public String getCreateDate() {
        return createDate;
    }

    public void setCreateDate(String createDate) {
        this.createDate = createDate == null ? null : createDate.trim();
    }

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime == null ? null : createTime.trim();
    }

    public String getApprUser() {
        return apprUser;
    }

    public void setApprUser(String apprUser) {
        this.apprUser = apprUser == null ? null : apprUser.trim();
    }

    public String getApprDate() {
        return apprDate;
    }

    public void setApprDate(String apprDate) {
        this.apprDate = apprDate == null ? null : apprDate.trim();
    }

    public String getApprTime() {
        return apprTime;
    }

    public void setApprTime(String apprTime) {
        this.apprTime = apprTime == null ? null : apprTime.trim();
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
        sb.append(", userId=").append(userId);
        sb.append(", userImg=").append(userImg);
        sb.append(", userName=").append(userName);
        sb.append(", userPwd=").append(userPwd);
        sb.append(", belGroup=").append(belGroup);
        sb.append(", divType=").append(divType);
        sb.append(", userAuth=").append(userAuth);
        sb.append(", authType=").append(authType);
        sb.append(", userStatus=").append(userStatus);
        sb.append(", createUser=").append(createUser);
        sb.append(", createDate=").append(createDate);
        sb.append(", createTime=").append(createTime);
        sb.append(", apprUser=").append(apprUser);
        sb.append(", apprDate=").append(apprDate);
        sb.append(", apprTime=").append(apprTime);
        sb.append(", remark=").append(remark);
        sb.append(", isDel=").append(isDel);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}