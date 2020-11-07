package com.simon.pattern.factory.simplefactory.pizza;

/**
 * @author simon
 * @date 2020/11/7 2:47 下午
 */
public class PepperPizza extends Pizza{

    @Override
    public void prepare() {
        System.out.println("胡椒披萨准备原材料");
    }
}
