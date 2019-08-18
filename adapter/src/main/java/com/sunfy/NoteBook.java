package com.sunfy;

/**
 * @Author： sunfy
 * @Date: Created in 14:05 2019-8-18
 */
public class NoteBook {

    private ThreePlugIf plugIf;

    public NoteBook(ThreePlugIf plugIf) {
        this.plugIf = plugIf;
    }

    // 使用插座充电
    public void charge(){
        plugIf.powerWithThree();
    }

    public static void main(String[] args){
        // 创建已有的二相插座实例
        GBTwoPlug twoPlug = new GBTwoPlug();
        // 通过适配器将二相插座转换为三相插座
        ThreePlugIf threePlugIf = new TwoPlugAdapter(twoPlug);
        // 使用经过适配器装换的三相插座给notebook进行供电
        NoteBook noteBook = new NoteBook(threePlugIf);
        noteBook.charge();

        System.out.println("\n =================继承方式======================");
        // 通过适配器将二相插座转换为三相插座
        threePlugIf = new TwoPlugAdapterExtends();
        // 使用经过适配器装换的三相插座给notebook进行供电
        noteBook = new NoteBook(threePlugIf);
        noteBook.charge();
    }
}
