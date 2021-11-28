package com.gaoju.Spring5.aopanno;
import org.springframework.stereotype.Component;

/**
 * @ClassName: User
 * @Description: TODO
 * @Author: 高举
 * @Date: 2021/11/28 16:35
 * @URL：https://github.com/GaoHaiNB
 */
//被增强的方法
    @Component
public class User {
    public void add(){
        System.out.println("add.....");
    }
}
