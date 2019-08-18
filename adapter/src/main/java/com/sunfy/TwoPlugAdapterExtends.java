package com.sunfy;

/**
 * 采用继承方式的插座适配器
 * @Author： sunfy
 * @Date: Created in 14:21 2019-8-18
 */
public class TwoPlugAdapterExtends extends GBTwoPlug implements ThreePlugIf {
    @Override
    public void powerWithThree() {
        System.out.println("使用继承的方式进行适配");
        // 因为继承了GBTwoPlug 所以可以调用父类中的所有方法和变量
        this.powerWithTwo();
    }
}
