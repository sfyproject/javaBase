package com.sunfy.handler;

/**
 * 新增销售小组长
 * 添加后在工厂方法中进行处理后继
 * @Author： sunfy
 * @Date: Created in 11:03 2019-8-18
 */
public class Lead extends PriceHandler{
    @Override
    public void processDiscount(float discount) {
        if(discount <= 0.15){
            // system中的format 可以一次性写完所有的信息
            System.out.format("%s批准了折扣：%.2f%n", this.getClass().getName(),discount);
        }else {
            // 责任链模式的直接后继
            successor.processDiscount(discount);
        }
    }
}
