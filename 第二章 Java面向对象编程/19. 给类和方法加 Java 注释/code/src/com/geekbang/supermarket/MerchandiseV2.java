package com.geekbang.supermarket;

/*

这是一个多行注释
 */



/**
 *
 * 对这个类的说明
 *
 * @author 作者
 *
 */
public class MerchandiseV2 {
    /*
    多行注释也可以出现
    在任何地方
     */
    public String name;
    public String id;
    public int count;
    public double soldPrice;
    public double purchasePrice;

    public void describe() {
        System.out.println("商品名字叫做" + name + "，id是" + id + "。 商品售价是" + soldPrice
            + "。商品进价是" + purchasePrice + "。商品库存量是" + count +
            "。销售一个的毛利润是" + (soldPrice - purchasePrice));
    }

    public double calculateProfit() {
        double profit = soldPrice - purchasePrice;
        return profit;
    }

    public int getCount() {
        return count;
    }

    public void addCount(int count) {
        this.count += count;
    }

    /**
     * 检查库存够不够数
     * @param count 目标库存数
     * @return 达到目标库存数，则为true，否则为false
     */
    public boolean hasEnoughCountFor(int count) {
        return this.count >= count;
    }

    public void makeEnoughFor(int count) {
        boolean hasEnough = this.hasEnoughCountFor(count);
        if (!hasEnough) {
            int toBeAdd = count - this.count;
            this.addCount(toBeAdd);
        }
    }

    /**
     *
     * @param count
     */
    public void makeEnoughForOneByOne(int count) {
        boolean hasEnough = this.hasEnoughCountFor(count);
        if (!hasEnough) {
            this.addCount(1);
            makeEnoughForOneByOne(count);
        }
    }

}