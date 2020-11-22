package com.simon.pattern.iterator;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/**
 * @author simon
 * @date 2020/11/22 16:12
 */
public class InfoCollege implements College {
    List<Department> departmentList;

    public InfoCollege() {
        departmentList = new LinkedList<>();
        addDepartment("通信专业", "通信专业");
    }

    @Override
    public String getName() {
        return "信息学院";
    }

    @Override
    public void addDepartment(String name, String desc) {
        departmentList.add(new Department(name, desc));
    }

    @Override
    public Iterator createIterator() {
        return new InfoCollegeIterator(departmentList);
    }
}
