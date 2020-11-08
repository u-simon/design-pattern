package com.simon.pattern.adapter.classadapter;

import javax.lang.model.type.DeclaredType;

/**
 * @author simon
 * @date 2020/11/8 16:45
 */
public class VoltageAdapter extends Voltage220v implements Voltage5v{
    @Override
    public int output5v() {
        int src = this.output220v();
        int dest = src / 44;
        return dest ;
    }
}
