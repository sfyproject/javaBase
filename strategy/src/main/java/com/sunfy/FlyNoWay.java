package com.sunfy;

/**
 * @Author： sunfy
 * @Date: Created in 15:33 2019-8-18
 */
public class FlyNoWay implements FlyingStragety {
    @Override
    public void performFly() {
        System.out.println("我不会飞行");
    }
}
