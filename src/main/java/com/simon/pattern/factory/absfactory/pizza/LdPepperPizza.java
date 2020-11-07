package com.simon.pattern.factory.absfactory.pizza;

/**
 * @author simon
 * @date 2020/11/7 3:13 下午
 */
public class LdPepperPizza extends Pizza {
    @Override
    public void prepare() {
        setName("伦敦胡椒披萨");
        System.out.println("伦敦胡椒披萨准备原材料");
    }
}
