package com.sttri.enums;

/**
 * 结算状态
 * @author thj
 *
 */
public enum PayStatusEnum {
	NO_PAY(0,"无需结算"),
	HAS_PAY(1,"已结算"),
	UN_PAY(2,"未结算");

	private Integer type;
	private String desc;
	private PayStatusEnum(Integer type,String desc){
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
