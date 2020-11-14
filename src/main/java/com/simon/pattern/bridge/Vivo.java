package com.simon.pattern.bridge;

/**
 * @author simon
 * @date 2020/11/14 11:56
 */
public class Vivo implements Brand {
    @Override
    public void open() {
        System.out.println("Vivo手机开机");
    }

    @Override
    public void call() {
        System.out.println("vivo手机打电话");
    }

    @Override
    public void close() {
        System.out.println("vivo手机关机");
    }
}
