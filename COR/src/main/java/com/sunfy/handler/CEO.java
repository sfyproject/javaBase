package com.sunfy.handler;

/**
 * CEO批准小于55的折扣，大于则拒绝
 * @Author： sunfy
 * @Date: Created in 11:03 2019-8-18
 */
public class CEO extends PriceHandler{
    @Override
    public void processDiscount(float discount) {
        if(discount <= 0.55){
            // system中的format 可以一次性写完所有的信息
            System.out.format("%s批准了折扣：%.2f%n", this.getClass().getName(),discount);
        }else {
            System.out.format("%s拒绝了折扣:%.2f%n",this.getClass().getName(),discount);
        }
    }
}
