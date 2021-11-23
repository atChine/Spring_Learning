package com.gaoju.spring;

/**
 * @ClassName: Order
 * @Description: TODO
 * @Author: 高举
 * @Date: 2021/11/23 14:13
 * @URL：https://github.com/GaoHaiNB
 */
public class Order {
    private String name;
    private int price;

    public Order(String name, int price) {
        this.name = name;
        this.price = price;
    }
    public void orderTest(){
        System.out.println(name+"::"+price);
    }
}
