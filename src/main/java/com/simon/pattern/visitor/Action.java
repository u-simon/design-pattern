package com.simon.pattern.visitor;

/**
 * @author simon
 * @date 2020/11/22 12:55
 */
public abstract class Action {

    public abstract void getManResult(Person person);

    public abstract void getWomanResult(Person person);
}
