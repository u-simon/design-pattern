package com.simon.pattern.visitor;

/**
 * @author simon
 * @date 2020/11/22 12:56
 */
public abstract class Person {

    public abstract void accept(Action action);
}
