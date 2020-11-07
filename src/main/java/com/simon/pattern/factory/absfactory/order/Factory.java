package com.simon.pattern.factory.absfactory.order;

import com.simon.pattern.factory.absfactory.pizza.Pizza;

/**
 * @author simon
 * @date 2020/11/7 15:40
 */
public interface Factory {

    /**
     *
     * @param type
     * @return
     */
    public Pizza create(String type);
}
