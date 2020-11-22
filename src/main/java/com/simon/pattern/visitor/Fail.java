package com.simon.pattern.visitor;

/**
 * @author simon
 * @date 2020/11/22 12:58
 */
public class Fail extends Action {
    @Override
    public void getManResult(Person person) {
        System.out.println("男人给的评价是歌手很失败");
    }

    @Override
    public void getWomanResult(Person person) {
        System.out.println("女人给的评价是歌手很失败");
    }
}
