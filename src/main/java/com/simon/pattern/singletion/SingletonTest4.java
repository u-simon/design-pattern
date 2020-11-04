package com.simon.pattern.singletion;

/**
 * @author simon
 * @date 2020/11/3 10:55 下午
 */
public class SingletonTest4 {

    public static void main(String[] args) {
        Singleton4 instance = Singleton4.getInstance();
        Singleton4 instance1 = Singleton4.getInstance();
        System.out.println(instance == instance1);
        System.out.println(instance.hashCode());
        System.out.println(instance1.hashCode());
    }
}

/**
 * 懒汉式(线程安全写法,同步方法)
 * 优点
 *  解决了线程安全问题
 * 缺点
 *  方法同步效率太低了
 */
class Singleton4 {

    private Singleton4() {
    }

    private static Singleton4 singleton;

    public static synchronized Singleton4 getInstance() {
        if (singleton == null) {
            singleton = new Singleton4();
        }
        return singleton;
    }
}
