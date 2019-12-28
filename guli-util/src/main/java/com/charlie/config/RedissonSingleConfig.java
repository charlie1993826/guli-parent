package com.charlie.config;

import org.redisson.Redisson;
import org.redisson.api.RedissonClient;
import org.redisson.config.Config;
import org.redisson.config.SingleServerConfig;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import io.micrometer.core.instrument.util.StringUtils;

/**
 * 使用单机配置
 * 
 * @author charlie
 *
 */
@Configuration
public class RedissonSingleConfig {

	private static final String port = "6379";

	private static final String host = "192.168.80.100";

	private static final int timeout = 3000;

	private static final String mode = "single";

	private static final String password = "";

	/**
	 * 连接池的配置
	 */
	private static final int maxIdle = 16;

	private static final int minIdle = 8;

	private static final int maxActive = 8;

	private static final int maxWait = 3000;

	private static final int connTimeout = 3000;

	private static final int soTimeout = 3000;

	private static final int size = 10;

	/**
	 * 使用单节点配置，（还有哨兵模式和多节点模式）,里面还可以设置超时时间之类的一些参数
	 * 
	 * @return
	 */
	@Bean
	public RedissonClient getRedissonClient() {
		Config config = new Config();
		SingleServerConfig singleServerConfig = config.useSingleServer().setAddress("redis://" + host + ":" + port)
				.setTimeout(connTimeout).setConnectionPoolSize(size).setConnectionMinimumIdleSize(minIdle);
		if (StringUtils.isNotBlank(password)) {
			singleServerConfig.setPassword(password);
		}
		return Redisson.create(config);
	}

}
