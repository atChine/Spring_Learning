package com.gaoju.spring.Test;

import com.gaoju.spring.Service.UserService;
import com.gaoju.spring.bean.Emp;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @ClassName: BeansTest
 * @Description: TODO
 * @Author: 高举
 * @Date: 2021/11/23 15:16
 * @URL：https://github.com/GaoHaiNB
 */
public class BeansTest {
    @Test
    public void test() {
        ApplicationContext context = new ClassPathXmlApplicationContext("bean2.xml");
        UserService userService = context.getBean("userService", UserService.class);
        userService.add();
    }
    @Test
    public void test02(){
        ApplicationContext context=new ClassPathXmlApplicationContext("bean3.xml");
        Emp emp = context.getBean("emp", Emp.class);
        emp.add();
    }
    @Test
    public void test03(){
        ApplicationContext context=new ClassPathXmlApplicationContext("bean4.xml");
        Emp emp = context.getBean("emp", Emp.class);
        emp.add();
    }
}
