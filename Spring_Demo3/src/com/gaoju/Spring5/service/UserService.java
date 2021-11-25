package com.gaoju.Spring5.service;

import com.gaoju.Spring5.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @ClassName: UserService
 * @Description: TODO
 * @Author: 高举
 * @Date: 2021/11/25 18:10
 * @URL：https://github.com/GaoHaiNB
 */
@Service
public class UserService {
    @Value(value = "王冰冰")
    private String name;
//@Autowired
//@Qualifier(value = "userDaoImpl01")
    @Resource(name = "userDaoImpl01")
   private UserDao userDao;
    public void add(){
        System.out.println("Service add....."+name);
        userDao.add();
    }
}
