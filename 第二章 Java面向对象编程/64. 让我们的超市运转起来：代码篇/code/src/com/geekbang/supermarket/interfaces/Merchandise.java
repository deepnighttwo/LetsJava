package com.geekbang.supermarket.interfaces;

public interface Merchandise {

    String getName();

    double getSoldPrice();

    double getPurchasePrice();

    int buy(int count);

    void putBack(int count);

    Category getCategory();

    int getCount();
}

/**
 * 源代码来自极客时间里的《零基础学Java》，带你零基础入门，夯实Java，欢迎订阅：https://time.geekbang.org/course/intro/181
 */
