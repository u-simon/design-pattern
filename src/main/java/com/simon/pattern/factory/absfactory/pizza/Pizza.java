package com.simon.pattern.factory.absfactory.pizza;

/**
 * @author simon
 * @date 2020/11/7 3:09 下午
 */
public abstract class Pizza {

    private String name;

    public abstract void prepare();

    public void bake() {
        System.out.println(this.name + " 披萨开始烘焙 ");
    }


    public void cut() {
        System.out.println(this.name + " 披萨开始切割 ");
    }

    public void box() {
        System.out.println(this.name + " 开始打包 ");
    }

    public void setName(String name) {
        this.name = name;
    }
}
