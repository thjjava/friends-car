package com.sttri.entity;

import java.io.Serializable;
import java.util.Date;

public class SysBusiness implements Serializable {
    //
    private Integer id;

    //业务类型：0-洗车，1-保养，2-美容，3-维修，255-其它
    private Integer type;

    //业务名称
    private String name;

    //业务描述
    private String description;

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

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
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
        sb.append(", type=").append(type);
        sb.append(", name=").append(name);
        sb.append(", description=").append(description);
        sb.append(", addtime=").append(addtime);
        sb.append(", edittime=").append(edittime);
        sb.append("]");
        return sb.toString();
    }
}