package com.sunfy;

/**
 * 适配器（现在只有二相的，但是需要的是三相的）
 * 此时适配器将通过此类 使用二相的插座给三相需求进行供电
 * @Author： sunfy
 * @Date: Created in 14:10 2019-8-18
 */
public class TwoPlugAdapter implements ThreePlugIf {

    private GBTwoPlug gbTwoPlug;

    public TwoPlugAdapter(GBTwoPlug gbTwoPlug){
        this.gbTwoPlug = gbTwoPlug;
    }

    @Override
    public void powerWithThree() {
        System.out.println("通过适配器，使用二相电给三相供电");
        gbTwoPlug.powerWithTwo();
    }
}
