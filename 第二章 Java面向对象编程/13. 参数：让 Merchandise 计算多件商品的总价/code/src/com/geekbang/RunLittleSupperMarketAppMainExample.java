package com.geekbang;

import com.geekbang.supermarket.LittleSuperMarket;
import com.geekbang.supermarket.MerchandiseV2;

import java.util.Scanner;

public class RunLittleSupperMarketAppMainExample {
    public static void main(String[] args) {
        // 创建一个小超市类
        LittleSuperMarket littleSuperMarket = new LittleSuperMarket();
        // 依次给超市的名字，地址，停车位赋值
        littleSuperMarket.superMarketName = "有家小超市";
        littleSuperMarket.address = "浦东新区世纪大道666号";
        littleSuperMarket.parkingCount = 100;
        // 给超市200种商品
        littleSuperMarket.merchandises = new MerchandiseV2[200];
        // 统计用的数组
        littleSuperMarket.merchandiseSold = new int[littleSuperMarket.merchandises.length];

        // 为了使用方便，创建一个商品数组引用，和littleSuperMarket.merchandises指向同一个数组对象
        MerchandiseV2[] all = littleSuperMarket.merchandises;

        // 遍历并给200种商品赋值
        for (int i = 0; i < all.length; i++) {
            // 创建并给商品的属性赋值
            MerchandiseV2 m = new MerchandiseV2();
            m.name = "商品" + i;
            m.count = 200;
            m.purchasePrice = Math.random() * 200;
            m.soldPrice = m.purchasePrice * (1 + Math.random());
            m.id = "ID" + i;
            // 用创建的商品，给商品数组的第i个引用赋值，all和小超市的商品数组引用指向的是同一个数组对象
            all[i] = m;
        }

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("今日超市大特惠，所有商品第二件半价！选择要购买的商品索引：");
            int index = scanner.nextInt();

            if (index < 0) {
                break;
            }

            if (index >= all.length) {
                System.out.println("商品索引超出界限");
                continue;
            }

            MerchandiseV2 m = all[index];
            System.out.println("商品" + m.name + "售价为" + m.soldPrice + "。请问购买几个？");
            int numToBuy = scanner.nextInt();

            if (numToBuy > m.count) {
                System.out.println("库存不足");
                continue;
            }

            int fullPriceCount = numToBuy / 2 + numToBuy % 2;
            int halfPriceCount = numToBuy - fullPriceCount;

            double totalCost = fullPriceCount * m.soldPrice + (halfPriceCount * m.soldPrice / 2);

            m.count -= numToBuy;

            System.out.println("选购的商品总价为" + totalCost);
        }


    }
}
