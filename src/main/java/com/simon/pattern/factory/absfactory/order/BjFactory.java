package com.simon.pattern.factory.absfactory.order;

import com.simon.pattern.factory.absfactory.pizza.BjCheesePizza;
import com.simon.pattern.factory.absfactory.pizza.BjPepperPizza;
import com.simon.pattern.factory.absfactory.pizza.Pizza;

/**
 * @author simon
 * @date 2020/11/7 15:41
 */
public class BjFactory implements Factory {
    @Override
    public Pizza create(String type) {
        Pizza pizza = null;
        if ("cheese".equals(type)) {
            pizza = new BjCheesePizza();
        } else if ("pepper".equals(type)) {
            pizza = new BjPepperPizza();
        }
        return pizza;
    }
}
