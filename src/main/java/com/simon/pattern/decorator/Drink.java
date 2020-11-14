package com.simon.pattern.decorator;

/**
 * @author simon
 * @date 2020/11/14 15:24
 */
public abstract class Drink {

    protected String desc;

    protected Float price;


    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public Float getPrice() {
        return price;
    }

    public void setPrice(Float price) {
        this.price = price;
    }

    /**
     * 花费
     *
     * @return
     */
    public abstract float cost();
}
