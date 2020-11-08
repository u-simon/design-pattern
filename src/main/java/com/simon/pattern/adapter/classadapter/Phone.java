package com.simon.pattern.adapter.classadapter;

/**
 * @author simon
 * @date 2020/11/8 16:46
 */
public class Phone {

    Voltage5v voltage5v;

    public Phone(Voltage5v voltage5v) {
        this.voltage5v = voltage5v;
    }

    public void changing() {
        int i = voltage5v.output5v();
        if (i == 5) {
            System.out.println("手机开始充电");
        } else if (i > 5) {
            System.out.println("电压太高 无法充电");
        }
    }
}
