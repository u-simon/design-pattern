package com.simon.pattern.factory.absfactory.order;

/**
 * @author simon
 * @date 2020/11/7 15:46
 */
public class Main {

    public static void main(String[] args) {
        new OrderPizza(new BjFactory());
    }
}
