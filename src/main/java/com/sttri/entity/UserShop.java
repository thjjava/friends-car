package com.sttri.entity;

import java.io.Serializable;
import java.util.Date;

public class UserShop implements Serializable {
    //
    private Integer id;

    //用户编号
    private Integer userId;

    //关注店铺编号
    private Integer shopId;

    //用户类型 N-新人 A-高频高价 B-高频低价 C-低频高价 D-低频低价 E-其他
    private String type;

    //关注状态 0-关注 1-取关
    private Integer status;

    //
    private Date attentionTime;

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

    public Integer getShopId() {
        return shopId;
    }

    public void setShopId(Integer shopId) {
        this.shopId = shopId;
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
        sb.append(", userId=").append(userId);
        sb.append(", shopId=").append(shopId);
        sb.append(", type=").append(type);
        sb.append(", status=").append(status);
        sb.append(", attentionTime=").append(attentionTime);
        sb.append("]");
        return sb.toString();
    }
}