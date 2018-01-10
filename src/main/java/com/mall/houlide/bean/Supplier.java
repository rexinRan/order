package com.mall.houlide.bean;

import java.io.Serializable;

public class Supplier implements Serializable {
    private static final long serialVersionUID = 1L;
    /**
     * 供应商编号
     */
    private Integer supplierId;
    /**
     * 供应商名字
     */
    private String supName;
    /**
     * 供应商地址
     */
    private String address;
    /**
     * 联系方式
     */
    private String phone;
    /**
     * 传真
     */
    private String fax;
    /**
     * 邮箱
     */
    private String postalcode;
    /**
     * 联系人
     */
    private String constactperson;
    /**
     * 备注
     */
    private String remak;
    /**
     * 是否已删除:1:未,0:删除了
     */
    private Boolean isDel;

    public Integer getSupplierId() {
        return supplierId;
    }

    public void setSupplierId(Integer supplierId) {
        this.supplierId = supplierId;
    }

    public String getSupName() {
        return supName;
    }

    public void setSupName(String supName) {
        this.supName = supName == null ? null : supName.trim();
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

    public String getFax() {
        return fax;
    }

    public void setFax(String fax) {
        this.fax = fax == null ? null : fax.trim();
    }

    public String getPostalcode() {
        return postalcode;
    }

    public void setPostalcode(String postalcode) {
        this.postalcode = postalcode == null ? null : postalcode.trim();
    }

    public String getConstactperson() {
        return constactperson;
    }

    public void setConstactperson(String constactperson) {
        this.constactperson = constactperson == null ? null : constactperson.trim();
    }

    public String getRemak() {
        return remak;
    }

    public void setRemak(String remak) {
        this.remak = remak == null ? null : remak.trim();
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
        sb.append(", supplierId=").append(supplierId);
        sb.append(", supName=").append(supName);
        sb.append(", address=").append(address);
        sb.append(", phone=").append(phone);
        sb.append(", fax=").append(fax);
        sb.append(", postalcode=").append(postalcode);
        sb.append(", constactperson=").append(constactperson);
        sb.append(", remak=").append(remak);
        sb.append(", isDel=").append(isDel);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}