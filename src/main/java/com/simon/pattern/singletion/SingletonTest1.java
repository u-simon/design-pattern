package com.simon.pattern.singletion;

/**
 * @author simon
 * @date 2020/11/3 10:40 下午
 */
public class SingletonTest1 {

    public static void main(String[] args) {
        Singleton instance = Singleton.getInstance();
        Singleton instance1 = Singleton.getInstance();
        System.out.println(instance == instance1);
        System.out.println(instance.hashCode());
        System.out.println(instance1.hashCode());
    }
}

/**
 * 饿汉式 (静态常量)
 * 优点
 *  写法比较简单 在类装载的时候就完成实例化 避免了线程同步问题
 * 缺点
 *  在类装载的时候就完成实例化 没有达到lazy loading的效果 如果从始至终从未使用过这个实例，则会造成内存的浪费
 */
class Singleton {

    private Singleton() {

    }

    private static final Singleton singleton = new Singleton();

    public static Singleton getInstance(){
        return singleton;
    }
}
