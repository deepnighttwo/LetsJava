package com.geekbang;

import com.geekbang.supermarket.MerchandiseV2;
//import com.geekbang.supermarket.NonPublicClassCanUseAnyName;

public class MerchandiseV2DescAppMain {
    public static void main(String[] args) {
        // >> TODO 非共有的类，不能在包外被使用
//         NonPublicClassCanUseAnyName asd;
        MerchandiseV2 merchandise = new MerchandiseV2
            ("书桌", "DESK9527", 40, 999.9, 500);

        merchandise.describe();
    }
}
