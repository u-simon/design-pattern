package com.simon.pattern.composite;

import java.util.ArrayList;
import java.util.List;

/**
 * @author simon
 * @date 2020/11/14 17:15
 */
public class College extends OrganizationComponent {

    List<OrganizationComponent> departments = new ArrayList<>();

    public College(String name, String desc) {
        super(name, desc);
    }

    @Override
    public void add(OrganizationComponent organizationComponent) {
        departments.add(organizationComponent);
    }

    @Override
    public void remove(OrganizationComponent organizationComponent) {
        departments.remove(organizationComponent);
    }

    @Override
    public void print() {
        System.out.println("--------" + getName() + "---------");

        for (OrganizationComponent department : departments) {
            department.print();
        }
    }
}
