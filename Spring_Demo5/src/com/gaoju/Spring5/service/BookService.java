package com.gaoju.Spring5.service;

import com.gaoju.Spring5.dao.BookDao;
import com.gaoju.Spring5.entity.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @ClassName: BookService
 * @Description: TODO
 * @Author: 高举
 * @Date: 2021/11/29 13:19
 * @URL：https://github.com/GaoHaiNB
 */
@Service
public class BookService {
    @Autowired
    private BookDao bookDao;

    public void add(Book book){
        bookDao.add(book);
    }
}
