package com.fourdvoid.usercenter.po;

import java.util.Date;

public class User {
    private String openId;
    private String appId;
    private String unionId;
    private String nickName;
    private int gender;
    private String avatarUrl;
    private String city;
    private String country;
    private String province;
    private Date createOn;

    public User() {
    }

    /*******       Begin generated by IDE, MANUALLY UPDATING IS FORBIDDEN **********/

    public User(String openId, String appId, String unionId, String nickName, int gender, String avatarUrl, String city, String country, String province, Date createOn) {
        this.openId = openId;
        this.appId = appId;
        this.unionId = unionId;
        this.nickName = nickName;
        this.gender = gender;
        this.avatarUrl = avatarUrl;
        this.city = city;
        this.country = country;
        this.province = province;
        this.createOn = createOn;
    }

    public String getOpenId() {
        return openId;
    }

    public void setOpenId(String openId) {
        this.openId = openId;
    }

    public String getAppId() {
        return appId;
    }

    public void setAppId(String appId) {
        this.appId = appId;
    }

    public String getUnionId() {
        return unionId;
    }

    public void setUnionId(String unionId) {
        this.unionId = unionId;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public int getGender() {
        return gender;
    }

    public void setGender(int gender) {
        this.gender = gender;
    }

    public String getAvatarUrl() {
        return avatarUrl;
    }

    public void setAvatarUrl(String avatarUrl) {
        this.avatarUrl = avatarUrl;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public Date getCreateOn() {
        return createOn;
    }

    public void setCreateOn(Date createOn) {
        this.createOn = createOn;
    }

    /*******       End generated by IDE, MANUALLY UPDATING IS FORBIDDEN **********/

}
