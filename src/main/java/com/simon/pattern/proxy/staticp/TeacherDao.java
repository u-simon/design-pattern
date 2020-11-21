package com.simon.pattern.proxy.staticp;

/**
 * @author simon
 * @date 2020/11/19 22:26
 */
public class TeacherDao implements ITeacher {
    @Override
    public void teach() {
        System.out.println("老师开始授课");
    }
}
