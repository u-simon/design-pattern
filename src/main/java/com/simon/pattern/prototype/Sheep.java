package com.simon.pattern.prototype;

/**
 * @author simon
 * @date 2020/11/7 16:57
 */
public class Sheep implements Cloneable {

    private String name;

    private String color;

    private Integer age;

    @Override
    public String toString() {
        return "Sheep{" +
                "name='" + name + '\'' +
                ", color='" + color + '\'' +
                ", age=" + age +
                '}';
    }

    public Sheep(String name, String color, Integer age) {
        this.name = name;
        this.color = color;
        this.age = age;
    }


    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
