package com.sttri.entity;

import java.io.Serializable;
import java.util.Date;

public class SysCar implements Serializable {
    //
    private Integer id;

    //
    private String carBrand;

    //车系
    private String carSeries;

    //变速箱(0-手动 1-自动)
    private String carModels;

    //
    private Integer carTransmission;

    //国别
    private String carCountry;

    //座位(0-5座，1-7座，2-其他)
    private Integer carSeat;

    //是否默认显示 0-是 1-否
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

    public String getCarBrand() {
        return carBrand;
    }

    public void setCarBrand(String carBrand) {
        this.carBrand = carBrand == null ? null : carBrand.trim();
    }

    public String getCarSeries() {
        return carSeries;
    }

    public void setCarSeries(String carSeries) {
        this.carSeries = carSeries == null ? null : carSeries.trim();
    }

    public String getCarModels() {
        return carModels;
    }

    public void setCarModels(String carModels) {
        this.carModels = carModels == null ? null : carModels.trim();
    }

    public Integer getCarTransmission() {
        return carTransmission;
    }

    public void setCarTransmission(Integer carTransmission) {
        this.carTransmission = carTransmission;
    }

    public String getCarCountry() {
        return carCountry;
    }

    public void setCarCountry(String carCountry) {
        this.carCountry = carCountry == null ? null : carCountry.trim();
    }

    public Integer getCarSeat() {
        return carSeat;
    }

    public void setCarSeat(Integer carSeat) {
        this.carSeat = carSeat;
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
        sb.append(", carBrand=").append(carBrand);
        sb.append(", carSeries=").append(carSeries);
        sb.append(", carModels=").append(carModels);
        sb.append(", carTransmission=").append(carTransmission);
        sb.append(", carCountry=").append(carCountry);
        sb.append(", carSeat=").append(carSeat);
        sb.append(", isDefault=").append(isDefault);
        sb.append(", addtime=").append(addtime);
        sb.append(", edittime=").append(edittime);
        sb.append("]");
        return sb.toString();
    }
}