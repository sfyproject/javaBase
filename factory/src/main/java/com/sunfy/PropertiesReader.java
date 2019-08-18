package com.sunfy;

import java.io.IOException;
import java.io.InputStream;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

/**
 * properties 读取类
 * @Author： sunfy
 * @Date: Created in 23:22 2019-8-14
 */
public class PropertiesReader {

    public Map<String,String> getProperties(){
        Properties properties = new Properties();
        Map<String,String> map = new HashMap<String, String>();
//        ClassLoader cl = ClassLoader.class.getClassLoader();
        InputStream inputStream;
        ClassLoader cl = ClassLoader.class .getClassLoader();

        try {
//            if  (cl !=  null ) {
//                inputStream = cl.getResourceAsStream( "test.properties" );
//            }  else {
//                inputStream = ClassLoader.getSystemResourceAsStream( "test.properties" );
//            }
////            InputStream inputStream = cl.getResourceAsStream("type.properties");
//            inputStream = Properties.class.getClassLoader().getResourceAsStream("test.properties");
            inputStream = ClassLoader.getSystemResourceAsStream("test.properties");
            properties.load(inputStream);
            Enumeration enumeration = properties.propertyNames();
            while (enumeration.hasMoreElements()){
                String key = (String) enumeration.nextElement();
                String property = properties.getProperty(key);
                map.put(key,property);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return map;
    }
}
