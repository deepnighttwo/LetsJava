package com.geekbang.supermarket.interfaces;

/**
 * 现金卡，VIP卡等
 */
public interface Card {

    /**
     * 执行完毕超市自身的打折策略之后，确定了顾客需要付多少钱。然后再根据顾客是否有VIP卡，判断是否继续打折，看顾客是否有现金卡，抵扣现金。
     * @param totalCost
     * @param costLeft
     * @param customer
     * @param shoppingCart
     * @return
     */
    int processCost(double totalCost, double costLeft, Customer customer, ShoppingCart shoppingCart);


}
