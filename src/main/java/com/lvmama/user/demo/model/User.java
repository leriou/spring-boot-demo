package com.lvmama.user.demo.model;

import org.springframework.data.annotation.Id;


public class User {

    @Id
    private String id;

    private String username;
    private Integer age;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public String toString(){
        return "User:username->"+ username +",age->" + age;
    }

}
