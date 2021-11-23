package com.gaoju.spring.bean;

/**
 * @ClassName: Dept
 * @Description: TODO
 * @Author: 高举
 * @Date: 2021/11/23 15:25
 * @URL：https://github.com/GaoHaiNB
 */
//部门类
public class Dept {
    private String danme;
    public void setDanme(String danme) {
        this.danme = danme;
    }

    @Override
    public String toString() {
        return "Dept{" +
                "danme='" + danme + '\'' +
                '}';
    }
}
