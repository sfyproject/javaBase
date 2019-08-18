package com.sunfy;

/**
 * @Author： sunfy
 * @Date: Created in 15:28 2019-8-18
 */
public class DuckTest {

    public static void main(String[] args) {
        System.out.println("测试鸭子程序");
//        Duck duck = new MallardDuck();
//        Duck duck = new RedheadDuck();
//        Duck duck = new RubberDuck();
//        Duck duck = new BigYellowDuck();
        Duck duck = new SpaceDuck();
        duck.display();
        duck.quack();
        duck.fly();
        System.out.println("测试鸭子程序--完毕");
    }
}
