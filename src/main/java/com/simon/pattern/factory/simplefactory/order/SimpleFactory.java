package com.simon.pattern.factory.simplefactory.order;

import com.simon.pattern.factory.simplefactory.pizza.CheesePizza;
import com.simon.pattern.factory.simplefactory.pizza.GreekPizza;
import com.simon.pattern.factory.simplefactory.pizza.Pizza;

/**
 * @author simon
 * @date 2020/11/7 2:32 下午
 */
public class SimpleFactory {

    public Pizza createPizza(String type) {
        Pizza pizza = null;
        if ("greek".equals(type)) {
            pizza = new GreekPizza();
            pizza.setName("希腊披萨");
        } else if ("cheese".equals(type)) {
            pizza = new CheesePizza();
            pizza.setName("奶酪披萨");
        }
        return pizza;
    }
}
