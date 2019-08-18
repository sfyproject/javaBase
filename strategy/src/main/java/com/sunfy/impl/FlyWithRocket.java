package com.sunfy.impl;

import com.sunfy.FlyingStragety;

/**
 * @Author： sunfy
 * @Date: Created in 15:41 2019-8-18
 */
public class FlyWithRocket implements FlyingStragety {
    @Override
    public void performFly() {
        System.out.println("用火箭进行飞行");
    }
}
