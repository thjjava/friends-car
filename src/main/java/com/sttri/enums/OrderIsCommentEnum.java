package com.sttri.enums;

/**
 * 结算状态
 * @author thj
 *
 */
public enum OrderIsCommentEnum {
	NO_COMMENT(0,"待评论"),
	YES_COMMENT(1,"已评论");

	private Integer type;
	private String desc;
	private OrderIsCommentEnum(Integer type,String desc){
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
