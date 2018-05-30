package com.sttri.vo;

import java.io.Serializable;
import java.util.Date;

public class OrderVo implements Serializable {
    //
    private Integer id;

    //订单编号
    private String orderNo;

    //店铺编号
    private Integer shopId;

    //预约时段编号
    private Integer appointmentId;

    //服务类型 0-洗车 1-保养 2-美容 3-维修 255-其他
    private Integer businessType;

    //订单状态 0-待服务 1-服务中 2-代付款 3-已完成
    private Integer status;

    //是否评论 0-否 1-是
    private Integer isComment;

    //用户编号
    private Integer userId;

    //车辆编号
    private String carNo;

    //服务来源 0-线下 1-微信 2-电商 3-其他
    private Integer orderSource;

    //订单业务时间
    private String orderTime;

    //完工时间
    private String payTime;

    //订单金额
    private Long orderFee;

    //服务专员
    private String serviceEmployee;

    //服务过程图片1
    private String servicePic1;

    //服务过程图片2
    private String servicePic2;

    //服务过程图片3
    private String servicePic3;

    //服务过程图片4
    private String servicePic4;

    //服务内容
    private String serviceContent;

    //服务建议
    private String serviceSuggest;

    //服务保障
    private String serviceEnsure;

    //车辆当前里程
    private String carCurrentMileage;

    //结算状态 0-无需结算 1-已结算 2-未结算
    private Integer payStatus;

    //结算金额
    private Long amount;

    //备注
    private String remark;

    //订单创建时间
    private Date orderCreate;

    //修改时间
    private Date edittime;
    
    //店铺名称
    private String shopName;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getOrderNo() {
        return orderNo;
    }

    public void setOrderNo(String orderNo) {
        this.orderNo = orderNo == null ? null : orderNo.trim();
    }

    public Integer getShopId() {
        return shopId;
    }

    public void setShopId(Integer shopId) {
        this.shopId = shopId;
    }

    public Integer getAppointmentId() {
        return appointmentId;
    }

    public void setAppointmentId(Integer appointmentId) {
        this.appointmentId = appointmentId;
    }

    public Integer getBusinessType() {
        return businessType;
    }

    public void setBusinessType(Integer businessType) {
        this.businessType = businessType;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Integer getIsComment() {
        return isComment;
    }

    public void setIsComment(Integer isComment) {
        this.isComment = isComment;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getCarNo() {
        return carNo;
    }

    public void setCarNo(String carNo) {
        this.carNo = carNo == null ? null : carNo.trim();
    }

    public Integer getOrderSource() {
        return orderSource;
    }

    public void setOrderSource(Integer orderSource) {
        this.orderSource = orderSource;
    }

    public String getOrderTime() {
        return orderTime;
    }

    public void setOrderTime(String orderTime) {
        this.orderTime = orderTime == null ? null : orderTime.trim();
    }

    public String getPayTime() {
        return payTime;
    }

    public void setPayTime(String payTime) {
        this.payTime = payTime == null ? null : payTime.trim();
    }

    public Long getOrderFee() {
        return orderFee;
    }

    public void setOrderFee(Long orderFee) {
        this.orderFee = orderFee;
    }

    public String getServiceEmployee() {
        return serviceEmployee;
    }

    public void setServiceEmployee(String serviceEmployee) {
        this.serviceEmployee = serviceEmployee == null ? null : serviceEmployee.trim();
    }

    public String getServicePic1() {
        return servicePic1;
    }

    public void setServicePic1(String servicePic1) {
        this.servicePic1 = servicePic1 == null ? null : servicePic1.trim();
    }

    public String getServicePic2() {
        return servicePic2;
    }

    public void setServicePic2(String servicePic2) {
        this.servicePic2 = servicePic2 == null ? null : servicePic2.trim();
    }

    public String getServicePic3() {
        return servicePic3;
    }

    public void setServicePic3(String servicePic3) {
        this.servicePic3 = servicePic3 == null ? null : servicePic3.trim();
    }

    public String getServicePic4() {
        return servicePic4;
    }

    public void setServicePic4(String servicePic4) {
        this.servicePic4 = servicePic4 == null ? null : servicePic4.trim();
    }

    public String getServiceContent() {
        return serviceContent;
    }

    public void setServiceContent(String serviceContent) {
        this.serviceContent = serviceContent == null ? null : serviceContent.trim();
    }

    public String getServiceSuggest() {
        return serviceSuggest;
    }

    public void setServiceSuggest(String serviceSuggest) {
        this.serviceSuggest = serviceSuggest == null ? null : serviceSuggest.trim();
    }

    public String getServiceEnsure() {
        return serviceEnsure;
    }

    public void setServiceEnsure(String serviceEnsure) {
        this.serviceEnsure = serviceEnsure == null ? null : serviceEnsure.trim();
    }

    public String getCarCurrentMileage() {
        return carCurrentMileage;
    }

    public void setCarCurrentMileage(String carCurrentMileage) {
        this.carCurrentMileage = carCurrentMileage == null ? null : carCurrentMileage.trim();
    }

    public Integer getPayStatus() {
        return payStatus;
    }

    public void setPayStatus(Integer payStatus) {
        this.payStatus = payStatus;
    }

    public Long getAmount() {
        return amount;
    }

    public void setAmount(Long amount) {
        this.amount = amount;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    public Date getOrderCreate() {
        return orderCreate;
    }

    public void setOrderCreate(Date orderCreate) {
        this.orderCreate = orderCreate;
    }

    public Date getEdittime() {
        return edittime;
    }

    public void setEdittime(Date edittime) {
        this.edittime = edittime;
    }

    
	public String getShopName() {
		return shopName;
	}

	public void setShopName(String shopName) {
		this.shopName = shopName;
	}

	@Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", orderNo=").append(orderNo);
        sb.append(", shopId=").append(shopId);
        sb.append(", appointmentId=").append(appointmentId);
        sb.append(", businessType=").append(businessType);
        sb.append(", status=").append(status);
        sb.append(", isComment=").append(isComment);
        sb.append(", userId=").append(userId);
        sb.append(", carNo=").append(carNo);
        sb.append(", orderSource=").append(orderSource);
        sb.append(", orderTime=").append(orderTime);
        sb.append(", payTime=").append(payTime);
        sb.append(", orderFee=").append(orderFee);
        sb.append(", serviceEmployee=").append(serviceEmployee);
        sb.append(", servicePic1=").append(servicePic1);
        sb.append(", servicePic2=").append(servicePic2);
        sb.append(", servicePic3=").append(servicePic3);
        sb.append(", servicePic4=").append(servicePic4);
        sb.append(", serviceContent=").append(serviceContent);
        sb.append(", serviceSuggest=").append(serviceSuggest);
        sb.append(", serviceEnsure=").append(serviceEnsure);
        sb.append(", carCurrentMileage=").append(carCurrentMileage);
        sb.append(", payStatus=").append(payStatus);
        sb.append(", amount=").append(amount);
        sb.append(", remark=").append(remark);
        sb.append(", orderCreate=").append(orderCreate);
        sb.append(", edittime=").append(edittime);
        sb.append(", shopName=").append(shopName);
        sb.append("]");
        return sb.toString();
    }
}