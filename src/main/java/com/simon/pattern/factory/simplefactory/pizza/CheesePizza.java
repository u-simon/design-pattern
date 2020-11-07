package com.simon.pattern.factory.simplefactory.pizza;

/**
 * @author simon
 * @date 2020/11/7 2:29 下午
 */
public class CheesePizza extends Pizza {

    @Override
    public void prepare() {
        System.out.println("奶酪披萨开始准备原材料 ");
    }
}
