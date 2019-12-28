package com.charlie.config;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import redis.clients.jedis.JedisPool;
import redis.clients.jedis.JedisPoolConfig;

@Configuration
public class RedisConfig {

	private static final Logger log = LoggerFactory.getLogger(RedisConfig.class);

	/**
	 * Redis服务器地址
	 */
	private static final String host = "192.168.80.100";
	/**
	 * Redis服务器连接端口
	 */
	private static final int port = 6379;
	/**
	 * Redis数据库索引（默认为0）
	 */
	private static final String database = "0";
	/**
	 * Redis连接超时时间
	 */
	private static final int timeout = 1000;
	/**
	 * 连接池最大连接数（使用负值表示没有限制）
	 */
	private static final int maxActive = 1000;
	/**
	 * 连接池最大阻塞等待时间（使用负值表示没有限制）
	 */
	private static final int maxWait = 10000;
	/**
	 * 连接池中的最大空闲连接
	 */
	private static final int maxIdle = 200;
	/**
	 * 连接池中的最小空闲连接
	 */
	private static final int minIdle = 0;
	/**
	 * redis密码 没有就空串
	 */
	private static final String password = "";

	/**
	 * 初始化Jedis连接池
	 * 
	 * @return
	 */
	@Bean
	public JedisPool getInstance() {

		log.info("正在创建redis连接池，redis的地址是:" + host + ",端口号是:" + port);

		JedisPoolConfig jedisPoolConfig = new JedisPoolConfig();

		jedisPoolConfig.setMaxTotal(maxActive); // 最大连接数

		jedisPoolConfig.setMaxIdle(maxIdle); // 连接池中的最大空闲连接

		jedisPoolConfig.setMinIdle(minIdle); // 连接池中最小的空闲链接

		jedisPoolConfig.setMaxWaitMillis(maxWait); // 连接池最大阻塞等待时间

		jedisPoolConfig.setTestOnBorrow(Boolean.valueOf(true)); // #jedis调用borrowObject方法时，是否进行有效检查

		jedisPoolConfig.setTestOnReturn(Boolean.valueOf(true)); // #jedis调用returnObject方法时，是否进行有效检查

		log.info("连接池配置成功，最大连接数为1000，最大空闲连接数为200，最小空闲链接数0，最大的阻塞连接时间10000");

		return new JedisPool(jedisPoolConfig, host, port, timeout);
	}
}
