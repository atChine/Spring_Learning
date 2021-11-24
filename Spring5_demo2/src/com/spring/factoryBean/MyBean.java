package com.spring.factoryBean;

import com.spring.collectiontype.Course;
import org.springframework.beans.factory.FactoryBean;

/**
 * @ClassName: MyBean
 * @Description: TODO
 * @Author: 高举
 * @Date: 2021/11/24 20:41
 * @URL：https://github.com/GaoHaiNB
 */
public class MyBean implements FactoryBean<Course>{

    @Override
    public Course getObject() throws Exception {
        Course course = new Course();
        course.setCname("abc");
        return course;
    }

    @Override
    public Class<?> getObjectType() {
        return null;
    }

    @Override
    public boolean isSingleton() {
        return false;
    }
}
