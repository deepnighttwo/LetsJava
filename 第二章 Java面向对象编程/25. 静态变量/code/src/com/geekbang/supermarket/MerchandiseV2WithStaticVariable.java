package com.geekbang.supermarket;

public class MerchandiseV2WithStaticVariable {

    public String name;
    public String id;
    public int count;
    public double soldPrice;
    public double purchasePrice;

    // >> TODO 静态变量使用 static 修饰符
    // >> TODO 静态变量如果不赋值，Java也会给它赋以其类型的初始值
    // >> TODO 静态变量一般使用全大写字母加下划线分割。这是一个习惯用法
    // >> TODO 所有的代码都可以使用静态变量，只要根据防范控制符的规范，这个静态变量对其可见即可
    //    TODO 比如 public 的静态变量，所有的代码都可以使用它
    public static double DISCOUNT_FOR_VIP = 0.95;

    //    TODO 但是如果没有public修饰符，只能当前包的代码能使用它
    static int STATIC_VARIABLE_CURR_PACKAGE_ONLY = 100;


    public MerchandiseV2WithStaticVariable(String name, String id, int count, double soldPrice, double purchasePrice) {
        this.name = name;
        this.id = id;
        this.count = count;
        this.soldPrice = soldPrice;
        this.purchasePrice = purchasePrice;
    }

    public String getName() {
        return name;
    }

    public MerchandiseV2WithStaticVariable(String name, String id, int count, double soldPrice) {
        this(name, id, count, soldPrice, soldPrice * 0.8);
    }

    public MerchandiseV2WithStaticVariable() {
        this("无名", "000", 0, 1, 1.1);

    }

    public void describe() {
        System.out.println("商品名字叫做" + name + "，id是" + id + "。 商品售价是" + soldPrice
            + "。商品进价是" + purchasePrice + "。商品库存量是" + count +
            "。销售一个的毛利润是" + (soldPrice - purchasePrice) + "。折扣为" + DISCOUNT_FOR_VIP);
    }

    public double calculateProfit() {
        double profit = soldPrice - purchasePrice;
//        if(profit <= 0){
//            return 0;
//        }
        return profit;
    }


    public double buy() {
        return buy(1);
    }

    public double buy(int count) {
        return buy(count, false);
    }

    public double buy(int count, boolean isVIP) {
        if (this.count < count) {
            return -1;
        }
        this.count -= count;
        double totalCost = count * soldPrice;
        if (isVIP) {
            // >> TODO 使用自己的使用静态变量的时候，直接写静态变量名字。
            return totalCost * DISCOUNT_FOR_VIP;
        } else {
            return totalCost;
        }
    }
}
