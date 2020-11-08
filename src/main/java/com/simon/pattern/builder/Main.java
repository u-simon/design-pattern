package com.simon.pattern.builder;

/**
 * @author simon
 * @date 2020/11/8 15:31
 */
public class Main {

    public static void main(String[] args) {
        HouseDirector houseDirector = new HouseDirector();
        houseDirector.setBuilder(new CommonHouseBuilder());
        House commonHouse = houseDirector.construct();
        System.out.println(commonHouse);


        houseDirector.setBuilder(new HighBuildingBuilder());
        House construct = houseDirector.construct();
        System.out.println(construct);
    }
}
