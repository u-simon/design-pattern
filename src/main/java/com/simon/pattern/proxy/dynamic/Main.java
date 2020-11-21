package com.simon.pattern.proxy.dynamic;

/**
 * @author simon
 * @date 2020/11/19 22:50
 */
public class Main {

    public static void main(String[] args) {
        ProxyFactory factory = new ProxyFactory(new TeacherDao());
        ITeacher proxy = (ITeacher) factory.getProxy();

        proxy.teach();
    }
}
