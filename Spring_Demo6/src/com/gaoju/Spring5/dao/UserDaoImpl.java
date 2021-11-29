package com.gaoju.Spring5.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

/**
 * @ClassName: UserDaoImpl
 * @Description: TODO
 * @Author: 高举
 * @Date: 2021/11/29 13:54
 * @URL：https://github.com/GaoHaiNB
 */
@Repository
public class UserDaoImpl implements UserDao{
    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public void addMoney() {
        String sql="update account set money=money-? where username=?";
        jdbcTemplate.update(sql,100,"lucy");

    }

    @Override
    public void reduceMoney() {
        String sql="update account set money=money+? where username=?";
        jdbcTemplate.update(sql,100,"tom");

    }
}
