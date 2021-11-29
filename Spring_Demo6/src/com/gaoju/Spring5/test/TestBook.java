package com.gaoju.Spring5.test;
import com.gaoju.Spring5.service.UserService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @ClassName: TestBook
 * @Description: TODO
 * @Author: 高举
 * @Date: 2021/11/29 13:42
 * @URL：https://github.com/GaoHaiNB
 */
public class TestBook {
    @Test
    public void test(){
        ApplicationContext context = new ClassPathXmlApplicationContext("bean1.xml");
        UserService userService = context.getBean("userService", UserService.class);
        userService.accountMoney();
    }
}
