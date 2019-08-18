package com.sunfy;

import com.sunfy.handler.PriceHandler;
import com.sunfy.handler.PriceHandlerFactory;

import java.util.Random;

/**
 * 客户，请求折扣
 * @Author： sunfy
 * @Date: Created in 11:15 2019-8-18
 */
public class Customer {

    private PriceHandler priceHandler;

    /**
     * 便于构造我们需要的对象
     * @param priceHandler
     */
    public void setPriceHandler(PriceHandler priceHandler) {
        this.priceHandler = priceHandler;
    }

    /**
     * 只关心是否处理，不关心被谁处理
     * @param discount
     */
    public void requestDiscount(float discount){
        priceHandler.processDiscount(discount);
    }

    public static void main(String[] args){
        Customer customer = new Customer();
        // 当消费者到来时，绑定一个销售者进行服务
        customer.setPriceHandler(PriceHandlerFactory.createPriceHandler());

        Random random = new Random();
        for(int i=0; i < 100; i++){
            System.out.print(i+":");
            customer.requestDiscount(random.nextFloat());
        }
    }
}
