package com.geekbang.supermarket;

public class MerchandiseV2 {

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

    // >> TODO 在方法定义中指定方法的返回值类型
    // >> TODO Java中一个方法只能有一种返回值，如果不需要返回值则用void表示
    // >> TODO 如果定义了返回值，则必须使用 return 语句返回方法的返回值，return 是 Java 的关键字
    // >> TODO 可以认为，返回值必须要能够用来给返回值类型的变量赋值
    public double calculateProfit(){
        double profit = soldPrice - purchasePrice;
        // >> TODO 这个return是代码块里的return，是return所在代码块的最后一个语句
        if (profit <= 0) {
            return 0;
        }
        //  >> TODO return 语句必须是所在代码块的最后一个语句，否则就是语法错误
        return profit;

        // >> TODO 一个方法可以有多个返回语句。
    }

    // >> TODO 返回值如果是基本类型，则要类型完全相同，或者符合类型自动转换规则
    public double getCurrentCount(){
        return count;
    }

    // >> TODO 如果不符合规则，可以使用强制类型转换
    public int getIntSoldPrice(){
        return (int) soldPrice;
    }

}
