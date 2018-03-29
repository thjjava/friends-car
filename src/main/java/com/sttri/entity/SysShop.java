package com.sttri.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class SysShop implements Serializable {
    //
    private Integer id;

    //店铺编号
    private String shopNo;

    //店铺名称
    private String shopName;

    //地址
    private String address;

    //每天营业开始时间，默认 HH:mm:ss
    private String businessStartTime;

    //每天营业结束时间，默认 HH:mm:ss
    private String businessEndTime;

    //联系人
    private String contact;

    //联系方式
    private String mobile;

    //纬度
    private String lat;

    //经度
    private String lon;

    //店铺专属二维码
    private String shopQrcode;

    //员工专属二维码
    private String employeesQrcode;

    //店铺综合评分
    private BigDecimal score;

    //店铺图片
    private String picture1;

    //
    private String picture2;

    //
    private String picture3;

    //
    private String picture4;

    //
    private String picture5;

    //
    private String picture6;

    //开户日期
    private Date registerDate;

    //修改日期
    private Date edittime;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getShopNo() {
        return shopNo;
    }

    public void setShopNo(String shopNo) {
        this.shopNo = shopNo == null ? null : shopNo.trim();
    }

    public String getShopName() {
        return shopName;
    }

    public void setShopName(String shopName) {
        this.shopName = shopName == null ? null : shopName.trim();
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    public String getBusinessStartTime() {
        return businessStartTime;
    }

    public void setBusinessStartTime(String businessStartTime) {
        this.businessStartTime = businessStartTime == null ? null : businessStartTime.trim();
    }

    public String getBusinessEndTime() {
        return businessEndTime;
    }

    public void setBusinessEndTime(String businessEndTime) {
        this.businessEndTime = businessEndTime == null ? null : businessEndTime.trim();
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact == null ? null : contact.trim();
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile == null ? null : mobile.trim();
    }

    public String getLat() {
        return lat;
    }

    public void setLat(String lat) {
        this.lat = lat == null ? null : lat.trim();
    }

    public String getLon() {
        return lon;
    }

    public void setLon(String lon) {
        this.lon = lon == null ? null : lon.trim();
    }

    public String getShopQrcode() {
        return shopQrcode;
    }

    public void setShopQrcode(String shopQrcode) {
        this.shopQrcode = shopQrcode == null ? null : shopQrcode.trim();
    }

    public String getEmployeesQrcode() {
        return employeesQrcode;
    }

    public void setEmployeesQrcode(String employeesQrcode) {
        this.employeesQrcode = employeesQrcode == null ? null : employeesQrcode.trim();
    }

    public BigDecimal getScore() {
        return score;
    }

    public void setScore(BigDecimal score) {
        this.score = score;
    }

    public String getPicture1() {
        return picture1;
    }

    public void setPicture1(String picture1) {
        this.picture1 = picture1 == null ? null : picture1.trim();
    }

    public String getPicture2() {
        return picture2;
    }

    public void setPicture2(String picture2) {
        this.picture2 = picture2 == null ? null : picture2.trim();
    }

    public String getPicture3() {
        return picture3;
    }

    public void setPicture3(String picture3) {
        this.picture3 = picture3 == null ? null : picture3.trim();
    }

    public String getPicture4() {
        return picture4;
    }

    public void setPicture4(String picture4) {
        this.picture4 = picture4 == null ? null : picture4.trim();
    }

    public String getPicture5() {
        return picture5;
    }

    public void setPicture5(String picture5) {
        this.picture5 = picture5 == null ? null : picture5.trim();
    }

    public String getPicture6() {
        return picture6;
    }

    public void setPicture6(String picture6) {
        this.picture6 = picture6 == null ? null : picture6.trim();
    }

    public Date getRegisterDate() {
        return registerDate;
    }

    public void setRegisterDate(Date registerDate) {
        this.registerDate = registerDate;
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
        sb.append(", shopNo=").append(shopNo);
        sb.append(", shopName=").append(shopName);
        sb.append(", address=").append(address);
        sb.append(", businessStartTime=").append(businessStartTime);
        sb.append(", businessEndTime=").append(businessEndTime);
        sb.append(", contact=").append(contact);
        sb.append(", mobile=").append(mobile);
        sb.append(", lat=").append(lat);
        sb.append(", lon=").append(lon);
        sb.append(", shopQrcode=").append(shopQrcode);
        sb.append(", employeesQrcode=").append(employeesQrcode);
        sb.append(", score=").append(score);
        sb.append(", picture1=").append(picture1);
        sb.append(", picture2=").append(picture2);
        sb.append(", picture3=").append(picture3);
        sb.append(", picture4=").append(picture4);
        sb.append(", picture5=").append(picture5);
        sb.append(", picture6=").append(picture6);
        sb.append(", registerDate=").append(registerDate);
        sb.append(", edittime=").append(edittime);
        sb.append("]");
        return sb.toString();
    }
}