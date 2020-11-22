package com.simon.pattern.iterator;

import java.util.Iterator;

/**
 * @author simon
 * @date 2020/11/22 16:08
 */
public class ComputeCollege implements College {

    Department[] departments;
    int numOfDepartment = 0;

    public ComputeCollege() {
        departments = new Department[5];
        addDepartment("java专业", "java专业");
        addDepartment("php专业", "php专业");
        addDepartment("大数据专业", "大数据专业");
    }

    @Override
    public String getName() {
        return "计算机学院";
    }

    @Override
    public void addDepartment(String name, String desc) {
        Department department = new Department(name, desc);
        departments[numOfDepartment++] = department;
    }

    @Override
    public Iterator createIterator() {
        return new ComputeCollegeIterator(departments);
    }
}
