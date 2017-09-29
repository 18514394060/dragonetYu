package com.tdhy.web.result;
/**
 * Restfull   返回结果集JSON
 * @author Yuxiaolong
 * @param <T>
 */
public class Result<T> {

	private T res;
	
	private Integer code;
	
	private String message;

	public T getT() {
		return res;
	}

	public void setT(T res) {
		this.res = res;
	}

	public Integer getCode() {
		return code;
	}

	public void setCode(Integer code) {
		this.code = code;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public Result(T res, Integer code, String message) {
		super();
		this.res = res;
		this.code = code;
		this.message = message;
	}

	public Result(Integer code, String message) {
		super();
		this.code = code;
		this.message = message;
	}
	
	
	public Result(Integer code) {
		super();
		this.code = code;
	}
	public Result() {
		super();
	}
}
