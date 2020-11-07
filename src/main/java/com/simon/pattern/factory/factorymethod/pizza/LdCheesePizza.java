package com.simon.pattern.factory.factorymethod.pizza;

/**
 * @author simon
 * @date 2020/11/7 3:12 下午
 */
public class LdCheesePizza extends Pizza {
    @Override
    public void prepare() {
        setName("伦敦奶酪披萨");
        System.out.println("伦敦奶酪披萨准备原材料");
    }
}
