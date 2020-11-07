package com.simon.pattern.factory.absfactory.pizza;

/**
 * @author simon
 * @date 2020/11/7 3:11 下午
 */
public class BjPepperPizza extends Pizza {
    @Override
    public void prepare() {
        setName("北京胡椒披萨");
        System.out.println("北京胡椒披萨准备原材料");
    }
}
