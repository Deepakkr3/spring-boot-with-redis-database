package com.springboot.application.Application.config;

import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.connection.RedisConnectionFactory;
import org.springframework.data.redis.connection.lettuce.LettuceConnectionFactory;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.serializer.GenericJackson2JsonRedisSerializer;
import org.springframework.data.redis.serializer.StringRedisSerializer;

//class for configuration of radis database
@Configuration
@Slf4j
public class RedisConfig {
    @Bean
    public RedisConnectionFactory redisConnectionFactory(){
        return new LettuceConnectionFactory();
    }
    @Bean
    public RedisTemplate<String ,Object> redisTemplate(){
        RedisTemplate<String,Object> redisTemp=new RedisTemplate<>();
        redisTemp.setConnectionFactory(redisConnectionFactory());
        redisTemp.setKeySerializer(new StringRedisSerializer());
        redisTemp.setValueSerializer(new GenericJackson2JsonRedisSerializer());

        return redisTemp;
    }

}
