package com.gaoju.Spring5.entity;

/**
 * @ClassName: Book
 * @Description: TODO
 * @Author: 高举
 * @Date: 2021/11/29 13:33
 * @URL：https://github.com/GaoHaiNB
 */
public class Book {
    private String userId;
    private String username;
    private String ustatus;

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getUstatus() {
        return ustatus;
    }

    public void setUstatus(String ustatus) {
        this.ustatus = ustatus;
    }
}
