package com.simon.pattern.factory.factorymethod.order;

import com.simon.pattern.factory.factorymethod.pizza.BjCheesePizza;
import com.simon.pattern.factory.factorymethod.pizza.BjPepperPizza;
import com.simon.pattern.factory.factorymethod.pizza.Pizza;

/**
 * @author simon
 * @date 2020/11/7 3:16 下午
 */
public class BjOrderPizza extends OrderPizza{
    @Override
    public Pizza createPizza(String type) {
        Pizza pizza = null;
        if ("cheese".equals(type)){
            pizza = new BjCheesePizza();
        } else if ("pepper".equals(type)){
            pizza = new BjPepperPizza();
        }
        return pizza;
    }
}
