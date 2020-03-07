package com.geekbang.supermarket.interfaces;


// >> TODO 某一个中类的商品，满多少减多少
// >> TODO 某一个中类的商品，第二件半价

/**
 * 超市的折扣策略
 */
public interface DiscountStrategy {

    /**
     * @param shoppingCart
     * @return 因为此折扣策略所折扣掉的钱，注意并非折扣的总价。
     */
    double discount(ShoppingCart shoppingCart);

}
