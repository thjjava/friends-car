package com.sttri.entity;

import java.io.Serializable;
import java.util.Date;

public class SysUser implements Serializable {
    //
    private Integer id;

    //微信ID
    private String wxid;

    //用户姓名
    private String userName;

    //昵称
    private String nickname;

    //性别 0-男 1-女 2-其他
    private Integer sex;

    //联系方式
    private String mobile;

    //生日
    private String birthday;

    //所在城市
    private String city;

    //详细地址
    private String address;

    //用户类型 N-新人 A-高频高价 B-高频低价 C-低频高价 D-低频低价 E-其他
    private String type;

    //用户状态 0-正式 1-注销
    private Integer status;

    //用户标签
    private String label;

    //是否接收年检推荐 0-否 1-是
    private Integer loveMot;

    //是否接收保险推荐 0-否 1-是
    private Integer loveInsurance;

    //是否接收保养推荐 0-否 1-是
    private Integer loveMaintain;

    //
    private String remark;

    //
    private Date addtime;

    //
    private Date edittime;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getWxid() {
        return wxid;
    }

    public void setWxid(String wxid) {
        this.wxid = wxid == null ? null : wxid.trim();
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName == null ? null : userName.trim();
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname == null ? null : nickname.trim();
    }

    public Integer getSex() {
        return sex;
    }

    public void setSex(Integer sex) {
        this.sex = sex;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile == null ? null : mobile.trim();
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday == null ? null : birthday.trim();
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city == null ? null : city.trim();
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type == null ? null : type.trim();
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label == null ? null : label.trim();
    }

    public Integer getLoveMot() {
        return loveMot;
    }

    public void setLoveMot(Integer loveMot) {
        this.loveMot = loveMot;
    }

    public Integer getLoveInsurance() {
        return loveInsurance;
    }

    public void setLoveInsurance(Integer loveInsurance) {
        this.loveInsurance = loveInsurance;
    }

    public Integer getLoveMaintain() {
        return loveMaintain;
    }

    public void setLoveMaintain(Integer loveMaintain) {
        this.loveMaintain = loveMaintain;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    public Date getAddtime() {
        return addtime;
    }

    public void setAddtime(Date addtime) {
        this.addtime = addtime;
    }

    public Date getEdittime() {
        return edittime;
    }

    public void setEdittime(Date edittime) {
        this.edittime = edittime;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", wxid=").append(wxid);
        sb.append(", userName=").append(userName);
        sb.append(", nickname=").append(nickname);
        sb.append(", sex=").append(sex);
        sb.append(", mobile=").append(mobile);
        sb.append(", birthday=").append(birthday);
        sb.append(", city=").append(city);
        sb.append(", address=").append(address);
        sb.append(", type=").append(type);
        sb.append(", status=").append(status);
        sb.append(", label=").append(label);
        sb.append(", loveMot=").append(loveMot);
        sb.append(", loveInsurance=").append(loveInsurance);
        sb.append(", loveMaintain=").append(loveMaintain);
        sb.append(", remark=").append(remark);
        sb.append(", addtime=").append(addtime);
        sb.append(", edittime=").append(edittime);
        sb.append("]");
        return sb.toString();
    }
}