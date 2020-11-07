package com.simon.pattern.factory.simplefactory.order;

import com.simon.pattern.factory.simplefactory.pizza.Pizza;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author simon
 * @date 2020/11/7 2:35 下午
 */
public class OrderPizza {

    SimpleFactory simpleFactory;
    Pizza pizza;

    public OrderPizza() {
        setSimpleFactory(new SimpleFactory());
    }


    public void setSimpleFactory(SimpleFactory simpleFactory) {
        this.simpleFactory = simpleFactory;
        do {
            String type = getType();
            pizza = simpleFactory.createPizza(type);
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
