package com.gaoju.Spring5.dao;

import com.gaoju.Spring5.entity.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

/**
 * @ClassName: BookDaoImpl
 * @Description: TODO
 * @Author: 高举
 * @Date: 2021/11/29 13:20
 * @URL：https://github.com/GaoHaiNB
 */
@Repository
public class BookDaoImpl implements BookDao{
    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public void add(Book book) {
        Object[] args={book.getUserId(),book.getUsername(),book.getUstatus()};
        String sql="insert into book values(?,?,?)";
        jdbcTemplate.update(sql,args);
    }
}
