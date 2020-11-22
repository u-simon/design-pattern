package com.simon.pattern.iterator;

import java.util.Iterator;

/**
 * @author simon
 * @date 2020/11/22 16:13
 */
public class Main {

    public static void main(String[] args) {
        ComputeCollege computeCollege = new ComputeCollege();
        Iterator iterator = computeCollege.createIterator();
        System.out.println("-------" + computeCollege.getName() + " ------");
        print(iterator);

        InfoCollege infoCollege = new InfoCollege();
        System.out.println("-------" + infoCollege.getName() + " ------");
        print(infoCollege.createIterator());

    }

    public static void print(Iterator iterator) {
        while (iterator.hasNext()) {
            System.out.println(((Department) iterator.next()).getName());
        }
    }
}
