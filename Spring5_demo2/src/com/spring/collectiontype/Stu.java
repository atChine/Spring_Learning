package com.spring.collectiontype;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * @ClassName: Stu
 * @Description: TODO
 * @Author: 高举
 * @Date: 2021/11/24 12:45
 * @URL：https://github.com/GaoHaiNB
 */
public class Stu {
    private String[] course;
    private List<String> list;
    private Map<String,String> maps;
    private Set<String> sets;
    private List<Course> courseList;

    public void setCourseList(List<Course> courseList) {
        this.courseList = courseList;
    }

    public void setCourse(String[] course) {
        this.course = course;
    }

    public void setList(List<String> list) {
        this.list = list;
    }

    public void setMaps(Map<String, String> maps) {
        this.maps = maps;
    }

    public void setSets(Set<String> sets) {
        this.sets = sets;
    }
    public void test(){
        System.out.println(courseList);
    } 
}
