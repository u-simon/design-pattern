package com.simon.pattern.bridge;

/**
 * @author simon
 * @date 2020/11/14 12:03
 */
public class UpRightPhone extends Phone {
    public UpRightPhone(Brand brand) {
        super(brand);
    }

    @Override
    public void open() {
        super.open();
        System.out.println("直立手机开机");
    }

    @Override
    public void call() {
        super.call();
        System.out.println("直立手机打电话");
    }

    @Override
    public void close() {
        super.close();
        System.out.println("直立手机关机");
    }
}
