package com.lvmama.user.demo.controllers;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.data.redis.core.ValueOperations;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class TestController {

    @Autowired
    public StringRedisTemplate redisTemplate;

    @RequestMapping("/index")
    public String index(){
        return "test index";
    }

    @RequestMapping("/redisSet")
    public String redisSet(){
        ValueOperations<String,String> ops =  redisTemplate.opsForValue();
        ops.set("spring10086","sprint set success");
        return "set success";
    }

    @RequestMapping("/redisGet")
    public String redisGet(){
        ValueOperations<String,String> ops =  redisTemplate.opsForValue();
        return ops.get("spring10086");
    }

}


