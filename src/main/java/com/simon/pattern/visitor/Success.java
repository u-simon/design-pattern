package com.simon.pattern.visitor;

/**
 * @author simon
 * @date 2020/11/22 12:57
 */
public class Success extends Action {
    @Override
    public void getManResult(Man person) {
        System.out.println("男人给的评价是歌手很成功");
    }

    @Override
    public void getWomanResult(Woman person) {
        System.out.println("女人给的评价是歌手很成功");
    }
}
