package com.gaoju.spring.Test;

import com.gaoju.spring.Order;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @ClassName: OrderTest
 * @Description: TODO
 * @Author: 高举
 * @Date: 2021/11/23 14:19
 * @URL：https://github.com/GaoHaiNB
 */
public class OrderTest {
    @Test
    public void orderTest(){
        ApplicationContext context = new ClassPathXmlApplicationContext("bean1.xml");
        Order order = context.getBean("order", Order.class);
        System.out.println(order);
        order.orderTest();
    }
}
