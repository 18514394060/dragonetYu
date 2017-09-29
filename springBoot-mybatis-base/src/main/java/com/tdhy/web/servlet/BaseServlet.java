package com.tdhy.web.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@WebServlet(value="/base",loadOnStartup=2)
public class BaseServlet extends HttpServlet {
	
	private static Logger logger = LoggerFactory.getLogger(BaseServlet.class);
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		logger.info("*********************  BaseServlet.doGet();**********************");
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		logger.info("*********************  BaseServlet.doPost();**********************");
	}

	@Override
	public void init() throws ServletException {
		super.init();
		logger.info("*********************  BaseServlet.init();**********************");
	}

}
