package com.gaoju.Spring5.aopanno;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

/**
 * @ClassName: PersonProxy
 * @Description: TODO
 * @Author: 高举
 * @Date: 2021/11/28 17:47
 * @URL：https://github.com/GaoHaiNB
 */
@Component
@Aspect

public class PersonProxy {
    @Before(value = "execution(* com.gaoju.Spring5.aopanno.User.add(..))")
    @Order(1)
    public void before(){
        System.out.println("Person before.....");
    }
}
