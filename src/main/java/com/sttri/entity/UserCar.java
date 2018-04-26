package com.sttri.entity;

import java.io.Serializable;
import java.util.Date;

public class UserCar implements Serializable {
    //
    private Integer id;

    //
    private Integer userId;

    //车牌号
    private String carNo;

    //汽车品牌
    private String carBrand;

    //车型
    private String carModels;

    //车架号
    private String carVin;

    //发动机号
    private String carEngine;

    //购买时间
    private String carBuyTime;

    //上一次保养时间
    private String carLastMaintenanceTime;

    //上一次保养里程
    private String carLastMaintenanceMileage;

    //保险时间
    private String carInsuranceTime;

    //下一次保养时间
    private String carNextMaintenanceTime;

    //下一次保养里程
    private String carNextMaintenanceMileage;

    //年检时间
    private String carAnnualTime;

    //违章信息
    private String carIllegal;

    //是否默认 0-否 1-是
    private Integer isDefault;

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

    public String getCarBrand() {
        return carBrand;
    }

    public void setCarBrand(String carBrand) {
        this.carBrand = carBrand == null ? null : carBrand.trim();
    }

    public String getCarModels() {
        return carModels;
    }

    public void setCarModels(String carModels) {
        this.carModels = carModels == null ? null : carModels.trim();
    }

    public String getCarVin() {
        return carVin;
    }

    public void setCarVin(String carVin) {
        this.carVin = carVin == null ? null : carVin.trim();
    }

    public String getCarEngine() {
        return carEngine;
    }

    public void setCarEngine(String carEngine) {
        this.carEngine = carEngine == null ? null : carEngine.trim();
    }

    public String getCarBuyTime() {
        return carBuyTime;
    }

    public void setCarBuyTime(String carBuyTime) {
        this.carBuyTime = carBuyTime == null ? null : carBuyTime.trim();
    }

    public String getCarLastMaintenanceTime() {
        return carLastMaintenanceTime;
    }

    public void setCarLastMaintenanceTime(String carLastMaintenanceTime) {
        this.carLastMaintenanceTime = carLastMaintenanceTime == null ? null : carLastMaintenanceTime.trim();
    }

    public String getCarLastMaintenanceMileage() {
        return carLastMaintenanceMileage;
    }

    public void setCarLastMaintenanceMileage(String carLastMaintenanceMileage) {
        this.carLastMaintenanceMileage = carLastMaintenanceMileage == null ? null : carLastMaintenanceMileage.trim();
    }

    public String getCarInsuranceTime() {
        return carInsuranceTime;
    }

    public void setCarInsuranceTime(String carInsuranceTime) {
        this.carInsuranceTime = carInsuranceTime == null ? null : carInsuranceTime.trim();
    }

    public String getCarNextMaintenanceTime() {
        return carNextMaintenanceTime;
    }

    public void setCarNextMaintenanceTime(String carNextMaintenanceTime) {
        this.carNextMaintenanceTime = carNextMaintenanceTime == null ? null : carNextMaintenanceTime.trim();
    }

    public String getCarNextMaintenanceMileage() {
        return carNextMaintenanceMileage;
    }

    public void setCarNextMaintenanceMileage(String carNextMaintenanceMileage) {
        this.carNextMaintenanceMileage = carNextMaintenanceMileage == null ? null : carNextMaintenanceMileage.trim();
    }

    public String getCarAnnualTime() {
        return carAnnualTime;
    }

    public void setCarAnnualTime(String carAnnualTime) {
        this.carAnnualTime = carAnnualTime == null ? null : carAnnualTime.trim();
    }

    public String getCarIllegal() {
        return carIllegal;
    }

    public void setCarIllegal(String carIllegal) {
        this.carIllegal = carIllegal == null ? null : carIllegal.trim();
    }

    public Integer getIsDefault() {
        return isDefault;
    }

    public void setIsDefault(Integer isDefault) {
        this.isDefault = isDefault;
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
        sb.append(", userId=").append(userId);
        sb.append(", carNo=").append(carNo);
        sb.append(", carBrand=").append(carBrand);
        sb.append(", carModels=").append(carModels);
        sb.append(", carVin=").append(carVin);
        sb.append(", carEngine=").append(carEngine);
        sb.append(", carBuyTime=").append(carBuyTime);
        sb.append(", carLastMaintenanceTime=").append(carLastMaintenanceTime);
        sb.append(", carLastMaintenanceMileage=").append(carLastMaintenanceMileage);
        sb.append(", carInsuranceTime=").append(carInsuranceTime);
        sb.append(", carNextMaintenanceTime=").append(carNextMaintenanceTime);
        sb.append(", carNextMaintenanceMileage=").append(carNextMaintenanceMileage);
        sb.append(", carAnnualTime=").append(carAnnualTime);
        sb.append(", carIllegal=").append(carIllegal);
        sb.append(", isDefault=").append(isDefault);
        sb.append(", addtime=").append(addtime);
        sb.append(", edittime=").append(edittime);
        sb.append("]");
        return sb.toString();
    }
}