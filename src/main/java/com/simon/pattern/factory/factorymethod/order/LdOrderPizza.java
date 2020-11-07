package com.simon.pattern.factory.factorymethod.order;

import com.simon.pattern.factory.factorymethod.pizza.LdCheesePizza;
import com.simon.pattern.factory.factorymethod.pizza.LdPepperPizza;
import com.simon.pattern.factory.factorymethod.pizza.Pizza;

/**
 * @author simon
 * @date 2020/11/7 3:18 下午
 */
public class LdOrderPizza extends OrderPizza {
    @Override
    public Pizza createPizza(String type) {
        Pizza pizza = null;
        if ("cheese".equals(type)){
            pizza = new LdCheesePizza();
        } else if ("pepper".equals(type)){
            pizza = new LdPepperPizza();
        }
        return pizza;
    }
}
