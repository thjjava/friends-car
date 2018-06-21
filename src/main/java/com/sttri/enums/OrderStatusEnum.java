package com.sttri.enums;

/**
 * 订单状态
 * @author thj
 *
 */
public enum OrderStatusEnum {
	FOR_SERVICE(0,"待服务"),
	SERVICING(1,"服务中"),
	FOR_PAYMENT(2,"代付款"),
	COMPLETED(3,"已完成");

	private Integer type;
	private String desc;
	private OrderStatusEnum(Integer type,String desc){
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
