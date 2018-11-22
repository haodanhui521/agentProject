package com.agent.core.common.config;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.connection.jedis.JedisConnectionFactory;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.serializer.RedisSerializer;
import org.springframework.data.redis.serializer.StringRedisSerializer;
import redis.clients.jedis.JedisPoolConfig;

@Configuration
@EnableAutoConfiguration
@Slf4j
public class RedisConfig {

	@Value("${spring.redis.pool.max-active}")
    Integer maxActive;
    @Value("${spring.redis.pool.max-idle}")
    Integer maxIdle;
    @Value("${spring.redis.pool.max-wait}")
    Integer maxWait;
    @Value("${spring.redis.pool.min-idle}")
    Integer minIdle;
    @Value("${spring.redis.host}")
    String hostname;
    @Value("${spring.redis.password}")
    String password;
    @Value("${spring.redis.port}")
    String port;
    @Value("${spring.redis.database}")
    String database;
    @Value("${spring.redis.timeout}")
    String timeout;

	@Bean
    public JedisPoolConfig getRedisConfig(){
        JedisPoolConfig config = new JedisPoolConfig();
        config.setMaxTotal(maxActive);
        config.setMaxIdle(maxIdle);
        config.setMinIdle(minIdle);
		config.setMaxWaitMillis(maxWait);
        return config;
    }

    @Bean
    public JedisConnectionFactory getConnectionFactory(){
        JedisConnectionFactory factory = new JedisConnectionFactory();
        JedisPoolConfig config = getRedisConfig();
        factory.setPoolConfig(config);
        factory.setHostName(hostname);
        factory.setPassword(password);
        factory.setPort(Integer.parseInt(port));
        factory.setDatabase(Integer.parseInt(database));
        factory.setTimeout(Integer.parseInt(timeout));
        log.info("JedisConnectionFactory bean init success.");
        return factory;
    }


    @Bean("redisTemplate")
    public RedisTemplate<String, Object> getRedisTemplate(){
    	RedisTemplate<String, Object> redisTemplate = new RedisTemplate<String, Object>();
        redisTemplate.setConnectionFactory(getConnectionFactory());
        RedisSerializer stringSerializer = new StringRedisSerializer();
        redisTemplate.setKeySerializer(stringSerializer);
        redisTemplate.setValueSerializer(stringSerializer);
        redisTemplate.setHashKeySerializer(stringSerializer);
        redisTemplate.setHashValueSerializer(stringSerializer);
        return redisTemplate;
    }
}
