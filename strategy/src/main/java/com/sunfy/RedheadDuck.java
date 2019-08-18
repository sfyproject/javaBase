package com.sunfy;

import com.sunfy.impl.FlyWithWin;

/**
 * @Author： sunfy
 * @Date: Created in 14:53 2019-8-18
 */
public class RedheadDuck extends Duck{
    public RedheadDuck() {
        super();
        super.setFlyingStragety(new FlyWithWin());
    }

    @Override
    public void display() {
        System.out.println("我的头是红色的");
    }
}
