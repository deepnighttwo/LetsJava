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

/**
 * 源代码来自极客时间里的《零基础学Java》，带你零基础入门，夯实Java，欢迎订阅：https://time.geekbang.org/course/intro/181
 */
