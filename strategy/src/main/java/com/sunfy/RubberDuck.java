package com.sunfy;

/**
 * @Author： sunfy
 * @Date: Created in 15:34 2019-8-18
 */
public class RubberDuck extends Duck {

    public RubberDuck() {
        super();
        super.setFlyingStragety(new FlyNoWay());
    }

    @Override
    public void display() {
        System.out.println("我是橡胶鸭");
    }

    public void quack(){
        System.out.println("ga·嘎·嘎");
    }
}
