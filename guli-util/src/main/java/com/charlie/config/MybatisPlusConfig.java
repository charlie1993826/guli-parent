//package com.charlie.config;
//
//import org.apache.ibatis.type.JdbcType;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//
//import com.baomidou.mybatisplus.autoconfigure.ConfigurationCustomizer;
//import com.baomidou.mybatisplus.extension.plugins.PaginationInterceptor;
//import com.baomidou.mybatisplus.extension.plugins.PerformanceInterceptor;
//
//public class MybatisPlusConfig {
//
//	/**
//	 * mybatis-plus SQL执行效率插件【生产环境可以关闭】
//	 */
//	@Bean
//	public PerformanceInterceptor performanceInterceptor() {
//		return new PerformanceInterceptor();
//	}
//
//	/**
//	 * 分页插件
//	 */
//	@Bean
//	public PaginationInterceptor paginationInterceptor() {
//		return new PaginationInterceptor();
//	}
//
//	@Bean
//	public ConfigurationCustomizer configurationCustomizer() {
//		return new ConfigurationCustomizer() {
//			@Override
//			public void customize(org.apache.ibatis.session.Configuration configuration) {
//				configuration.setCacheEnabled(true);
//				configuration.setMapUnderscoreToCamelCase(true);
//				configuration.setCallSettersOnNulls(true);
//				configuration.setJdbcTypeForNull(JdbcType.NULL);
//			}
//		};
//	}
//
//}
