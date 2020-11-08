package com.simon.pattern.builder;

/**
 * @author simon
 * @date 2020/11/8 15:27
 */
public class CommonHouseBuilder extends AbstractHouseBuilder {
    @Override
    public void buildBasic() {
        house.setBasic("地基");
        System.out.println("普通房子打地基10m");
    }

    @Override
    public void buildWalls() {
        house.setWalls("砌墙");
        System.out.println("普通房子砌墙10cm");
    }

    @Override
    public void roofed() {
        house.setRoofed("封顶");
        System.out.println("普通房子封顶");
    }
}
