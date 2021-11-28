package com.gaoju.Spring5.aopanno;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

/**
 * @ClassName: UserProxy
 * @Description: TODO
 * @Author: 高举
 * @Date: 2021/11/28 16:36
 * @URL：https://github.com/GaoHaiNB
 */
//增强的类
    @Component
    @Aspect
public class UserProxy {
        //相同切入点抽取
    @Pointcut(value = "execution(* com.gaoju.Spring5.aopanno.User.add(..))")
    public void pointDemo(){}
    //前置通知
    @Before("pointDemo()")
    @Order(3)
    public void before(){
        System.out.println("before.....");
    }
    //最终
    @After(value = "execution(* com.gaoju.Spring5.aopanno.User.add(..))")
    public void after(){
        System.out.println("after.....");
    }
    //后置
    @AfterReturning(value = "execution(* com.gaoju.Spring5.aopanno.User.add(..))")
    public void afterReturning(){
        System.out.println("afterReturning.....");
    }
    //异常
    @AfterThrowing(value = "execution(* com.gaoju.Spring5.aopanno.User.add(..))")
    public void afterThrowing(){
        System.out.println("afterThrowing.....");
    }
    //环绕通知
    @Around(value = "execution(* com.gaoju.Spring5.aopanno.User.add(..))")
    public void around(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        System.out.println("aroundBefore.....");
        proceedingJoinPoint.proceed();
        System.out.println("aroundAfter.....");
    }

}
