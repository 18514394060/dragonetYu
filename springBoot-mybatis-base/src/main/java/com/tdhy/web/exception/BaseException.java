package com.tdhy.web.exception;

import com.tdhy.web.result.ResultEnum;

public class BaseException extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private Integer code;

	private ResultEnum renums;
	// private String message;

	public BaseException(Integer code, String message) {
		super(message);
		this.code = code;
	}

	public BaseException(ResultEnum renums) {
		super(renums.getName());
		this.code = renums.getCode();
		this.renums = renums;
	}

	public Integer getCode() {
		return code;
	}
	
	public ResultEnum getRenums(){
		return renums;
	}

}
