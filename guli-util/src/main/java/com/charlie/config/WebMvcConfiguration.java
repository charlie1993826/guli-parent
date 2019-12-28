package com.charlie.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

import com.charlie.interceptors.AuthInterceptor;

/**
 * 自定义拦截器 ，拦截所有请求
 * @author charlie
 *
 */
@Configuration
@SuppressWarnings("deprecation")
public class WebMvcConfiguration extends WebMvcConfigurerAdapter {

	@Autowired
	AuthInterceptor authInterceptor;

	@Override
	public void addInterceptors(InterceptorRegistry registry) {
		registry.addInterceptor(authInterceptor).addPathPatterns("/**").excludePathPatterns("/error");
		super.addInterceptors(registry);
	}
}