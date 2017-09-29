package com.tdhy.web.result;
/**
 * 返回集枚举
 */
public enum ResultEnum {
	SUCCESS(200, "操作成功"), 
	NO_LOGIN(201,"未登录"),
	NOT_PARMS(202,"错误的参数"),
	ERROR(500, "未知错误");
	private Integer code;
	private String name;
	
	private ResultEnum(Integer code, String name) {
		this.code = code;
		this.name = name;
	}

	public Integer getCode() {
		return code;
	}

	public String getName() {
		return name;
	}

}
