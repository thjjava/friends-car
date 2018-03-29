package com.sttri.enums;

/**
 * 用户标签
 * @author thj
 *
 */
public enum UserTypeEnum {
	N("N","新人"),
	A("A","高频高价"),
	B("B","高频低价"),
	C("C","低频高价"),
	D("D","低频低价"),
	E("E","其他");

	private String type;
	private String desc;
	private UserTypeEnum(String type,String desc){
		this.type = type;
		this.desc = desc;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getDesc() {
		return desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}
}
