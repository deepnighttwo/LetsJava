package com.geekbang;

import com.geekbang.supermarket.LittleSuperMarket;
import com.geekbang.supermarket.MerchandiseV2;

public class ToStringAppMain {
    public static void main(String[] args) {
        LittleSuperMarket superMarket = new LittleSuperMarket("大卖场",
            "世纪大道1号", 500, 600, 100);

        MerchandiseV2 m100 = superMarket.getMerchandiseOf(100);

        StringBuilder strBuilder = new StringBuilder();

        strBuilder.append("商品100是：").append(m100);

        // >> TODO 因为toString是Object里的方法，所以任何一个Java的对象，都可以调用这个方法
        // >> TODO 内容好像不大全，补充一下？
        System.out.println(strBuilder.toString());
        System.out.println(m100);

    }

}
