package com.simon.pattern.template;

/**
 * @author simon
 * @date 2020/11/21 14:00
 */
public class Main {

    public static void main(String[] args) {
        System.out.println("制作红豆豆浆");
        SoyaMilk redBean = new RedBeanSoyMilk();
        redBean.make();

        System.out.println("制作花生豆浆");
        SoyaMilk peanut = new PeanutSoyMilk();
        peanut.make();
    }
}
