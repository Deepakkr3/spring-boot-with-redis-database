package com.springboot.application.Application.dao;

import com.springboot.application.Application.entity.UserC;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Repository;

import java.util.Map;

@Repository

public class UserDAO {
    @Autowired
    public RedisTemplate<String,Object> redisTemplate;
    private static final String KEY="USER";
    public UserC sav(UserC uder){
        redisTemplate.opsForHash().put(KEY,uder.getUserId(),uder);
        return uder;

    }
    public UserC get(String userId){
        return (UserC) redisTemplate.opsForHash().get(KEY,userId);
    }
    public Map<Object,Object> getAll(){


        return redisTemplate.opsForHash().entries(KEY);


    }
    public void delete(String userId){
        redisTemplate.opsForHash().delete(KEY,userId);
    }
}
