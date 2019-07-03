package com.geekbang.supermarket.interfaces;

public interface SuperMarket {

    Merchandise[] getAllMerchandise();

    Merchandise[] getRandomMerchandiseOfCatagory(Category category, double price);

}
