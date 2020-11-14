package com.simon.pattern.composite;

/**
 * @author simon
 * @date 2020/11/14 17:16
 */
public class Department extends OrganizationComponent {


    public Department(String name, String desc) {
        super(name, desc);
    }

    @Override
    public void print() {
        System.out.println(getName());
    }
}
