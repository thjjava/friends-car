package com.sttri.entity;

import java.io.Serializable;

public class SysArea implements Serializable {
    //
    private Integer id;

    //省份名称
    private String provinceName;

    //城市名称
    private String cityName;

    //
    private String areaCode;

    //
    private String addtime;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getProvinceName() {
        return provinceName;
    }

    public void setProvinceName(String provinceName) {
        this.provinceName = provinceName == null ? null : provinceName.trim();
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName == null ? null : cityName.trim();
    }

    public String getAreaCode() {
        return areaCode;
    }

    public void setAreaCode(String areaCode) {
        this.areaCode = areaCode == null ? null : areaCode.trim();
    }

    public String getAddtime() {
        return addtime;
    }

    public void setAddtime(String addtime) {
        this.addtime = addtime == null ? null : addtime.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", provinceName=").append(provinceName);
        sb.append(", cityName=").append(cityName);
        sb.append(", areaCode=").append(areaCode);
        sb.append(", addtime=").append(addtime);
        sb.append("]");
        return sb.toString();
    }
}