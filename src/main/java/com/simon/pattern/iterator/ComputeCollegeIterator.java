package com.simon.pattern.iterator;

import java.util.Iterator;

/**
 * @author simon
 * @date 2020/11/22 16:04
 */
public class ComputeCollegeIterator implements Iterator {
    Department[] departments;
    int index = 0;

    public ComputeCollegeIterator(Department[] departments) {
        this.departments = departments;
    }

    @Override
    public boolean hasNext() {
        if (index >= departments.length || departments[index] == null) {
            return false;
        }
        return true;
    }

    @Override
    public Object next() {
        return departments[index++];
    }
}
