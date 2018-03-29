package com.sttri.entity;

import java.io.Serializable;
import java.util.Date;

public class OrderComment implements Serializable {
    //
    private Integer id;

    //客户编号
    private Integer userId;

    //订单编号
    private Integer orderId;

    //店铺编号
    private Integer shopId;

    //服务类型 0-洗车 1-保养 2-美容 3-维修 255-其他
    private Integer businessType;

    //评论状态 0-显示1-不显示
    private Integer flag;

    //整体满意度(星级)0---5
    private Integer serviceLevel;

    //排队时长(星级)0---5
    private Integer waitLevel;

    //服务态度(星级)0---5
    private Integer attitudeLevel;

    //服务质量(星级)0---5
    private Integer qualityLevel;

    //服务时间(星级)0---5
    private Integer timelenLevel;

    //客户评论内容
    private String content;

    //店铺对评论反馈
    private String reply;

    //下次服务建议
    private String nextServiceAdvice;

    //
    private Date commentTime;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getOrderId() {
        return orderId;
    }

    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
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

    public Integer getFlag() {
        return flag;
    }

    public void setFlag(Integer flag) {
        this.flag = flag;
    }

    public Integer getServiceLevel() {
        return serviceLevel;
    }

    public void setServiceLevel(Integer serviceLevel) {
        this.serviceLevel = serviceLevel;
    }

    public Integer getWaitLevel() {
        return waitLevel;
    }

    public void setWaitLevel(Integer waitLevel) {
        this.waitLevel = waitLevel;
    }

    public Integer getAttitudeLevel() {
        return attitudeLevel;
    }

    public void setAttitudeLevel(Integer attitudeLevel) {
        this.attitudeLevel = attitudeLevel;
    }

    public Integer getQualityLevel() {
        return qualityLevel;
    }

    public void setQualityLevel(Integer qualityLevel) {
        this.qualityLevel = qualityLevel;
    }

    public Integer getTimelenLevel() {
        return timelenLevel;
    }

    public void setTimelenLevel(Integer timelenLevel) {
        this.timelenLevel = timelenLevel;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }

    public String getReply() {
        return reply;
    }

    public void setReply(String reply) {
        this.reply = reply == null ? null : reply.trim();
    }

    public String getNextServiceAdvice() {
        return nextServiceAdvice;
    }

    public void setNextServiceAdvice(String nextServiceAdvice) {
        this.nextServiceAdvice = nextServiceAdvice == null ? null : nextServiceAdvice.trim();
    }

    public Date getCommentTime() {
        return commentTime;
    }

    public void setCommentTime(Date commentTime) {
        this.commentTime = commentTime;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", userId=").append(userId);
        sb.append(", orderId=").append(orderId);
        sb.append(", shopId=").append(shopId);
        sb.append(", businessType=").append(businessType);
        sb.append(", flag=").append(flag);
        sb.append(", serviceLevel=").append(serviceLevel);
        sb.append(", waitLevel=").append(waitLevel);
        sb.append(", attitudeLevel=").append(attitudeLevel);
        sb.append(", qualityLevel=").append(qualityLevel);
        sb.append(", timelenLevel=").append(timelenLevel);
        sb.append(", content=").append(content);
        sb.append(", reply=").append(reply);
        sb.append(", nextServiceAdvice=").append(nextServiceAdvice);
        sb.append(", commentTime=").append(commentTime);
        sb.append("]");
        return sb.toString();
    }
}