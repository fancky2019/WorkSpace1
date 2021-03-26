package com.fancky.model.entity.test;

import java.time.LocalDateTime;

public class UserInfo {
    private Integer id;

    private String userName;

    private Integer userAge;

    private String address;

    private LocalDateTime birthday;

    private Byte isDelete;

    public UserInfo(Integer id, String userName, Integer userAge, String address, LocalDateTime birthday, Byte isDelete) {
        this.id = id;
        this.userName = userName;
        this.userAge = userAge;
        this.address = address;
        this.birthday = birthday;
        this.isDelete = isDelete;
    }

    public UserInfo() {
        super();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName == null ? null : userName.trim();
    }

    public Integer getUserAge() {
        return userAge;
    }

    public void setUserAge(Integer userAge) {
        this.userAge = userAge;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    public LocalDateTime getBirthday() {
        return birthday;
    }

    public void setBirthday(LocalDateTime birthday) {
        this.birthday = birthday;
    }

    public Byte getIsDelete() {
        return isDelete;
    }

    public void setIsDelete(Byte isDelete) {
        this.isDelete = isDelete;
    }
}