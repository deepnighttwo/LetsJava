package com.geekbang;


import com.geekbang.supermarket.*;

import java.util.Date;

public class UseInterface {

    public static void main(String[] args) {

        Date produceDate = new Date();
        Date expireDate = new Date(produceDate.getTime() + 365L * 24 * 3600 * 1000);
        GamePointCard gamePointCard = new GamePointCard(
            "手机001", "Phone001", 100, 1999, 999,
            produceDate, expireDate
        );

        // >> TODO 父类的引用可以用子类的引用赋值，抽象类也一样
        ExpireDateMerchandise am = gamePointCard;

        System.out.println(am.notExpireInDays(366));

        System.out.println(am.leftDatePercentage());

        System.out.println(am.actualValueNow(am.leftDatePercentage()));

    }
}

/**
 * 源代码来自极客时间里的《零基础学Java》，带你零基础入门，夯实Java，欢迎订阅：https://time.geekbang.org/course/intro/181
 */
