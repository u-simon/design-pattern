package com.simon.pattern.decorator;

/**
 * @author simon
 * @date 2020/11/14 15:30
 */
public class Main {

    public static void main(String[] args) {
        Drink drink = new LongBlack();
        System.out.println(drink.cost());

        Drink milk = new Milk(drink);
        System.out.println(milk.cost() + "," + milk.getDesc());

        Drink chocolate = new Chocolate(milk);
        System.out.println(chocolate.cost() + "," + chocolate.getDesc());

        Drink chocolate1 = new Chocolate(chocolate);
        System.out.println(chocolate1.cost() + "," + chocolate1.getDesc());

    }
}
