package com.lvmama.user.demo;

import com.lvmama.user.demo.model.User;
import com.lvmama.user.demo.utils.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.data.redis.core.ValueOperations;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class TestController {

    @Autowired
    public StringRedisTemplate redisTemplate;

    @Autowired
    public UserRepository userRepository;

    @RequestMapping("/test")
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

    @RequestMapping("/save")
    public String Save(){
        User user1 = new User();
        user1.setUsername("spring");
        user1.setAge(20);
        userRepository.save(user1);
        User user2 = new User();
        user2.setUsername("hexo");
        user2.setAge(12);
        userRepository.save(user2);
        return "ok";
    }

    @RequestMapping("/find")
    public List<User> find(){
//          List<User> us;
          return userRepository.findAll();
    }

    @RequestMapping("/findByUsername")
    public String findByUsername(){
        User u =  userRepository.findByUsername("spring");
        return u.toString();
    }

}


