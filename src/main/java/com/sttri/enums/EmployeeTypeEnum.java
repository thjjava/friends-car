package com.sttri.enums;

/**
 * 员工类型
 * @author thj
 *
 */
public enum EmployeeTypeEnum {
	BOSS(0,"老板"),
	RECEPTIONIST(1,"接待人员"),
	CUSTOMER(2,"客服"),
	MARKETING(3,"营销"),
	SALES(4,"销售");

	private Integer type;
	private String desc;
	private EmployeeTypeEnum(Integer type,String desc){
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
