package com.simon.pattern.bridge;

/**
 * @author simon
 * @date 2020/11/14 11:58
 */
public class FoldedPhone extends Phone {


    public FoldedPhone(Brand brand) {
        super(brand);
    }

    @Override
    public void open() {
        super.open();
        System.out.println("折叠手机开机");
    }

    @Override
    public void call() {
        super.call();
        System.out.println("折叠手机打电话");
    }

    @Override
    public void close() {
        super.close();
        System.out.println("折叠手机关机");
    }
}
