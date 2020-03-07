package com.geekbang;

import com.geekbang.person.Customer;
import com.geekbang.supermarket.LittleSuperMarket;
import com.geekbang.supermarket.Merchandise;

import java.util.Scanner;

public class RunLittleSupperMarketAppMain {
    public static void main(String[] args) {
        // 创建一个小超市类
        LittleSuperMarket littleSuperMarket = new LittleSuperMarket();
        // 依次给超市的名字，地址，停车位赋值
        littleSuperMarket.superMarketName = "有家小超市";
        littleSuperMarket.address = "浦东新区世纪大道666号";
        littleSuperMarket.parkingCount = 100;
        // 给超市200种商品
        littleSuperMarket.merchandises = new Merchandise[200];
        // 统计用的数组
        littleSuperMarket.merchandiseSold = new int[littleSuperMarket.merchandises.length];

        // 为了使用方便，创建一个商品数组引用，和littleSuperMarket.merchandises指向同一个数组对象
        Merchandise[] all = littleSuperMarket.merchandises;

        // 遍历并给200种商品赋值
        for (int i = 0; i < all.length; i++) {
            // 创建并给商品的属性赋值
            Merchandise m = new Merchandise();
            m.name = "商品" + i;
            m.count = 200;
            m.purchasePrice = Math.random() * 200;
            m.soldPrice = m.purchasePrice * (1 + Math.random());
            m.id = "ID" + i;
            // 用创建的商品，给商品数组的第i个引用赋值，all和小超市的商品数组引用指向的是同一个数组对象
            all[i] = m;
        }

        // 想一下，到此为止我们一共创建了多少个对象，多少个引用？

        System.out.println("超市开张啦！");

        boolean open = true;
        Scanner in = new Scanner(System.in);
        while (open) {
            System.out.println("本店叫做" + littleSuperMarket.superMarketName);
            System.out.println("地址在" + littleSuperMarket.address);
            System.out.println("共有停车位" + littleSuperMarket.parkingCount + "个");
            System.out.println("今天的营业额为" + littleSuperMarket.incomingSum);
            System.out.println("共有商品" + littleSuperMarket.merchandises.length + "种");

            Customer customer = new Customer();
            customer.name = "顾客编号" + ((int) (Math.random() * 10000000));
            customer.money = (1 + Math.random()) * 1000;
            customer.isDrivingCar = Math.random() > 0.5;

            //----------------迎客进门---------
            //开车来的给分配车位，没车位就不让进了
            if (customer.isDrivingCar) {
                if (littleSuperMarket.parkingCount > 0) {
                    System.out.println("欢迎" + customer.name + "驾车而来。本店已经为您安排了车位，停车免费哦。车位编号为" + littleSuperMarket.parkingCount);
                    littleSuperMarket.parkingCount -= 1;
                } else {
                    System.out.println("不好意思，本店车位已满。欢迎您下次光临");
                    continue;
                }
            } else {
                System.out.println("欢迎" + customer.name + "光临本店");
            }

            // 接待此顾客
            double totalCost = 0;
            while (true) {
                // 顾客选商品
                System.out.println("本店提供" + littleSuperMarket.merchandises.length + "种商品，请输入您要购买的商品编号：");
                int merchandiseId = in.nextInt();
                // 输入负数表示买好了。
                if (merchandiseId < 0) {
                    System.out.println("您本次购买了" + totalCost + "元的商品。欢迎您再次光临。");
                    break;
                }

                // 商品没有，让顾客继续选择
                if (merchandiseId >= littleSuperMarket.merchandises.length) {
                    System.out.println("次商品本店没有，欢迎继续挑选");
                    continue;
                }

                // 商品有，问顾客要购买多少个
                Merchandise toBuy = littleSuperMarket.merchandises[merchandiseId];
                System.out.println(toBuy.name + "单价" + toBuy.soldPrice + "。请问购买几个？");

                int numToBuy = in.nextInt();

                // 不想买，看看也欢迎
                if (numToBuy <= 0) {
                    System.out.println("不买看看也好，欢迎继续选购");
                    continue;
                }

                // 买的太多，库存不够
                if (toBuy.count < numToBuy) {
                    System.out.println(toBuy.name + "只有" + toBuy.count + "件了，不够" + numToBuy + "。欢迎继续选购。");
                    continue;
                }

                // 顾客钱不够
                if (numToBuy * toBuy.soldPrice + totalCost > customer.money) {
                    System.out.println("您带的钱不够结账，请您理智消费。");
                    continue;
                }

                // 钱也够，货也够
                // 更新顾客此次消费的总额
                totalCost += toBuy.count * toBuy.soldPrice;
                // 更新商品库存
                toBuy.count -= numToBuy;
                // 更新今日销货数据
                littleSuperMarket.merchandiseSold[merchandiseId] += numToBuy;
            }
            // 归还车位
            if (customer.isDrivingCar) {
                littleSuperMarket.parkingCount++;
            }
            // 更新数据
            customer.money -= totalCost;
            littleSuperMarket.incomingSum += totalCost;
            System.out.println(customer.name + "共消费" + totalCost + "。欢迎再次光临。");

            System.out.println("请问继续营业吗？");
            open = in.nextBoolean();
        }

        System.out.println("超市关门啦！");

        System.out.println("今日销售额为" + littleSuperMarket.incomingSum + "。营业统计如下：");
        for (int i = 0; i < littleSuperMarket.merchandiseSold.length; i++) {
            int sold = littleSuperMarket.merchandiseSold[i];
            if (sold > 0) {
                Merchandise m = littleSuperMarket.merchandises[i];
                double netIncoming = sold * (m.soldPrice - m.purchasePrice);
                double incoming = sold * m.soldPrice;
                System.out.println(littleSuperMarket.merchandises[i].name + "售出" + sold + "个。销售额" + incoming + "。毛利润" + netIncoming);
            }
        }

    }
}
