package com.simon.pattern.flyweight;

/**
 * @author simon
 * @date 2020/11/17 22:49
 */
public class User {
    private String name;

    public User(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
