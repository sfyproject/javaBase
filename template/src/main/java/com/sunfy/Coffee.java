package com.sunfy;

import javafx.beans.binding.BooleanBinding;

/**
 * 具体子类，咖啡
 * @Author： sunfy
 * @Date: Created in 9:07 2019-8-18
 */
public class Coffee extends RefreshBeverage {
    @Override
    protected void brew() {
        System.out.println("冲泡咖啡");
    }
    @Override
    protected void addCondiments() {
        System.out.println("加入糖和牛奶");
    }

    @Override
    protected boolean isCustomWantsCondiments(){
        return false;
    }
}
