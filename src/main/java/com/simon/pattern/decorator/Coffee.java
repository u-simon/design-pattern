package com.simon.pattern.decorator;

/**
 * @author simon
 * @date 2020/11/14 15:26
 */
public class Coffee extends Drink {

    @Override
    public float cost() {
        return super.getPrice();
    }
}
