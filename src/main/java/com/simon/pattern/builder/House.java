package com.simon.pattern.builder;

/**
 * 实际建造的产品 product
 * @author simon
 * @date 2020/11/8 15:23
 */
public class House {

    private String basic;

    private String walls;

    private String roofed;

    @Override
    public String toString() {
        return "House{" +
                "basic='" + basic + '\'' +
                ", walls='" + walls + '\'' +
                ", roofed='" + roofed + '\'' +
                '}';
    }

    public String getBasic() {
        return basic;
    }

    public void setBasic(String basic) {
        this.basic = basic;
    }

    public String getWalls() {
        return walls;
    }

    public void setWalls(String walls) {
        this.walls = walls;
    }

    public String getRoofed() {
        return roofed;
    }

    public void setRoofed(String roofed) {
        this.roofed = roofed;
    }
}
