package com.simon.pattern.singletion;

/**
 * @author simon
 * @date 2020/11/3 10:50 下午
 */
public class SingletonTest3 {
    public static void main(String[] args) {
        Singleton3 instance = Singleton3.getInstance();
        Singleton3 instance1 = Singleton3.getInstance();
        System.out.println(instance == instance1);
        System.out.println(instance.hashCode());
        System.out.println(instance1.hashCode());
    }
}

/**
 * 懒汉式(线程不安全)
 * 优点
 *  起到了lazy loading的效果
 * 缺点
 *  线程不安全，只能在单线程下使用
 */
class Singleton3 {

    private Singleton3() {
    }

    private static Singleton3 singleton;

    public static Singleton3 getInstance() {
        if (singleton == null) {
            singleton = new Singleton3();
        }
        return singleton;
    }
}
