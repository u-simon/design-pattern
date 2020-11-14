package com.simon.pattern.decorator;

/**
 * @author simon
 * @date 2020/11/14 15:31
 */
public class Decorator extends Drink {
    private Drink drink;

    public Decorator(Drink drink) {
        this.drink = drink;
    }

    @Override
    public float cost() {
        return super.getPrice() + drink.cost();
    }

    @Override
    public String getDesc() {
        return  desc + " " + price + " && " + drink.desc + " " + drink.price;
    }
}
