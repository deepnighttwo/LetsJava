package com.geekbang.supermarket;

public class MerchandiseV2Overload {

    public String name;
    public String id;
    public int count;
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


    // >> TODO 重载的方法可以调用别的重载方法，当然也可以调用别的不重载的方法。
    // >> TODO 实际上，像这种补充一些缺省的参数值，然后调用重载的方法，是重载的一个重要的使用场景。
    // >> TODO 在这里我们举的例子就是这样的，但是不是语法要求一定要这样。重载的方法的方法体内代码可以随便写，
    //    TODO 可以不调用别的重载方法
    public double buy() {
        return buy(1);
    }


    public double buy(int count) { return buy(count, false);
    }

    // TODO  最后都补充好参数，调用参数最全的一个方法
    public double buy(int count, boolean isVIP) {
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
