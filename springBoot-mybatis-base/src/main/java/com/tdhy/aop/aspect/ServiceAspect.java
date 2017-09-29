package com.tdhy.aop.aspect;

import java.util.Date;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;

@Aspect
@Configuration
public class ServiceAspect {
	private static final Logger logger = LoggerFactory.getLogger(ServiceAspect.class);

	@Pointcut("within(com.tdhy.service..*)")
	public void errorLogAspect() {
	}

	@Around("errorLogAspect()")
	public Object errorLog(ProceedingJoinPoint jp) throws Exception {
		String methodName = jp.getTarget().getClass().getName() + "." + jp.getSignature().getName() + "()";
		logger.info("----------------------" + methodName + "  开始      ---------------------- ");
		Long time = new Date().getTime();
		logger.info("----- 方法开始时间 ：              " + time + "                           ---");
		Object reval = null;
		try {
			reval = jp.proceed();
		} catch (Throwable e) {
			// TODO: handle exception
			if (e instanceof Exception) {
				logger.error("异常信息 {}", e);
				throw (Exception)e;
			}
		}
		long endTime = new Date().getTime();
		logger.info("----- 方法结束时间 ：              " + endTime + "                                 ---");
		logger.info("----- 方法执行时间 ：              " + (endTime-time) + "                          ---");
		logger.info("----------------------" + methodName + "  结束      ---------------------- ");
		return reval;
	}
}
