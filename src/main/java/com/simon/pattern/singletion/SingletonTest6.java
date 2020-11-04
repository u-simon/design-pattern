package com.simon.pattern.singletion;

/**
 * @author simon
 * @date 2020/11/3 10:55 下午
 */
public class SingletonTest6 {

    public static void main(String[] args) {
        Singleton6 instance = Singleton6.getInstance();
        Singleton6 instance1 = Singleton6.getInstance();
        System.out.println(instance == instance1);
        System.out.println(instance.hashCode());
        System.out.println(instance1.hashCode());
    }
}

/**
 * 懒汉式(线程安全写法,Double Check)
 * 优点
 *  线程安全，延迟加载，效率较高 实际开发中推荐使用
 */
class Singleton6 {

    private Singleton6() {
    }

    private static volatile Singleton6 singleton;

    public static Singleton6 getInstance() {
        if (singleton == null) {
            synchronized (Singleton6.class) {
                if (singleton == null) {
                    singleton = new Singleton6();
                }
            }
        }
        return singleton;
    }
}
