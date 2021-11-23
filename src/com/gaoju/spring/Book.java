package com.gaoju.spring;

/**
 * @ClassName: Book
 * @Description: TODO
 * @Author: 高举
 * @Date: 2021/11/23 13:51
 * @URL：https://github.com/GaoHaiNB
 */
public class Book {
    private String name;
    private String writer;
    public Book() {
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setWriter(String writer) {
        this.writer = writer;
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", writer='" + writer + '\'' +
                '}';
    }
}
