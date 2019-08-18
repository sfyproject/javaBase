package com.sunfy;

/**
 * @Author： sunfy
 * @Date: Created in 18:00 2019-8-17
 */
public class MCFactory implements PersonFactory  {
    public Boy getBoy() {
        return new MCBoy();
    }

    public Girl getGirl() {
        return new MCGirl();
    }
}
