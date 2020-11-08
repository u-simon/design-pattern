package com.simon.pattern.adapter.objectadapter;

/**
 * @author simon
 * @date 2020/11/8 16:48
 */
public class Main {

    public static void main(String[] args) {
        Phone phone = new Phone();
        phone.changing(new VoltageAdapter(new Voltage220v()));
    }
}
