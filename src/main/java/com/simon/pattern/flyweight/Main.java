package com.simon.pattern.flyweight;

/**
 * @author simon
 * @date 2020/11/17 22:52
 */
public class Main {
    public static void main(String[] args) {
        WebSiteFactory factory = new WebSiteFactory();

        WebSite news = factory.getWebSiteCategory("news");
        news.use(new User("tom"));


        WebSite webSite = factory.getWebSiteCategory("博客");
        webSite.use(new User("jack"));

        WebSite webSite1 = factory.getWebSiteCategory("博客");
        webSite1.use(new User("jack"));

        WebSite webSite2 = factory.getWebSiteCategory("博客");
        webSite2.use(new User("jack"));

        WebSite webSite3 = factory.getWebSiteCategory("博客");
        webSite3.use(new User("jack"));

        System.out.println(factory.getWebCount());
    }
}
