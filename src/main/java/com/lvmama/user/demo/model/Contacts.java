package com.lvmama.user.demo.model;

import org.springframework.data.annotation.Id;

public class Contacts {

    @Id
    public Integer uid;

    public String mobile;

    public String username;

    public Integer gender;

    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Integer getGender() {
        return gender;
    }

    public void setGender(Integer gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "Contacts{" +
                "uid=" + uid +
                ", mobile='" + mobile + '\'' +
                ", username='" + username + '\'' +
                ", gender=" + gender +
                '}';
    }
}
