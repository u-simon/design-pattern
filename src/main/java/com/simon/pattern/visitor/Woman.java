package com.simon.pattern.visitor;

/**
 * @author simon
 * @date 2020/11/22 12:56
 */
public class Woman extends Person {
    @Override
    public void accept(Action action) {
        action.getWomanResult(this);
    }
}
