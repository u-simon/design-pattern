package com.simon.pattern.singletion;

/**
 * @author simon
 * @date 2020/11/3 10:55 下午
 */
public class SingletonTest5 {

    public static void main(String[] args) {
        Singleton5 instance = Singleton5.getInstance();
        Singleton5 instance1 = Singleton5.getInstance();
        System.out.println(instance == instance1);
        System.out.println(instance.hashCode());
        System.out.println(instance1.hashCode());
    }
}

/**
 * 懒汉式(线程安全写法,同步代码块)
 * 优点
 *  解决了线程安全问题
 * 缺点
 *  不能起到线程同步的作用 实际开发中不能使用这种方式
 */
class Singleton5 {

    private Singleton5() {
    }

    private static Singleton5 singleton;

    public static Singleton5 getInstance() {
        if (singleton == null) {
            synchronized (Singleton5.class) {
                singleton = new Singleton5();
            }
        }
        return singleton;
    }
}
