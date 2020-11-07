package com.simon.pattern.factory.factorymethod.order;

import com.simon.pattern.factory.factorymethod.pizza.Pizza;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author simon
 * @date 2020/11/7 3:14 下午
 */
public abstract class OrderPizza {

    Pizza pizza;

    public OrderPizza() {
        do {
            String type = getType();
            pizza = createPizza(type);
            if (pizza == null) {
                System.out.println("订购披萨失败");
                break;
            }
            pizza.prepare();
            pizza.bake();
            pizza.cut();
            pizza.box();

        } while (true);
    }

    public abstract Pizza createPizza(String type);

    private String getType() {
        try {
            BufferedReader strin = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("input pizza 种类:");
            return strin.readLine();
        } catch (IOException e) {
            e.printStackTrace();
            return "";
        }
    }
}
