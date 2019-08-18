package com.sunfy;

/**
 * @Author： sunfy
 * @Date: Created in 15:37 2019-8-18
 */
public class BigYellowDuck extends Duck {
    public BigYellowDuck() {
        super();
        super.setFlyingStragety(new FlyNoWay());
    }

    @Override
    public void display() {
        System.out.println("我是大黄鸭");
    }


}
