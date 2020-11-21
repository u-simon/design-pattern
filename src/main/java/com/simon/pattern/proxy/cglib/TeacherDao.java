package com.simon.pattern.proxy.cglib;

/**
 * @author simon
 * @date 2020/11/21 09:15
 */
public class TeacherDao implements ITeacher {
    @Override
    public String teach() {
        System.out.println("老师正在授课中...cglib");
        return "null";
    }
}
