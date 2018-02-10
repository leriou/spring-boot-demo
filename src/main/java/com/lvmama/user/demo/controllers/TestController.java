package com.lvmama.user.demo.controllers;


import com.lvmama.user.demo.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.data.redis.core.ValueOperations;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

@RestController
@RequestMapping("/test")
public class TestController {

    @Autowired
    public StringRedisTemplate redisTemplate;

    public volatile int n = 0;

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

    @RequestMapping("/preg")
    public boolean match(){
        String pattern = "\\d+";
        Matcher  mt = Pattern.compile(pattern).matcher("10086");
        return  mt.matches();
    }

    @RequestMapping("/ptt")
    public String Ptt(){
        ExecutorService fixedThreadPool = Executors.newFixedThreadPool(4);
        for (n =1;n < 30;n++){
            fixedThreadPool.execute(new Runnable() {
                @Override
                public void run() {
                    ptv(n);
                }
            });
        }

        return "success";
    }

    public void ptv(int n){
        System.out.println(n);
    }


}


