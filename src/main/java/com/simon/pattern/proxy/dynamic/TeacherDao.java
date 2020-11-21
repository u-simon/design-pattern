package com.simon.pattern.proxy.dynamic;

/**
 * @author simon
 * @date 2020/11/19 22:48
 */
public class TeacherDao implements ITeacher {
    @Override
    public void teach() {
        System.out.println("老师正在授课中...");
    }
}
