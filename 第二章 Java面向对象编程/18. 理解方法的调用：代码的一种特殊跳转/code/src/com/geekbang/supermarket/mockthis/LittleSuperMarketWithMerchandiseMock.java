package com.geekbang.supermarket.mockthis;

public class LittleSuperMarketWithMerchandiseMock {
    public String superMarketName;
    public String address;
    public int parkingCount;
    public double incomingSum;
    public MerchandiseV2MockThis[] merchandises;
    public int[] merchandiseSold;

    public MerchandiseV2MockThis getBiggestProfitMerchandise(LittleSuperMarketWithMerchandiseMock This) {
        System.out.println("LittleSuperMarket的getBiggestProfitMerchandise方法使用的对象是：" + This);
        MerchandiseV2MockThis curr = null;
        for (int i = 0; i < This.merchandises.length; i++) {
            MerchandiseV2MockThis m = This.merchandises[i];
            if (curr == null || curr.calculateProfit() < m.calculateProfit()) {
                curr = m;
            }
        }
        return curr;
    }
}
