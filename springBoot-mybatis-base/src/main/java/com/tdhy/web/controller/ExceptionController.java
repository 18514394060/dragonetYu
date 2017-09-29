package com.tdhy.web.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import com.tdhy.web.exception.BaseException;
import com.tdhy.web.result.Result;
import com.tdhy.web.result.ResultEnum;
import com.tdhy.web.result.ResultUtil;

/**
 * controller 统一处理异常示例
 * @author YuXiaolong 2017-08-24
 */
@ControllerAdvice
public class ExceptionController {

	@ExceptionHandler({ RuntimeException.class })
	@ResponseBody
	public Result<?> handleException(HttpServletRequest request, HttpServletResponse response, Exception e) {
		if (e instanceof BaseException) {
			BaseException base = (BaseException) e;
			return ResultUtil.success(base.getRenums(), null);
		}
		return ResultUtil.error(ResultEnum.ERROR);
	}
}
