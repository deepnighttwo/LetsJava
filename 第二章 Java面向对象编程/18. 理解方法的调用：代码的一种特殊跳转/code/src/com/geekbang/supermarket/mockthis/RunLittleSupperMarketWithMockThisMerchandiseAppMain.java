package com.geekbang.supermarket.mockthis;

import com.geekbang.supermarket.LittleSuperMarket;
import com.geekbang.supermarket.mockthis.MerchandiseV2MockThis;

public class RunLittleSupperMarketWithMockThisMerchandiseAppMain {
    public static void main(String[] args) {
        // 创建一个小超市类
        LittleSuperMarketWithMerchandiseMock littleSuperMarket = new LittleSuperMarketWithMerchandiseMock();
        // 依次给超市的名字，地址，停车位赋值
        littleSuperMarket.superMarketName = "有家小超市";
        littleSuperMarket.address = "浦东新区世纪大道666号";
        littleSuperMarket.parkingCount = 100;
        // 给超市200种商品
        littleSuperMarket.merchandises = new MerchandiseV2MockThis[200];
        // 统计用的数组
        littleSuperMarket.merchandiseSold = new int[littleSuperMarket.merchandises.length];

        // 为了使用方便，创建一个商品数组引用，和littleSuperMarket.merchandises指向同一个数组对象
        MerchandiseV2MockThis[] all = littleSuperMarket.merchandises;

        // 遍历并给200种商品赋值
        for (int i = 0; i < all.length; i++) {
            // 创建并给商品的属性赋值
            MerchandiseV2MockThis m = new MerchandiseV2MockThis();
            m.name = "商品" + i;
            m.count = 200;
            m.purchasePrice = Math.random() * 200;
            m.soldPrice = m.purchasePrice * (1 + Math.random());
            m.id = "ID" + i;
            // 用创建的商品，给商品数组的第i个引用赋值，all和小超市的商品数组引用指向的是同一个数组对象
            all[i] = m;
        }

        System.out.println("下面请利润最高的商品自我介绍：");
        MerchandiseV2MockThis m = littleSuperMarket.getBiggestProfitMerchandise(littleSuperMarket);
        m.describe(m);
        System.out.println("调用makeEnoughFor");
        m.makeEnoughFor(m, 900);
        m.describe(m);
    }
}
