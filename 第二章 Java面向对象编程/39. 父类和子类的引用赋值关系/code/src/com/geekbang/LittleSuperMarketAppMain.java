package com.geekbang;

import com.geekbang.supermarket.LittleSuperMarket;
import com.geekbang.supermarket.MerchandiseV2;

public class LittleSuperMarketAppMain {
    public static void main(String[] args) {
        LittleSuperMarket superMarket = new LittleSuperMarket("大卖场",
            "世纪大道1号", 500, 600, 100);

        MerchandiseV2 m0 = superMarket.getMerchandiseOf(0);
        m0.describe();
        System.out.println();
        MerchandiseV2 m100 = superMarket.getMerchandiseOf(100);
        m100.describe();
        System.out.println();
        MerchandiseV2 m10 = superMarket.getMerchandiseOf(10);
        m10.describe();


    }
}
