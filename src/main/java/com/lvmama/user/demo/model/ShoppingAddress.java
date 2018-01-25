package com.lvmama.user.demo.model;

import org.springframework.data.annotation.Id;

public class ShoppingAddress {

    @Id
    public Integer uid;

    public String mobile;

    public String name;

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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "ShoppingAddress{" +
                "uid=" + uid +
                ", mobile='" + mobile + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
