package com.simon.pattern.decorator;

/**
 * @author simon
 * @date 2020/11/14 15:33
 */
public class Soy extends Decorator {
    public Soy(Drink drink) {
        super(drink);
        setDesc("豆浆");
        setPrice(1.0f);
    }
}
