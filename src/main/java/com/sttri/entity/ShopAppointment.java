package com.sttri.entity;

import java.io.Serializable;
import java.util.Date;

public class ShopAppointment implements Serializable {
    //
    private Integer id;

    //店铺编号
    private Integer shopId;

    //业务类型 0-洗车 1-保养2-美容 3-维修 255-其他
    private Integer businessType;

    //
    private String businessDate;

    //预约时段编号（8：00—8:30,每半小时一个编号，从0开始，21：30-22:00结束）
    private Integer timeNo;

    //可预约时段业务服务总数量
    private Integer businessTotal;

    //用户联系方式
    private String mobile;

    //备注说明
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

    public Integer getShopId() {
        return shopId;
    }

    public void setShopId(Integer shopId) {
        this.shopId = shopId;
    }

    public Integer getBusinessType() {
        return businessType;
    }

    public void setBusinessType(Integer businessType) {
        this.businessType = businessType;
    }

    public String getBusinessDate() {
        return businessDate;
    }

    public void setBusinessDate(String businessDate) {
        this.businessDate = businessDate == null ? null : businessDate.trim();
    }

    public Integer getTimeNo() {
        return timeNo;
    }

    public void setTimeNo(Integer timeNo) {
        this.timeNo = timeNo;
    }

    public Integer getBusinessTotal() {
        return businessTotal;
    }

    public void setBusinessTotal(Integer businessTotal) {
        this.businessTotal = businessTotal;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile == null ? null : mobile.trim();
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
        sb.append(", shopId=").append(shopId);
        sb.append(", businessType=").append(businessType);
        sb.append(", businessDate=").append(businessDate);
        sb.append(", timeNo=").append(timeNo);
        sb.append(", businessTotal=").append(businessTotal);
        sb.append(", mobile=").append(mobile);
        sb.append(", remark=").append(remark);
        sb.append(", addtime=").append(addtime);
        sb.append(", edittime=").append(edittime);
        sb.append("]");
        return sb.toString();
    }
}