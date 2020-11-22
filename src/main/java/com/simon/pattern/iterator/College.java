package com.simon.pattern.iterator;

import java.util.Iterator;

/**
 * @author simon
 * @date 2020/11/22 16:07
 */
public interface College {

    public String getName();

    public void addDepartment(String name, String desc);

    public Iterator createIterator();
}
