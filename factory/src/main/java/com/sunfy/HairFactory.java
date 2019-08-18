package com.sunfy;

import java.util.Map;

/**
 * 发型工厂
 * @Author： sunfy
 * @Date: Created in 23:10 2019-8-14
 */
public class HairFactory {

    /**
     * 根据key值生成
     * @Date: 2019-8-14  23:11
     * @Author: sunfy
     */
    public HairInterface getHair(String key){
        if("left".equals(key)){
            return new LeftHair();
        }else if ("right".equals(key)){
            return new RightHair();
        }
        return null;
    }

    public HairInterface getHairByClass(String className){
        try {
            HairInterface hair = (HairInterface) Class.forName(className).newInstance();
            return hair;
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return null;
    }

    public HairInterface getHairByKey(String key){
        try {
            Map<String,String> map = new PropertiesReader().getProperties();
            HairInterface hair = (HairInterface) Class.forName(map.get(key)).newInstance();
            return hair;
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return null;
    }
}
