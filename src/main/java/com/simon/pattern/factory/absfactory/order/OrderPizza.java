package com.simon.pattern.factory.absfactory.order;

import com.simon.pattern.factory.absfactory.pizza.Pizza;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author simon
 * @date 2020/11/7 15:43
 */
public class OrderPizza {


    Factory factory;

    public OrderPizza(Factory factory) {
        setFactory(factory);
    }

    public void setFactory(Factory factory) {
        this.factory = factory;

        Pizza pizza;
        String type = null;
        do {
            type = getType();
            pizza = factory.create(type);
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
