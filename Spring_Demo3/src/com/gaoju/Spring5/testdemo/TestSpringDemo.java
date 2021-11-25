package com.gaoju.Spring5.testdemo;

import com.gaoju.Spring5.config.SpringConfig;
import com.gaoju.Spring5.service.UserService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @ClassName: TestSpringDemo
 * @Description: TODO
 * @Author: 高举
 * @Date: 2021/11/25 18:16
 * @URL：https://github.com/GaoHaiNB
 */
public class TestSpringDemo {
    @Test
    public void test01(){
        ApplicationContext context = new ClassPathXmlApplicationContext("bean1.xml");
        UserService userService = context.getBean("userService", UserService.class);
        System.out.println(userService);
        userService.add();
    }
    @Test
    public void test02(){
       ApplicationContext context=new AnnotationConfigApplicationContext(SpringConfig.class);
        UserService userService = context.getBean("userService", UserService.class);
        System.out.println(userService);
        userService.add();
    }
}
