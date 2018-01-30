package com.lvmama.user.demo.controllers;

import com.lvmama.user.demo.model.User;
import com.lvmama.user.demo.repository.UserRepository;
import org.apache.catalina.servlet4preview.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.lang.reflect.Field;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    UserRepository userRepo;

    @RequestMapping("/save")
    public String save(HttpServletRequest request){
        Map<String,String[]> parameterMap = request.getParameterMap();
        User user = new User();
        user.setUid(parameterMap.get("uid")[0]);
        user.setUsername(parameterMap.get("username")[0]);
        user.setAge(new Integer(parameterMap.get("age")[0]));
        user.setGender(new Integer(parameterMap.get("gender")[0]));
        user.setMobile(parameterMap.get("mobile")[0]);
        userRepo.save(user);
        return user.toString();
    }

    @RequestMapping("/find")
    public List<User> find(){
        return userRepo.findAll();
    }

    @RequestMapping("/findByName/{name}")
    public String findByUserName(@PathVariable String name){
       return userRepo.findByUsername(name).toString();
    }

    @RequestMapping("/testReflect")
    public String testReflect() throws Exception{
        User model = userRepo.findByUsername("起飞");
        String tmp = "";
        for (Field field : model.getClass().getDeclaredFields()) {
            field.setAccessible(true);
            tmp += field.getName() + ":" + field.get(model) ;
        }
        return  tmp;
    }

}
