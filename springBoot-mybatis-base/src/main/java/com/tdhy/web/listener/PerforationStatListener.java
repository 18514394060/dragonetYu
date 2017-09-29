package com.tdhy.web.listener;

import javax.servlet.ServletRequestEvent;
import javax.servlet.ServletRequestListener;
import javax.servlet.annotation.WebListener;
import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @description 监听每个请求的运行时长
 * @author YuXiaolong
 */
@WebListener
public class PerforationStatListener implements ServletRequestListener {
	private static Logger logger = LoggerFactory.getLogger(PerforationStatListener.class);
	private static final String START = "Start";

	/**
	 * 请求建立
	 */
	@Override
	public void requestInitialized(ServletRequestEvent servletrequestevent) {
		HttpServletRequest request = (HttpServletRequest) servletrequestevent.getServletRequest();
		request.setAttribute(START, System.nanoTime());
		logger.info(request.getRequestURI() + "进入监听");
	}

	/**
	 * 请求销毁
	 */
	@Override
	public void requestDestroyed(ServletRequestEvent servletrequestevent) {
		HttpServletRequest request = (HttpServletRequest) servletrequestevent.getServletRequest();
		long start = (Long) request.getAttribute(START);
		long ms = (System.nanoTime() - start) / 1000;
		String uri = request.getRequestURI();
		// 1秒=1000豪秒 、1毫秒=1000微秒、 1微秒=1000毫微秒
		logger.info("请求" + uri + "耗时：" + ms + "微秒");
	}
}
