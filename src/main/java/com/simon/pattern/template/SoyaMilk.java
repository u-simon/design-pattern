package com.simon.pattern.template;

/**
 * @author simon
 * @date 2020/11/21 13:54
 */
public abstract class SoyaMilk {

    public final void make() {
        select();
        addCondiments();
        soak();
        beat();
    }

    public void select() {
        System.out.println("第一步:选择好的新鲜黄豆");
    }

    public abstract void addCondiments();

    public void soak() {
        System.out.println("第三步:黄豆和配料开始浸泡 需要3个小时");
    }

    public void beat() {
        System.out.println("第四步:黄豆和配料放到豆浆机去打碎");
    }
}
