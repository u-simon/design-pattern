package com.simon.pattern.decorator;

/**
 * @author simon
 * @date 2020/11/14 16:14
 */
public class Chocolate extends Decorator {
    public Chocolate(Drink drink) {
        super(drink);
        setDesc("巧克力");
        setPrice(4.5f);
    }
}
