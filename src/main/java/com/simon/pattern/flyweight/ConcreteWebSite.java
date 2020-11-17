package com.simon.pattern.flyweight;

/**
 * @author simon
 * @date 2020/11/17 22:49
 */
public class ConcreteWebSite extends WebSite {
    private final String type;

    public ConcreteWebSite(String type) {
        this.type = type;
    }

    @Override
    public void use(User user) {
        System.out.println("网站的发布方式为： " + type + " 使用者为: " + user.getName());
    }
}
