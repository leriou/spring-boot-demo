package com.lvmama.user.demo.model;

import org.springframework.data.annotation.Id;

public class UserCard {
    @Id
    private Integer id;

    private Integer uid;

    private String cardnum;

    private Integer gender;

    private String mobile;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    public String getCardnum() {
        return cardnum;
    }

    public void setCardnum(String cardnum) {
        this.cardnum = cardnum;
    }

    public Integer getGender() {
        return gender;
    }

    public void setGender(Integer gender) {
        this.gender = gender;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    @Override
    public String toString() {
        return "UserCard{" +
                "id=" + id +
                ", uid=" + uid +
                ", cardnum='" + cardnum + '\'' +
                ", gender=" + gender +
                ", mobile='" + mobile + '\'' +
                '}';
    }
}
