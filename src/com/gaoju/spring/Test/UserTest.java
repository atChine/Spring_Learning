package com.gaoju.spring.Test;

import com.gaoju.spring.User;
import org.junit.Test;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @ClassName: UserTest
 * @Description: TODO
 * @Author: 高举
 * @Date: 2021/11/22 22:20
 * @URL：https://github.com/GaoHaiNB
 */
public class UserTest {
    @Test
    public void testAdd(){
        ApplicationContext contest = new ClassPathXmlApplicationContext("bean1.xml");
        User user = contest.getBean("user", User.class);
        System.out.println(user);
        user.add();
    }
}
