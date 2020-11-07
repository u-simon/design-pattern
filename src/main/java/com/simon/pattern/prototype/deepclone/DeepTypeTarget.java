package com.simon.pattern.prototype.deepclone;

import java.io.Serializable;

/**
 * @author simon
 * @date 2020/11/7 17:34
 */
public class DeepTypeTarget implements Serializable, Cloneable {

    private static final long serialVersionUID = 7780054443423087647L;
    private String name;

    private String desc;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public DeepTypeTarget(String name, String desc) {
        this.name = name;
        this.desc = desc;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
