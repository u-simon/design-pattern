package com.simon.pattern.visitor;

/**
 * @author simon
 * @date 2020/11/22 12:55
 */
public abstract class Action {

    public abstract void getManResult(Man man);

    public abstract void getWomanResult(Woman woman);
}
