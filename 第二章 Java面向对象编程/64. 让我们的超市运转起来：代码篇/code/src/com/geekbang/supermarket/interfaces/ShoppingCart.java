package com.geekbang.supermarket.interfaces;

import java.util.Date;

public class ShoppingCart {

    private Merchandise[] buy;
    private int[] count;
    private int curr;
    private int max;

    public ShoppingCart(int maxTypeToBuy) {
        buy = new Merchandise[maxTypeToBuy];
        count = new int[maxTypeToBuy];
        max = maxTypeToBuy;
        curr = 0;
    }

    public boolean canHold() {
        return curr < max;
    }

    public boolean add(Merchandise m, int countToBuy) {
        if (!canHold()) {
            return false;
        }
        buy[curr] = m;
        this.count[curr] = countToBuy;
        curr++;
        m.buy(countToBuy);
        return true;
    }

    public double calculateOriginCost() {
        double ret = 0;
        int pos = -1;
        for (Merchandise m : buy) {
            pos++;
            if (m == null) {
                continue;
            }
            ret += m.getPurchasePrice() * count[pos];
        }
        return ret;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("=========================\n");
        sb.append("购物时间：").append(new Date()).append("\n");
        int pos = -1;
        for (Merchandise m : buy) {
            pos++;
            if (m == null) {
                continue;
            }
            sb.append(m.getCategory().name()).append("\t").append(m.getName()).append("\t")
                .append(count[pos]).append("\t").append(m.getPurchasePrice() * count[pos]).append("\n");

        }
        sb.append("应付总额为：").append(calculateOriginCost()).append("\n");
        sb.append("=========================");
        return sb.toString();
    }

}
