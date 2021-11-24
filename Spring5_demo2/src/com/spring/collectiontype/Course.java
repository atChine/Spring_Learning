package com.spring.collectiontype;

/**
 * @ClassName: Course
 * @Description: TODO
 * @Author: 高举
 * @Date: 2021/11/24 19:26
 * @URL：https://github.com/GaoHaiNB
 */
public class Course {
    private String cname;

    public void setCname(String cname) {
        this.cname = cname;
    }

    @Override
    public String toString() {
        return "Course{" +
                "cname='" + cname + '\'' +
                '}';
    }
}
