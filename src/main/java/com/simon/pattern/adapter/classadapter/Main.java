package com.simon.pattern.adapter.classadapter;

/**
 * @author simon
 * @date 2020/11/8 16:48
 */
public class Main {

    public static void main(String[] args) {
        Phone phone = new Phone(new VoltageAdapter());
        phone.changing();
    }
}
