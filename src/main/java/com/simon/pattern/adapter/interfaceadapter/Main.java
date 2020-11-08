package com.simon.pattern.adapter.interfaceadapter;

/**
 * @author simon
 * @date 2020/11/8 17:40
 */
public class Main {

    public static void main(String[] args) {
        EventAdapter contentStart = new EventAdapter() {
            @Override
            public void contentRefreshed() {
                System.out.println("监听到容器刷新, 开始进行一些操作");
            }
        };

        contentStart.contentRefreshed();
    }
}
