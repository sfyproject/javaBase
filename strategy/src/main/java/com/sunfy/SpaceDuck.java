package com.sunfy;

import com.sunfy.impl.FlyWithRocket;

/**
 * @Author： sunfy
 * @Date: Created in 15:42 2019-8-18
 */
public class SpaceDuck extends Duck {
    public SpaceDuck() {
        super();
        super.setFlyingStragety(new FlyWithRocket());
    }

    @Override
    public void display() {
        System.out.println("我是太空鸭");
    }

    public void quack(){
        System.out.println("通过无线电叫");
    }
}
