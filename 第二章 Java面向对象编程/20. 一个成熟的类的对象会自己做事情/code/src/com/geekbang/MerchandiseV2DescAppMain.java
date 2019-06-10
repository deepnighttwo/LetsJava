package com.geekbang;

import com.geekbang.supermarket.MerchandiseV2;

public class MerchandiseV2DescAppMain {
    public static void main(String[] args) {
        MerchandiseV2 merchandise = new MerchandiseV2();

//        merchandise.name = "书桌";
//        merchandise.soldPrice = 999.9;
//        merchandise.purchasePrice = 500;
//        merchandise.count = 40;
//        merchandise.id = "DESK9527";

        // >> TODO 调用方法，完成对成员变量的操作
        merchandise.init("书桌", "DESK9527", 40, 999.9, 500);

        merchandise.describe();
    }
}
