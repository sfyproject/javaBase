package com.sunfy.handler;

/**
 * @Author： sunfy
 * @Date: Created in 11:41 2019-8-18
 */
public class PriceHandlerFactory {
    /**
     * 创建PriceHandler对象的工厂方法
     * @return
     */
    public static PriceHandler createPriceHandler() {
        // 向上转型
        PriceHandler sales = new Sales();
        PriceHandler lead = new Lead();
        PriceHandler manager = new Manager();
        PriceHandler director = new Director();
        PriceHandler vp = new VicePresident();
        PriceHandler ceo = new CEO();
        // 设置直接后继
        sales.setSuccessor(lead);
        lead.setSuccessor(manager);
        manager.setSuccessor(director);
        director.setSuccessor(vp);
        vp.setSuccessor(ceo);
        // 返回最低级对象（销售人员）
        return sales;
    }
}
