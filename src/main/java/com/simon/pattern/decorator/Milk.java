package com.simon.pattern.decorator;

/**
 * @author simon
 * @date 2020/11/14 15:33
 */
public class Milk extends Decorator {
    public Milk(Drink drink) {
        super(drink);
        setDesc("牛奶");
        setPrice(2.0f);
    }
}
