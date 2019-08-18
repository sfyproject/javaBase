package com.sunfy;

/**
 * @Author： sunfy
 * @Date: Created in 18:02 2019-8-17
 */
public class HNFactory implements PersonFactory {
    public Boy getBoy() {
        return new HNBoy();
    }

    public Girl getGirl() {
        return new HNGirl();
    }
}
