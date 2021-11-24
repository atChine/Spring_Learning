package com.spring.testDemo;

import com.spring.collectiontype.Course;
import com.spring.collectiontype.Stu;
import com.spring.factoryBean.MyBean;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @ClassName: Testdemo
 * @Description: TODO
 * @Author: 高举
 * @Date: 2021/11/24 13:00
 * @URL：https://github.com/GaoHaiNB
 */
public class TestDemo {
    @Test
    public void test(){
        ApplicationContext context=new ClassPathXmlApplicationContext("bean1.xml");
        Stu stu = context.getBean("stu", Stu.class);
        stu.test();
    }
    @Test
    public void test1(){
        ApplicationContext context=new ClassPathXmlApplicationContext("demo3.xml");
        Course course = context.getBean("myBean", Course.class);
        System.out.println(course);
    }
}
