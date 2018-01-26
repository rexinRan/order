package com.mall.houlide.bean;

import java.io.Serializable;
import java.util.Date;

public class Employee implements Serializable {
    private static final long serialVersionUID = 1L;
    /**
     * 员工编号
     */
    private Integer employeeId;
    /**
     * 所属部门编号
     */
    private Integer deptId;
    /**
     * 姓名
     */
    private String empName;
    /**
     * 职务
     */
    private String duty;
    /**
     * 性别
     */
    private String gender;
    /**
     * 出生日期
     */
    private Date birthdate;
    /**
     * 合同签订日期
     */
    private Date hiredate;
    /**
     * 合同到期日
     */
    private Date maturedate;
    /**
     * 身份证号
     */
    private String identitycard;
    /**
     * 地址
     */
    private String address;
    /**
     * 电话
     */
    private String phone;
    /**
     * Email
     */

    private Dept dept;

    private String email;

    public Integer getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(Integer employeeId) {
        this.employeeId = employeeId;
    }

    public Integer getDeptId() {
        return deptId;
    }

    public void setDeptId(Integer deptId) {
        this.deptId = deptId;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName == null ? null : empName.trim();
    }

    public String getDuty() {
        return duty;
    }

    public void setDuty(String duty) {
        this.duty = duty == null ? null : duty.trim();
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender == null ? null : gender.trim();
    }

    public Date getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(Date birthdate) {
        this.birthdate = birthdate;
    }

    public Date getHiredate() {
        return hiredate;
    }

    public void setHiredate(Date hiredate) {
        this.hiredate = hiredate;
    }

    public Date getMaturedate() {
        return maturedate;
    }

    public void setMaturedate(Date maturedate) {
        this.maturedate = maturedate;
    }

    public String getIdentitycard() {
        return identitycard;
    }

    public void setIdentitycard(String identitycard) {
        this.identitycard = identitycard == null ? null : identitycard.trim();
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", employeeId=").append(employeeId);
        sb.append(", deptId=").append(deptId);
        sb.append(", empName=").append(empName);
        sb.append(", duty=").append(duty);
        sb.append(", gender=").append(gender);
        sb.append(", birthdate=").append(birthdate);
        sb.append(", hiredate=").append(hiredate);
        sb.append(", maturedate=").append(maturedate);
        sb.append(", identitycard=").append(identitycard);
        sb.append(", address=").append(address);
        sb.append(", phone=").append(phone);
        sb.append(", email=").append(email);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}