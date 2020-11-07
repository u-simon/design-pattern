package com.simon.pattern.prototype;

/**
 * @author simon
 * @date 2020/11/7 17:00
 */
public class Main {


    public static void main(String[] args) throws CloneNotSupportedException {
        Sheep sheep = new Sheep("tom", "white", 2);

        Sheep sheep2 = (Sheep) sheep.clone();
        Sheep sheep3 = (Sheep) sheep.clone();
        Sheep sheep4 = (Sheep) sheep.clone();
        Sheep sheep5 = (Sheep) sheep.clone();

        System.out.println(sheep);
        System.out.println(sheep2);
        System.out.println(sheep3);
        System.out.println(sheep4);
        System.out.println(sheep5);
    }
}
