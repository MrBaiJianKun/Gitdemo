package com.soft1841.sm.entity;

import java.util.Date;



public class Vip  {
    private long id;
    private String name;
    private String sex;
    private String mobile;
    private String vipNumber;
    private Date joinDate;
    private String picture;

    public Vip() {
    }

    public Vip(long id, String name, String sex, String mobile, String vipNumber, Date joinDate, String picture) {
        this.id = id;
        this.name = name;
        this.sex = sex;
        this.mobile = mobile;
        this.vipNumber = vipNumber;
        this.joinDate = joinDate;
        this.picture = picture;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getVipNumber() {
        return vipNumber;
    }

    public void setVipNumber(String vipNumber) {
        this.vipNumber = vipNumber;
    }

    public Date getJoinDate() {
        return joinDate;
    }

    public void setJoinDate(Date joinDate) {
        this.joinDate = joinDate;
    }

    public String getPicture() {
        return picture;
    }

    public void setPicture(String picture) {
        this.picture = picture;
    }

    @Override
    public String toString() {
        return "Vip{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", sex='" + sex + '\'' +
                ", mobile='" + mobile + '\'' +
                ", vipNumber='" + vipNumber + '\'' +
                ", joinDate=" + joinDate +
                ", picture='" + picture + '\'' +
                '}';
    }
}