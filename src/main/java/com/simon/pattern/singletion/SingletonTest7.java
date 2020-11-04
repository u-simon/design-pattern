package com.simon.pattern.singletion;

/**
 * @author simon
 * @date 2020/11/3 10:55 下午
 */
public class SingletonTest7 {

    public static void main(String[] args) {
        Singleton7 instance = Singleton7.getInstance();
        Singleton7 instance1 = Singleton7.getInstance();
        System.out.println(instance == instance1);
        System.out.println(instance.hashCode());
        System.out.println(instance1.hashCode());
    }
}

/**
 * 静态内部类
 * 优点
 * 1. 这种方式采用了类装载的机制来保证初始化实例时只有一个线程
 * 2. 静态内部类方式在Singleton类被装载时并不会立即实例化，而是在需要实例化时，调用getInstance方法，才会装载 SingletonInstance 类，从而完成 Singleton 的实例化
 * 3. 类的静态属性只会在第一次加载类的时候初始化，所以在这里，JVM帮助我们保证了线程的安全性，在类进行初始化时，别的线程是无法进入的
 * 4. 避免了线程不安全，利用静态内部类特点实现延迟加载，效率高
 */
class Singleton7 {

    private Singleton7() {
    }

    private static class SingletonInstance {
        private static final Singleton7 INSTANCE = new Singleton7();
    }

    public static Singleton7 getInstance() {
        return SingletonInstance.INSTANCE;
    }
}
