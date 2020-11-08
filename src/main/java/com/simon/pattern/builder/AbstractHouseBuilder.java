package com.simon.pattern.builder;

/**
 * @author simon
 * @date 2020/11/8 15:24
 */
public abstract class AbstractHouseBuilder {

    protected House house = new House();

    /**
     * 打地基
     */
    public abstract void buildBasic();

    /**
     * 砌墙
     */
    public abstract void buildWalls();


    /**
     * 封顶
     */
    public abstract void roofed();


    public House build() {
        return this.house;
    }
}
