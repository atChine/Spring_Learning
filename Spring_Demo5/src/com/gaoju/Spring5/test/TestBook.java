package com.gaoju.Spring5.test;

import com.gaoju.Spring5.entity.Book;
import com.gaoju.Spring5.service.BookService;
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
        BookService bookService = context.getBean("bookService", BookService.class);
        Book book = new Book();
        book.setUserId("1");
        book.setUsername("java");
        book.setUstatus("open");
        bookService.add(book);
    }
}
