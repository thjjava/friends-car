package com.sttri.entity;

import java.io.Serializable;
import java.util.Date;

public class CarBrand implements Serializable {
    //
    private Integer id;

    //车系
    private String carLetter;

    //品牌
    private String carBrand;

    //变速箱(0-手动 1-自动)
    private String carLogo;

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

    public String getCarLetter() {
        return carLetter;
    }

    public void setCarLetter(String carLetter) {
        this.carLetter = carLetter == null ? null : carLetter.trim();
    }

    public String getCarBrand() {
        return carBrand;
    }

    public void setCarBrand(String carBrand) {
        this.carBrand = carBrand == null ? null : carBrand.trim();
    }

    public String getCarLogo() {
        return carLogo;
    }

    public void setCarLogo(String carLogo) {
        this.carLogo = carLogo == null ? null : carLogo.trim();
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
        sb.append(", carLetter=").append(carLetter);
        sb.append(", carBrand=").append(carBrand);
        sb.append(", carLogo=").append(carLogo);
        sb.append(", addtime=").append(addtime);
        sb.append(", edittime=").append(edittime);
        sb.append("]");
        return sb.toString();
    }
}