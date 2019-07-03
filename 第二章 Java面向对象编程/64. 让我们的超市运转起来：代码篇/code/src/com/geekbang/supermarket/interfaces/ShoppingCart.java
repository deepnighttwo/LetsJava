package com.geekbang.supermarket.interfaces;

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
        return true;
    }

}
