package com.tdhy.web.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import com.tdhy.web.filter.EncodeFilter;

public class BaseInterceptor implements HandlerInterceptor {
	
	private static Logger logger = LoggerFactory.getLogger(BaseInterceptor.class);
	
	@Override
	public void afterCompletion(HttpServletRequest arg0, HttpServletResponse arg1, Object arg2, Exception arg3)
			throws Exception {
		// TODO Auto-generated method stub
		logger.info("------------------------------------- BaseInterceptor.afterCompletion()  -----------------------------------------");
	}

	@Override
	public void postHandle(HttpServletRequest arg0, HttpServletResponse arg1, Object arg2, ModelAndView arg3)
			throws Exception {
		// TODO Auto-generated method stub
		logger.info("------------------------------------- BaseInterceptor.postHandle()  -----------------------------------------");	
	}

	@Override
	public boolean preHandle(HttpServletRequest arg0, HttpServletResponse arg1, Object arg2) throws Exception {
		// TODO Auto-generated method stub
		logger.info("------------------------------------- BaseInterceptor.preHandle()  -----------------------------------------");	
		
		return true;
	}

}
