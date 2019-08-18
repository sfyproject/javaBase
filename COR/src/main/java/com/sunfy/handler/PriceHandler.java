package com.sunfy.handler;

import java.io.PipedReader;

/**
 * 价格处理人负责处理折扣申请
 * @Author： sunfy
 * @Date: Created in 10:55 2019-8-18
 */
public abstract class PriceHandler {

    /**
     * 指向自身类型的引用
     * 使用protected 子类都能够访问
     * 直接后继，用于传递请求
     */
    protected PriceHandler successor;

    // 创建set方法，便于构建责任链墨水
    public void setSuccessor(PriceHandler successor) {
        this.successor = successor;
    }

    /**
     * 处理折扣申请
     * abstract 可以没有实现代码
     * @Date: 2019-8-18  11:01
     * @Author: sunfy
     */
    public abstract void processDiscount(float discount);


}
