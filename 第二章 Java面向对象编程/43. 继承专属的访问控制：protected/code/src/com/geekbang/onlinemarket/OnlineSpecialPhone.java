package com.geekbang.onlinemarket;

import com.geekbang.supermarket.Phone;

public class OnlineSpecialPhone extends Phone {

    public OnlineSpecialPhone(String name, String id, int count, double soldPrice, double purchasePrice, double screenSize, double cpuHZ, int memoryG, int storageG, String brand, String os) {
        super(name, id, count, soldPrice, purchasePrice, screenSize, cpuHZ, memoryG, storageG, brand, os);
        this.screenSize = 99;
    }

    // >> TODO 子类覆盖父类的方法，不可以用可见性更低的修饰符，但是可以用更高的修饰符
    // >> TODO 原因是什么呢？
   public String getNameOfPhone(){
        return super.getNameOfPhone();
   }
}
