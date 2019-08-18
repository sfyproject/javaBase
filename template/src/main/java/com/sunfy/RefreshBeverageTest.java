package com.sunfy;

/**
 * @Author： sunfy
 * @Date: Created in 9:08 2019-8-18
 */
public class RefreshBeverageTest {
    public static void main(String[] args) {
        System.out.println("咖啡制备中....");
        RefreshBeverage coffee = new Coffee();
        coffee.prepareBeverageTemplate();
        System.out.println("咖啡好了....");

        System.out.println("\n--------------------------");

        System.out.println("咖啡制备中....");
        RefreshBeverage tea = new Tea();
        tea.prepareBeverageTemplate();
        System.out.println("咖啡好了....");
    }
}
