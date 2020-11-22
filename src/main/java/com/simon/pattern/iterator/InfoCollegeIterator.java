package com.simon.pattern.iterator;

import java.util.Iterator;
import java.util.List;

/**
 * @author simon
 * @date 2020/11/22 16:05
 */
public class InfoCollegeIterator implements Iterator {
    List<Department> departments;

    private int index = -1;

    public InfoCollegeIterator(List<Department> departments) {
        this.departments = departments;
    }

    @Override
    public boolean hasNext() {
        if (index >= departments.size() - 1) {
            return false;
        }
        index++;
        return true;
    }

    @Override
    public Object next() {
        return departments.get(index);
    }
}
