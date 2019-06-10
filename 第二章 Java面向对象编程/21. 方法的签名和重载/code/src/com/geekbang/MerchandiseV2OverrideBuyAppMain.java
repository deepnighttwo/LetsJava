package com.geekbang;

import com.geekbang.supermarket.MerchandiseV2Overload;

public class MerchandiseV2OverrideBuyAppMain {
    public static void main(String[] args) {
        MerchandiseV2Overload merchandise = new MerchandiseV2Overload();

        merchandise.init("书桌", "DESK9527", 40, 999.9, 500);

        // >> TODO 理解为什么返回值不是方法签名的一部分：不能帮助确定调用哪个方法。
        merchandise.buy();
        merchandise.describe();

        double cost = merchandise.buy(10);
        System.out.println(cost);
        merchandise.describe();

        double costVIP = merchandise.buy(10, true);
        System.out.println(costVIP);
        merchandise.describe();
    }
}
