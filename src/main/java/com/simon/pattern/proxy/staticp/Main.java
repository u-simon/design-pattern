package com.simon.pattern.proxy.staticp;

/**
 * @author simon
 * @date 2020/11/19 22:27
 */
public class Main {

    public static void main(String[] args) {
        TeacherDaoProxy proxy = new TeacherDaoProxy(new TeacherDao());

        proxy.teach();
    }
}
