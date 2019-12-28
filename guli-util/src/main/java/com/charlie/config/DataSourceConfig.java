//package com.charlie.config;
//
//import java.sql.SQLException;
//import javax.sql.DataSource;
//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
//import org.springframework.beans.factory.annotation.Value;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.context.annotation.PropertySource;
//import com.alibaba.druid.pool.DruidDataSource;
//
////@Configuration
////@PropertySource(value = "classpath:druid.properties")
//public class DataSourceConfig {
//
//	private final static Logger log = LoggerFactory.getLogger(DataSourceConfig.class);
//
//	/**
//	 * 链接信息
//	 */
//	@Value("${spring.datasource.driverClassName}")
//	private String driverClassName;
//	@Value("${spring.datasource.url}")
//	private String url;
//	@Value("${spring.datasource.username}")
//	private String username;
//	@Value("${spring.datasource.password}")
//	private String password;
//	/**
//	 * 链接池信息
//	 */
//	@Value("${spring.datasource.initialSize}")
//	private int initialSize;
//	@Value("${spring.datasource.minIdle}")
//	private int minIdle;
//	@Value("${spring.datasource.maxActive}")
//	private int maxActive;
//	@Value("${spring.datasource.maxWait}")
//	private int maxWait;
//	@Value("${spring.datasource.timeBetweenEvictionRunsMillis}")
//	private int timeBetweenEvictionRunsMillis;
//	@Value("${spring.datasource.minEvictableIdleTimeMillis}")
//	private long minEvictableIdleTimeMillis;
//	@Value("${spring.datasource.validationQuery}")
//	private String validationQuery;
//	@Value("${spring.datasource.testWhileIdle}")
//	private boolean testWhileIdle;
//	@Value("${spring.datasource.testOnBorrow}")
//	private boolean testOnBorrow;
//	@Value("${spring.datasource.testOnReturn}")
//	private boolean testOnReturn;
//	@Value("${spring.datasource.filters}")
//	private String filters;
//	@Value("${spring.datasource.connectionProperties}")
//	private String connectionProperties;
//
//	@Bean
//	public DataSource configureDataSource() {
//		log.info("正在创建mysql链接池");
//		DruidDataSource ds = new DruidDataSource();
//		ds.setUrl(url);
//		ds.setUsername(username);
//		ds.setPassword(password);
//		ds.setDriverClassName(driverClassName);
//		ds.setInitialSize(initialSize);
//		ds.setMinIdle(minIdle);
//		ds.setMaxActive(maxActive);
//		ds.setMaxWait(maxWait);
//		ds.setTimeBetweenEvictionRunsMillis(timeBetweenEvictionRunsMillis);
//		ds.setMinEvictableIdleTimeMillis(minEvictableIdleTimeMillis);
//		ds.setValidationQuery(validationQuery);
//		ds.setTestWhileIdle(testWhileIdle);
//		ds.setTestOnBorrow(testOnBorrow);
//		ds.setTestOnReturn(testOnReturn);
//		ds.setPoolPreparedStatements(false);
//		try {
//			ds.setFilters(filters);
//		} catch (SQLException e) {
//			log.error("datasource Initialization produce error..");
//		}
//		ds.setConnectionProperties("druid.stat.slowSqlMillis=3000");
//		ds.setRemoveAbandoned(true);
//		ds.setRemoveAbandonedTimeout(1800);
//		ds.setLogAbandoned(true);
//		log.info("mysql链接池创建成功");
//		return ds;
//	}
//}
