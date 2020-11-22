package com.simon.pattern.visitor;

import java.util.LinkedList;
import java.util.List;

/**
 * @author simon
 * @date 2020/11/22 12:59
 */
public class ObjectStructure {
    private List<Person> persons = new LinkedList<>();


    public void attach(Person person) {
        persons.add(person);
    }

    public void detach(Person person) {
        persons.remove(person);
    }

    public void display(Action action) {
        for (Person person : persons) {
            person.accept(action);
        }
    }
}
