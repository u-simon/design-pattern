package com.simon.pattern.visitor;

/**
 * @author simon
 * @date 2020/11/22 12:56
 */
public class Man extends Person {
    @Override
    public void accept(Action action) {
        action.getManResult(this);
    }
}
