package com.simon.pattern.singletion;

/**
 * @author simon
 * @date 2020/11/3 10:55 下午
 */
public class SingletonTest8 {

    public static void main(String[] args) {
        Singleton8 instance = Singleton8.INSTANCE;
        Singleton8 instance2 = Singleton8.INSTANCE;
        System.out.println(instance == instance2);
        System.out.println(instance.hashCode());
        System.out.println(instance2.hashCode());
        instance.sayOk();
    }
}

/**
 */
enum Singleton8 {
    /**
     *
     */
    INSTANCE;

    public void sayOk(){
        System.out.println("ok");
    }
}
