package com.sttri.entity;

import java.io.Serializable;
import java.util.Date;

public class ShopBusiness implements Serializable {
    //
    private Integer id;

    //店铺编号
    private Integer shopId;

    //业务类型 0-洗车 1-保养2-美容 3-维修 255-其他
    private Integer businessType;

    //定金
    private Long priceLow;

    //结算标准 ≤100  5%，100~500 4%，500~1000  3%，1000以上 2%
    private String priceRule;

    //5座轿车价格
    private Long carPrice;

    //
    private Long suvPrice;

    //业务服务描述
    private String businessDesc;

    //业务收费描述
    private String priceDesc;

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

    public Long getPriceLow() {
        return priceLow;
    }

    public void setPriceLow(Long priceLow) {
        this.priceLow = priceLow;
    }

    public String getPriceRule() {
        return priceRule;
    }

    public void setPriceRule(String priceRule) {
        this.priceRule = priceRule == null ? null : priceRule.trim();
    }

    public Long getCarPrice() {
        return carPrice;
    }

    public void setCarPrice(Long carPrice) {
        this.carPrice = carPrice;
    }

    public Long getSuvPrice() {
        return suvPrice;
    }

    public void setSuvPrice(Long suvPrice) {
        this.suvPrice = suvPrice;
    }

    public String getBusinessDesc() {
        return businessDesc;
    }

    public void setBusinessDesc(String businessDesc) {
        this.businessDesc = businessDesc == null ? null : businessDesc.trim();
    }

    public String getPriceDesc() {
        return priceDesc;
    }

    public void setPriceDesc(String priceDesc) {
        this.priceDesc = priceDesc == null ? null : priceDesc.trim();
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
        sb.append(", priceLow=").append(priceLow);
        sb.append(", priceRule=").append(priceRule);
        sb.append(", carPrice=").append(carPrice);
        sb.append(", suvPrice=").append(suvPrice);
        sb.append(", businessDesc=").append(businessDesc);
        sb.append(", priceDesc=").append(priceDesc);
        sb.append(", addtime=").append(addtime);
        sb.append(", edittime=").append(edittime);
        sb.append("]");
        return sb.toString();
    }
}