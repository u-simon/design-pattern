package com.simon.pattern.proxy.staticp;

/**
 * @author simon
 * @date 2020/11/19 22:26
 */
public class TeacherDaoProxy implements ITeacher {

    private ITeacher teacher;

    public TeacherDaoProxy(ITeacher teacher) {
        this.teacher = teacher;
    }

    @Override
    public void teach() {
        System.out.println("代理开始");
        teacher.teach();
        System.out.println("代理结束");
    }
}
