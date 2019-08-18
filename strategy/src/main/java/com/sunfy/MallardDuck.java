package com.sunfy;

import com.sunfy.impl.FlyWithWin;

/**
 * @Author： sunfy
 * @Date: Created in 14:53 2019-8-18
 */
public class MallardDuck extends Duck{

    public MallardDuck(){
        super();
        super.setFlyingStragety(new FlyWithWin());
    }

    @Override
    public void display() {
        System.out.println("我的脖子是绿色的");
    }
}
