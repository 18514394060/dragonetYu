package com.tdhy.config;

/**
 * @author YuXiaoLong
 * redis 缓存配置文件
 */
//@Configuration
//@PropertySource(value = { "classpath:conf/redis.properties" })
//@EnableRedisHttpSession   // session 交给redis 存储
public class RedisConfig {

	/*private static Logger logger = LoggerFactory.getLogger(RedisConfig.class);
	@Autowired
	Environment env;
	
	@Bean
	JedisPoolConfig jedisPoolConfig(){
		JedisPoolConfig jpc = new JedisPoolConfig();
		jpc.setMaxIdle(Integer.valueOf(env.getRequiredProperty("maxIdle")));
		jpc.setMinIdle(Integer.valueOf(env.getRequiredProperty("minIdle")));
		jpc.setMaxTotal(Integer.valueOf(env.getRequiredProperty("maxTotal")));
		jpc.setTestOnBorrow(Boolean.valueOf(env.getRequiredProperty("testOnBorrow")));
		return jpc;
	}
	
	@Bean
	JedisPool jedisPool(){
		JedisPool jp = new JedisPool(jedisPoolConfig(),
				env.getRequiredProperty("redis.host"),
				Integer.valueOf(env.getRequiredProperty("redis.port")),
				Integer.valueOf(env.getRequiredProperty("redis.timeout")),
				null,
				Integer.valueOf(env.getRequiredProperty("redis.db.index"))
				);
		logger.info("----------------------------------- JedisPool 注入成功 -------------------------------------");
		return jp;
	}*/
}
