package com.geekbang.supermarket;

public class LittleSuperMarket {
    public String superMarketName;
    public String address;
    public int parkingCount;
    public double incomingSum;
    public MerchandiseV2[] merchandises;
    public int[] merchandiseSold;

    /**
     * 初始化小超市
     *
     * @param superMarketName
     * @param address
     * @param parkingCount
     * @param merchandiseCount 商品种类数
     * @param count            每种商品缺省库存
     */
    public LittleSuperMarket(String superMarketName, String address, int parkingCount,
                             int merchandiseCount, int count) {
        this.superMarketName = superMarketName;
        this.address = address;
        this.parkingCount = parkingCount;

        merchandises = new MerchandiseV2[merchandiseCount];
        for (int i = 0; i < merchandises.length; i++) {
            // 创建手机，手机壳变色手机，和普通商品，都放在商品数组里
            MerchandiseV2 m = null;
            if (i > 0 & i % 100 == 0) {
                m = new ShellColorChangePhone(
                    "商品" + i,
                    "ID" + i,
                    count,
                    1999,
                    999,
                    4.5,
                    3.5,
                    4,
                    128,
                    "三星",
                    "Android"
                );
            } else if (i > 0 & i % 10 == 0) {
                m = new Phone(
                    "商品" + i,
                    "ID" + i,
                    count,
                    1999,
                    999,
                    4.5,
                    3.5,
                    4,
                    128,
                    "索尼",
                    "Android"
                );
            } else {
                double purchasePrice = Math.random() * 200;
                m = new MerchandiseV2(
                    "商品" + i,
                    "ID" + i,
                    count,
                    1999,
                    999
                );
            }
            // 用创建的商品，给商品数组的第i个引用赋值，all和小超市的商品数组引用指向的是同一个数组对象
            merchandises[i] = m;
        }
        merchandiseSold = new int[merchandises.length];
    }

    public boolean findMerchandise(MerchandiseV2 target) {
        int i = 0;
        for (MerchandiseV2 m : merchandises) {
//            boolean match = m.equals(target);
            boolean match = (m == target);
            if (match) {
                System.out.println("找到了商品，位置在" + i);
                return true;
            }
            i++;
        }
        return false;
    }

    // 简单的访问成员变量

    public String getSuperMarketName() {
        return superMarketName;
    }

    public String getAddress() {
        return address;
    }

    public int getParkingCount() {
        return parkingCount;
    }

    public double getIncomingSum() {
        return incomingSum;
    }

    public void setSuperMarketName(String superMarketName) {
        this.superMarketName = superMarketName;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setParkingCount(int parkingCount) {
        this.parkingCount = parkingCount;
    }

    public void setIncomingSum(double incomingSum) {
        this.incomingSum = incomingSum;
    }

    public void setMerchandises(MerchandiseV2[] merchandises) {
        this.merchandises = merchandises;
    }

    public void setMerchandiseSold(int[] merchandiseSold) {
        this.merchandiseSold = merchandiseSold;
    }

    // 一些特殊的逻辑

    /**
     * 得到利润最高的商品
     *
     * @return
     */
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

    /**
     * 根据索引获取商品
     *
     * @param merchandiseIndex
     * @return
     */
    public MerchandiseV2 getMerchandiseOf(int merchandiseIndex) {
        if (merchandiseIndex < 0 || merchandiseIndex >= merchandises.length) {
            return null;
        }
        return merchandises[merchandiseIndex];
    }

    /**
     * 赚钱
     *
     * @param toBeAdded
     */
    public void addIncomingSum(double toBeAdded) {
        this.incomingSum += toBeAdded;
    }

    /**
     * 花钱
     *
     * @param toBeSpent
     * @return
     */
    public boolean spendMoney(double toBeSpent) {
        if (toBeSpent > incomingSum) {
            return false;
        }
        incomingSum -= toBeSpent;
        return true;
    }

}
