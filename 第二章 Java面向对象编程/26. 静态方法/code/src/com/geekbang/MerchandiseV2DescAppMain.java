package com.geekbang;

import com.geekbang.supermarket.MerchandiseV2;
import  static com.geekbang.supermarket.MerchandiseV2.getVIPDiscount;

public class MerchandiseV2DescAppMain {
    public static void main(String[] args) {
        MerchandiseV2 merchandise = new MerchandiseV2
            ("书桌", "DESK9527", 40, 999.9, 500);

        merchandise.describe();

        // >> TODO 使用import static来引入一个静态方法，就可以直接用静态变量名访问了
        //    TODO import static也可以使用通配符*来引入一个类里所有静态变量
        System.out.println(getVIPDiscount());

    }
}

/**
 * 源代码来自极客时间里的《零基础学Java》，带你零基础入门，夯实Java，欢迎订阅：https://time.geekbang.org/course/intro/181
 */
