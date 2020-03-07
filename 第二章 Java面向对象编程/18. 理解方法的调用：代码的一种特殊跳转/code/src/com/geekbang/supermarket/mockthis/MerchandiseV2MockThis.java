package com.geekbang.supermarket.mockthis;

public class MerchandiseV2MockThis {

    public String name;
    public String id;
    public int count;
    public double soldPrice;
    public double purchasePrice;

    public void describe(MerchandiseV2MockThis This) {
        System.out.println("商品名字叫做" + This.name + "，id是" + This.id + "。 商品售价是" + This.soldPrice
            + "。商品进价是" + This.purchasePrice + "。商品库存量是" + This.count +
            "。销售一个的毛利润是" + (This.soldPrice - This.purchasePrice));
    }

    public double calculateProfit() {
        double profit = soldPrice - purchasePrice;
        return profit;
    }

    public void duplicateName(int count) {

    }

    public int getCount(MerchandiseV2MockThis This) {
        return This.count;
    }

    public void addCount(MerchandiseV2MockThis This, int count) {
        This.count += count;
    }

    public boolean hasEnoughCountFor(MerchandiseV2MockThis This, int count) {
        return This.count >= count;
    }

    public void makeEnoughFor(MerchandiseV2MockThis This, int count) {
        boolean hasEnough = This.hasEnoughCountFor(This, count);
        if (!hasEnough) {
            int toBeAdd = count - This.count;
            This.addCount(This, toBeAdd);
        }
    }

}