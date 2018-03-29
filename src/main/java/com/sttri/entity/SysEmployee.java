package com.sttri.entity;

import java.io.Serializable;
import java.util.Date;

public class SysEmployee implements Serializable {
    //
    private Integer id;

    //员工编号
    private String employeeNo;

    //微信ID
    private String wxid;

    //昵称
    private String nickname;

    //性别 0-男 1-女 2-其他
    private Integer sex;

    //所在城市
    private String city;

    //联系方式
    private String mobile;

    //工作性质 0-boss 1-接待 2-客服 3-营销 4-技术
    private Integer type;

    //状态 0-在职 1-离职
    private Integer status;

    //关注店铺编号
    private Integer shopId;

    //关注店铺时间
    private Date attentionTime;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getEmployeeNo() {
        return employeeNo;
    }

    public void setEmployeeNo(String employeeNo) {
        this.employeeNo = employeeNo == null ? null : employeeNo.trim();
    }

    public String getWxid() {
        return wxid;
    }

    public void setWxid(String wxid) {
        this.wxid = wxid == null ? null : wxid.trim();
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

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city == null ? null : city.trim();
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile == null ? null : mobile.trim();
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Integer getShopId() {
        return shopId;
    }

    public void setShopId(Integer shopId) {
        this.shopId = shopId;
    }

    public Date getAttentionTime() {
        return attentionTime;
    }

    public void setAttentionTime(Date attentionTime) {
        this.attentionTime = attentionTime;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", employeeNo=").append(employeeNo);
        sb.append(", wxid=").append(wxid);
        sb.append(", nickname=").append(nickname);
        sb.append(", sex=").append(sex);
        sb.append(", city=").append(city);
        sb.append(", mobile=").append(mobile);
        sb.append(", type=").append(type);
        sb.append(", status=").append(status);
        sb.append(", shopId=").append(shopId);
        sb.append(", attentionTime=").append(attentionTime);
        sb.append("]");
        return sb.toString();
    }
}