package com.geekbang.supermarket;

public class LittleSuperMarket {
    public String superMarketName;
    public String address;
    public int parkingCount;
    public double incomingSum;
    public MerchandiseV2[] merchandises;
    public int[] merchandiseSold;

    public MerchandiseV2 getBiggestProfitMerchandise() {
        MerchandiseV2 curr = null;
        for (int i = 0; i < merchandises.length; i++) {
            MerchandiseV2 m = merchandises[i];
            // 这个逻辑有问题吗？相同的利润怎么判断？
            if (curr == null || curr.calculateProfit() < m.calculateProfit()) {
                curr = m;
            }
        }
        return curr;
    }
}
