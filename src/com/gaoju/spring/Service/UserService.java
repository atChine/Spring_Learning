package com.gaoju.spring.Service;

import com.gaoju.spring.Dao.UserDao;
import com.gaoju.spring.Dao.UserDaoImpl;
import com.gaoju.spring.User;

/**
 * @ClassName: UserService
 * @Description: TODO
 * @Author: 高举
 * @Date: 2021/11/23 15:00
 * @URL：https://github.com/GaoHaiNB
 */
public class UserService {
    private UserDao userDao;

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    public void add(){
        System.out.println("service add.....");
        userDao.update();
//        UserDao userDao = new UserDaoImpl();
//        userDao.update();
    }
}
