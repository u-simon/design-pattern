package com.simon.pattern.builder;

/**
 * @author simon
 * @date 2020/11/8 15:29
 */
public class HouseDirector {

    private AbstractHouseBuilder builder;

    public void setBuilder(AbstractHouseBuilder builder) {
        this.builder = builder;
    }


    public House construct() {
        builder.buildBasic();
        builder.buildWalls();
        builder.roofed();
        return builder.build();
    }
}
