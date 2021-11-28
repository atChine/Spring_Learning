package com.gaoju.Spring5;

/**
 * @ClassName: UserDaoImpl
 * @Description: TODO
 * @Author: 高举
 * @Date: 2021/11/28 15:34
 * @URL：https://github.com/GaoHaiNB
 */
public class UserDaoImpl implements UserDao{
    @Override
    public int add(int a, int b) {
        System.out.println("add方法执行了");
        return a+b;
    }

    @Override
    public String update(String id) {
        System.out.println("update方法执行了");
        return id;
    }
}
