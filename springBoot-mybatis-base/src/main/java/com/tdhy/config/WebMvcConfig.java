package com.tdhy.config;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.DefaultServletHandlerConfigurer;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

import com.tdhy.web.interceptor.BaseInterceptor;
import com.tdhy.web.servlet.BaseServlet;

/**
 * @author Yuxiaolong 2017-08-20 默认静态资源路径在resources 包下 设置全局 默认 freemarker模式配置
 *         配置viewResolver 支持jsp
 */
@Configuration
@EnableWebMvc
public class WebMvcConfig extends WebMvcConfigurerAdapter {

	Logger logger = LoggerFactory.getLogger(WebMvcConfig.class);

	/**
	 * 配置静态资源的处理
	 */

	@Override
	public void addResourceHandlers(ResourceHandlerRegistry registry) {
		registry.addResourceHandler("/static/**").addResourceLocations("classpath:/");
	}

	@Override
	public void configureDefaultServletHandling(DefaultServletHandlerConfigurer configurer) {
		logger.info("-------------------------------------配置静态资源全局化--------------------------------------------");
		configurer.enable();
	}

	@Bean
	public ViewResolver viewResolver() {
		InternalResourceViewResolver resolver = new InternalResourceViewResolver();
		resolver.setPrefix("/WEB-INF/");
		resolver.setSuffix(".jsp");
		resolver.setExposeContextBeansAsAttributes(true);
		logger.info(
				"-------------------------------------配置viewResovler success--------------------------------------------");
		return resolver;
	}

	@Override
	public void addInterceptors(InterceptorRegistry registry) {// 多个拦截器组成一个拦截器链
																// addPathPatterns
																// 用于添加拦截规则
		registry.addInterceptor(new BaseInterceptor()).addPathPatterns("/**");
		super.addInterceptors(registry);
		logger.info(
				"-------------------------------------配置addInterceptors success--------------------------------------------");
	}

}
