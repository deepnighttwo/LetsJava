package com.geekbang.supermarket.interfaces;

/**
 * 商品的种类
 */
public enum Category {

    FOOD(10, 300),
    COOK(200, 2000),
    SNACK(5, 100),
    CLOTHES(200, 1000),
    ELECTRIC(200, 10000);

    int lowerPrice;
    int higherPrice;

    Category(int lowerPrice, int higherPrice) {
        this.lowerPrice = lowerPrice;
        this.higherPrice = higherPrice;
    }

}
