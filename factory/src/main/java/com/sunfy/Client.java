package com.sunfy;

import java.util.Map;

/**
 * @Author： sunfy
 * @Date: Created in 23:07 2019-8-14
 */
public class Client {

    public static void main(String[] args) {

        // 最开始 直接创建
//        HairInterface hair = new LeftHair();
//        hair.darw();

        // 根据key进行生成
        HairFactory hairFactory = new HairFactory();
//        HairInterface hair = hairFactory.getHair("right");
//        hair.darw();

        // 根据类的反射机制调用
//        HairInterface hair = hairFactory.getHairByClass("com.sunfy.LeftHair");
//        hair.darw();

        // 配置 properties

//        String ip = TestResManager.getInstance().getCfg("left");
//        int port = Integer.parseInt(TestResManager.getInstance().getCfg("Dserver_Port"));

        String cl = TestMain.readValue("E:\\Workspaces\\GitHub\\GitHub-IDEA\\javaBase\\factory\\src\\main\\resources\\type.properties", "right");
//        PropertiesReader propertiesReader = new PropertiesReader();
//        Map<String,String> map = propertiesReader.getProperties();
//        HairInterface hair = hairFactory.getHairByClass(map.get("left"));
        HairInterface hair = hairFactory.getHairByClass(cl);
        hair.darw();

        PersonFactory factory = new HNFactory();
        Boy boy = factory.getBoy();
        boy.drawMan();

    }
}
