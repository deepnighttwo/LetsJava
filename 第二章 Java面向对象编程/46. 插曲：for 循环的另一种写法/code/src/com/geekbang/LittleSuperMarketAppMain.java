package com.geekbang;

import com.geekbang.supermarket.LittleSuperMarket;
import com.geekbang.supermarket.MerchandiseV2;

public class LittleSuperMarketAppMain {
    public static void main(String[] args) {
        LittleSuperMarket superMarket = new LittleSuperMarket("大卖场",
            "世纪大道1号", 500, 600, 100);

        MerchandiseV2[] all = superMarket.getMerchandises();

        // >> TODO 只循环遍历，不赋值，不跳跃访问，不需要知道当前元素是第几个
        // >> TODO 后面还有更多功能
        double maxPurchasePrice = -1;
        for (MerchandiseV2 m : all) {
            if (m.getPurchasePrice() > maxPurchasePrice) {
                maxPurchasePrice = m.getPurchasePrice();
            }
        }

        System.out.println(maxPurchasePrice);
        System.out.println(superMarket.getBiggestPurchasePrice());

    }
}
