package com.simon.pattern.factory.factorymethod.pizza;

/**
 * @author simon
 * @date 2020/11/7 3:10 下午
 */
public class BjCheesePizza extends Pizza {
    @Override
    public void prepare() {
        setName("北京奶酪披萨");
        System.out.println("北京奶酪披萨准备原材料");
    }
}
