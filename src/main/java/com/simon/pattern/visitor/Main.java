package com.simon.pattern.visitor;

/**
 * @author simon
 * @date 2020/11/22 13:02
 */
public class Main {

    public static void main(String[] args) {
        ObjectStructure structure = new ObjectStructure();

        structure.attach(new Man());
        structure.attach(new Woman());

        Action success = new Success();
        structure.display(success);
        System.out.println("-----------------");

        Action fail = new Fail();
        structure.display(fail);
    }
}
