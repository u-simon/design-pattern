package com.simon.pattern.composite;

/**
 * @author simon
 * @date 2020/11/14 17:17
 */
public class Main {

    public static void main(String[] args) {
        University university = new University("清华大学", " 最好的学府");

        College college = new College("计算机学院", "一流计算机学院");
        College college1 = new College("通信工程学院", "一流通信工程学院");

        college.add(new Department("软件工程", "国内领先的专业"));
        college.add(new Department("计算机专业", "一流的专业"));

        college1.add(new Department("通信工程", "一流的通信专业"));
        university.add(college);
        university.add(college1);


        college1.print();
    }
}
