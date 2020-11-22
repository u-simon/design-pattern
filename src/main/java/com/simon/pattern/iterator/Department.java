package com.simon.pattern.iterator;

/**
 * @author simon
 * @date 2020/11/22 16:03
 */
public class Department {

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

    public Department(String name, String desc) {
        this.name = name;
        this.desc = desc;
    }
}
