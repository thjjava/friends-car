package com.sttri.enums;

/**
 * 业务类型
 * @author thj
 *
 */
public enum BusinessTypeEnum {
	WASH(0,"洗车"),
	MAINTENANCE(1,"保养"),
	BEAUTY(2,"美容"),
	REPAIR(3,"维修"),
	OTHER(255,"其他");

	private Integer type;
	private String desc;
	private BusinessTypeEnum(Integer type,String desc){
		this.type = type;
		this.desc = desc;
	}
	public Integer getType() {
		return type;
	}
	public void setType(Integer type) {
		this.type = type;
	}
	public String getDesc() {
		return desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}
}
