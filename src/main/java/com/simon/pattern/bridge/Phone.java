package com.simon.pattern.bridge;

/**
 * @author simon
 * @date 2020/11/14 11:56
 */
public abstract class Phone {
    Brand brand;

    public Phone(Brand brand) {
        this.brand = brand;
    }

    public void open() {
        this.brand.open();
    }

    public void call() {
        this.brand.call();
    }

    public void close() {
        this.brand.close();
    }
}
