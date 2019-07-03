package com.geekbang.supermarket.interfaces;

public interface Merchandise {

    String getName();

    double buy(int count);

    void putBack(int count);
}
