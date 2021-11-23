package com.gaoju.spring;

/**
 * @ClassName: User
 * @Description: TODO
 * @Author: 高举
 * @Date: 2021/11/22 22:14
 * @URL：https://github.com/GaoHaiNB
 */
public class User {
    private String name;

    public User() {
    }

    public User(String name) {
        this.name = name;
    }

    public void add(){
        System.out.println("add.....");
    }
}
