package com.simon.pattern.bridge;

/**
 * @author simon
 * @date 2020/11/14 12:00
 */
public class Main {

    public static void main(String[] args) {
        Phone phone = new FoldedPhone(new XiaoMi());
        phone.open();
        phone.call();
        phone.close();

        System.out.println("----------------");

        Phone phone2 = new FoldedPhone(new Vivo());
        phone2.open();
        phone2.call();
        phone2.close();

        System.out.println("------------------");

        Phone phone3 = new UpRightPhone(new XiaoMi());

        phone3.open();
        phone3.call();
        phone3.close();

        System.out.println("------------------");

        Phone phone4 = new UpRightPhone(new Vivo());

        phone4.open();
        phone4.call();
        phone4.close();
    }
}
