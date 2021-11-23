package com.gaoju.spring.bean;

/**
 * @ClassName: Emp
 * @Description: TODO
 * @Author: 高举
 * @Date: 2021/11/23 15:25
 * @URL：https://github.com/GaoHaiNB
 */
//员工类
public class Emp {
    private String ename;
    private String gender;
    private Dept dept;

    public void setEname(String ename) {
        this.ename = ename;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setDept(Dept dept) {
        this.dept = dept;
    }
    public void add(){
        System.out.println(ename+"::"+gender+"::"+dept);
    }
}
