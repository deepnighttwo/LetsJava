package com.geekbang.supermarket;

public class MerchandiseV2 {

    public String name;
    public String id;
    // TODO 把count改成double，兼容散装称重的商品
    public double count;
    public double soldPrice;
    public double purchasePrice;

    public void init(String name, String id, int count, double soldPrice, double purchasePrice) {
        this.name = name;
        this.id = id;
        this.count = count;
        this.soldPrice = soldPrice;
        this.purchasePrice = purchasePrice;
    }

    public void describe() {
        System.out.println("商品名字叫做" + name + "，id是" + id + "。 商品售价是" + soldPrice
            + "。商品进价是" + purchasePrice + "。商品库存量是" + count +
            "。销售一个的毛利润是" + (soldPrice - purchasePrice));
    }

    public double calculateProfit() {
        double profit = soldPrice - purchasePrice;
//        if(profit <= 0){
//            return 0;
//        }
        return profit;
    }

    // >> TODO 方法调用的时候，参数就不必完全类型一样，实参数可以自动类型转换成形参类型即可
    public double buyDouble(double count){
        System.out.println("buyDouble(double)被调用了");
        if (this.count < count) {
            return -1;
        }
        this.count -= count;
        double totalCost = count * soldPrice;
        return totalCost;
    }


    // TODO 论斤卖的商品，数量是double。我们把count成员变量改成double类型
    public double buy(double count){
        System.out.println("buy(double)被调用了");
        if (this.count < count) {
            return -1;
        }
        this.count -= count;
        double totalCost = count * soldPrice;
        return totalCost;
    }

    public double buy() {
        System.out.println("buy()被调用了");
        return buy(1);
    }

    public double buy(int count) {
        System.out.println("buy(int)被调用了");
        return buy(count, false);
    }

    public double buy(int count, boolean isVIP) {
        System.out.println("buy(int,boolean)被调用了");
        if (this.count < count) {
            return -1;
        }
        this.count -= count;
        double totalCost = count * soldPrice;
        if (isVIP) {
            return totalCost * 0.95;
        } else {
            return totalCost;
        }
    }

}
