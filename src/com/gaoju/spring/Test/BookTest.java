package com.gaoju.spring.Test;

import com.gaoju.spring.Book;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @ClassName: BookTest
 * @Description: TODO
 * @Author: 高举
 * @Date: 2021/11/23 14:05
 * @URL：https://github.com/GaoHaiNB
 */
public class BookTest {
    @Test
            public void bookTest(){
        ApplicationContext context=new ClassPathXmlApplicationContext("bean1.xml");
        Object book = context.getBean("book", Book.class);
        System.out.println(book);
        book.toString();
    }


}
