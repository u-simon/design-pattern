package com.simon.pattern.builder;

/**
 * @author simon
 * @date 2020/11/8 15:28
 */
public class HighBuildingBuilder extends AbstractHouseBuilder {
    @Override
    public void buildBasic() {
        house.setBasic("地基");
        System.out.println("高楼打地基50m");
    }

    @Override
    public void buildWalls() {
        house.setWalls("砌墙");
        System.out.println("高楼砌墙20cm");
    }

    @Override
    public void roofed() {
        house.setRoofed("封顶");
        System.out.println("高楼封顶");
    }
}
