package com.sttri.enums;

/**
 * 员工在职状态 0-在职 1-离职
 * @author thj
 *
 */
public enum EmployeeStatusEnum {
	ONJOB(0),DEPARTURE(1);
	private EmployeeStatusEnum(Integer status){
		this.status = status;
	}
	private Integer status;
	public Integer getStatus() {
		return status;
	}
	public void setStatus(Integer status) {
		this.status = status;
	}
	
}