package com.simon.pattern.factory.absfactory.order;

import com.simon.pattern.factory.absfactory.pizza.LdCheesePizza;
import com.simon.pattern.factory.absfactory.pizza.LdPepperPizza;
import com.simon.pattern.factory.absfactory.pizza.Pizza;

/**
 * @author simon
 * @date 2020/11/7 15:42
 */
public class LdFactory implements Factory {
    @Override
    public Pizza create(String type) {
        Pizza pizza = null;
        if ("cheese".equals(type)) {
            pizza = new LdCheesePizza();
        } else if ("pepper".equals(type)) {
            pizza = new LdPepperPizza();
        }
        return pizza;
    }
}
