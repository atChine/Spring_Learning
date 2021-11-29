package com.gaoju.Spring5.service;

import com.gaoju.Spring5.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 * @ClassName: UserService
 * @Description: TODO
 * @Author: 高举
 * @Date: 2021/11/29 13:54
 * @URL：https://github.com/GaoHaiNB
 */
@Service
@Transactional(propagation = Propagation.REQUIRED,isolation = Isolation.REPEATABLE_READ)
public class UserService {
    @Autowired
    private UserDao userDao;

    public void accountMoney() {
        userDao.addMoney();
        userDao.reduceMoney();
    }
}
