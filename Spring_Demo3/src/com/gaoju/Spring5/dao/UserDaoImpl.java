package com.gaoju.Spring5.dao;

import org.springframework.stereotype.Repository;

/**
 * @ClassName: UserDaoImpl
 * @Description: TODO
 * @Author: 高举
 * @Date: 2021/11/25 19:24
 * @URL：https://github.com/GaoHaiNB
 */
@Repository(value = "userDaoImpl01")
public class UserDaoImpl implements UserDao{
    @Override
    public void add() {
        System.out.println("UserDao add...........");
    }
}
