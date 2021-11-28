package com.gaoju.Spring5.test;

import com.gaoju.Spring5.aopanno.User;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @ClassName: TestAop
 * @Description: TODO
 * @Author: 高举
 * @Date: 2021/11/28 17:00
 * @URL：https://github.com/GaoHaiNB
 */
public class TestAop {
    @Test
    public void test(){
        ApplicationContext context =
                new ClassPathXmlApplicationContext("bean1.xml");
        User user = context.getBean("user", User.class);
        user.add();
    }
}
