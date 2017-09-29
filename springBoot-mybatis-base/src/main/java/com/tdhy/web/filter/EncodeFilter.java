package com.tdhy.web.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author YuXiaolong
 * 测试使用，
 * 字符集 :项目启动自动加载spring的encodeFilter
 */
@WebFilter(filterName = "EcodeFilter", urlPatterns = "/*")
public class EncodeFilter implements Filter{
	private static Logger logger = LoggerFactory.getLogger(EncodeFilter.class);
	@Override
	public void init(FilterConfig filterConfig) throws ServletException {
		// TODO Auto-generated method stub
		logger.info("-------------------------------------- EncodeFilter init ------------------------------------- ");
	}

	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		// TODO Auto-generated method stub
		request.setCharacterEncoding("utf-8");
		logger.info("--------------------------------    当前字符编码集：utf-8   ------------------------------------- ");
		chain.doFilter(request, response);
	}

	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		logger.info("---------------------------------------EncodeFilter destroy ------------------------------------- ");
	}

	
}
