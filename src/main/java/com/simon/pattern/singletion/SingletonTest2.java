package com.simon.pattern.singletion;

/**
 * @author simon
 * @date 2020/11/3 10:48 下午
 */
public class SingletonTest2 {

    public static void main(String[] args) {
        Singleton2 instance = Singleton2.getInstance();
        Singleton2 instance1 = Singleton2.getInstance();
        System.out.println(instance == instance1);
        System.out.println(instance.hashCode());
        System.out.println(instance1.hashCode());
    }
}

/**
 * 饿汉式(静态代码块)
 * 优点
 * 写法比较简单 在类装载的时候就完成实例化 避免了线程同步问题
 * 缺点
 * 在类装载的时候就完成实例化 没有达到lazy loading的效果 如果从始至终从未使用过这个实例，则会造成内存的浪费
 */
class Singleton2 {
    private Singleton2() {

    }

    private static Singleton2 singleton;

    static {
        singleton = new Singleton2();
    }

    public static Singleton2 getInstance() {
        return singleton;
    }

}