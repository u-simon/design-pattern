package com.simon.pattern.proxy.cglib;

/**
 * @author simon
 * @date 2020/11/21 09:20
 */
public class Main {

    public static void main(String[] args) {
        ProxyFactory factory = new ProxyFactory(new TeacherDao());
        ITeacher proxyInstance = (ITeacher) factory.getProxyInstance();

        System.out.println(proxyInstance.teach());

    }
}
