package com.simon.pattern.adapter.objectadapter;

/**
 * @author simon
 * @date 2020/11/8 16:45
 */
public class VoltageAdapter implements Voltage5v {

    private Voltage220v voltage220v;

    public VoltageAdapter(Voltage220v voltage220v) {
        this.voltage220v = voltage220v;
    }

    @Override
    public int output5v() {
        System.out.println("对象适配器模式.....");
        int src = voltage220v.output220v();
        int dest = src / 44;
        return dest;
    }
}
