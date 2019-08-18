package com.sunfy;

/**
 * 茶
 * @Author： sunfy
 * @Date: Created in 9:12 2019-8-18
 */
public class Tea extends RefreshBeverage{
    @Override
    protected void brew() {
        System.out.println("用80度的热水浸泡茶叶五分钟");
    }

    @Override
    protected void addCondiments() {
        System.out.println("加入调味料");
    }
}
