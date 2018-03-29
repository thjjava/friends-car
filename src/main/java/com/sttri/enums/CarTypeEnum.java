package com.sttri.enums;

/**
 * 汽车类型
 * @author thj
 *
 */
public enum CarTypeEnum {
	FIVE_SEAT(0,"5座"),
	SEVEN_SEAT(1,"7座"),
	OTHER(2,"其他");

	private Integer type;
	private String desc;
	private CarTypeEnum(Integer type,String desc){
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
