package com.tdhy;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

/**
 * @author YuXiaolong 2017-08-24 搭建完成
 * @Description 启动类在项目根目录，扫描的类必须在启动包下 配置说明： 
 * 				1。集成 tkMybatis (TODO测试:发现只可以执行单表查询的sql ,目前采用自己搭建实体进行数据整合，组合) 
 * 				2.集成 jidis 配置 
 * 				3.集成 redis session 共享配置
 * 				4.controller 统一异常处理示例
 * 			    5.filter Listener servlet示例     
 *              6.ViewResolver 支持jsp 静态全局访问 
 *              7.aop 异常日志 打印 示例 
 *              8.Interceptor 拦截器示例
 *              9.junit service及mockMvc 示例
 */
@SpringBootApplication
@EnableWebMvc
@EnableTransactionManagement // 开启事务
@ServletComponentScan(basePackages = { "com.tdhy.web..*" }) // 加上这个注解 webFilter
															// webListener
@MapperScan(basePackages = "com.tdhy.dao") // 扫描dao层
public class TdhyBaseApplication extends SpringBootServletInitializer {
	// 这个类的作用与在web.xml中配置负责初始化Spring应用上下文的监听器作用类似，如果需要打成war部署在tomcat下则需要

	public static void main(String[] args) {
		SpringApplication.run(TdhyBaseApplication.class, args);
	}

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
		return builder.sources(TdhyBaseApplication.class);
	}
}
