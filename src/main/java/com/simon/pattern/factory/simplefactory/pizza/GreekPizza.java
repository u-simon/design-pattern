package com.simon.pattern.factory.simplefactory.pizza;

/**
 * @author simon
 * @date 2020/11/7 2:31 下午
 */
public class GreekPizza extends Pizza {

    @Override
    public void prepare() {
        System.out.println("希腊披萨开始准备原材料");
    }
}
