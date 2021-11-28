package com.gaoju.Spring5;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Arrays;

/**
 * @ClassName: JDkProxy
 * @Description: TODO
 * @Author: 高举
 * @Date: 2021/11/28 15:36
 * @URL：https://github.com/GaoHaiNB
 */
public class JDkProxy {
    public static void main(String[] args) {
        Class[] interfaces = {UserDao.class};
        UserDaoImpl userDao = new UserDaoImpl();
        UserDao dao = (UserDao) Proxy.newProxyInstance(JDkProxy.class.getClassLoader(), interfaces, new UserDaoProxy(userDao));
        int result = dao.add(1,2);
        System.out.println("result: "+result);
        String id = dao.update("123456");
        System.out.println("update: "+id);
    }

    private static class UserDaoProxy implements InvocationHandler {
        private Object object;
        public UserDaoProxy(Object object) {
            this.object = object;
        }

        @Override
        public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        //方法执行之前
            System.out.println("方法执行之前"+method.getName()+":传递的参数。。。。"+ Arrays.toString(args));
            //被增强的方法执行
            Object res = method.invoke(object, args);
            //方法之后执行
            System.out.println("方法之后执行"+object);

            return res;
        }
    }
}
