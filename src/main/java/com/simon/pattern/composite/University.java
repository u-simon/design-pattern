package com.simon.pattern.composite;

import java.util.ArrayList;
import java.util.List;

/**
 * @author simon
 * @date 2020/11/14 17:13
 */
public class University extends OrganizationComponent {

    List<OrganizationComponent> colleges = new ArrayList<>();

    public University(String name, String desc) {
        super(name, desc);
    }

    @Override
    public void add(OrganizationComponent organizationComponent) {
        colleges.add(organizationComponent);
    }

    @Override
    public void remove(OrganizationComponent organizationComponent) {
        colleges.remove(organizationComponent);
    }

    @Override
    public void print() {
        System.out.println("--------" + getName() + "---------");

        for (OrganizationComponent college : colleges) {
            college.print();
        }
    }
}
