package com.sunfy;

/**
 * 抽象基类（abstract修饰），为所有子类提供一个算法框架
 * @Author： sunfy
 * @Date: Created in 18:53 2019-8-17
 */
public abstract class RefreshBeverage {

    /**
     * final--阻止子类对该方法的复写
     *
     * 制备饮料
     * 封装了所有子类共同遵循的算法框架
     */
    public final void prepareBeverageTemplate(){
        // 步骤1 将水煮沸
        boilWater();
        // 炮制饮料
        brew();
        // 将饮料倒入杯中
        pourInCup();
        /*
        使用是一个钩子方法，根据用户自己的喜欢，判断是否需要该步骤
         */
        if(isCustomWantsCondiments()){
            // 加入调味料
            addCondiments();
        }

    }

    /**
     * 询问用户是否需要加入饮料
     * Hook，钩子函数，提供一个默认或空的实现，具体子类可以自行决定是否挂钩以及如何实现
     * @return
     */
    protected boolean isCustomWantsCondiments() {
        return true;
    }

    /**
     * 基本方法，将水煮沸（所有方法一直，改为私有）
     */
    private void boilWater() {
        System.out.println("将水煮沸");
    }

    protected abstract void brew();

    /**
     * 子类需要自定义，定义为抽象方法,子类可以访问，进行复写
     */
    private void pourInCup(){
        System.out.println("将饮料倒入杯中");
    };

    protected abstract void addCondiments();

}
