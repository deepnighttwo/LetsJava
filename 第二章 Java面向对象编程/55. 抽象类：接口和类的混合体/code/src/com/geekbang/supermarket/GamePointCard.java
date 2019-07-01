package com.geekbang.supermarket;

import java.util.Date;

// >> TODO 一个类只能继承一个父类，即使是抽象类，也只能是一个
public class GamePointCard extends AbstractExpireDateMerchandise implements VirtualMerchandise {

    public GamePointCard(String name, String id, int count, double soldPrice, double purchasePrice, Date produceDate, Date expirationDate) {
        super(name, id, count, soldPrice, purchasePrice, produceDate, expirationDate);
    }
    
    @Override
    public double actualValueNow(double leftDatePercentage) {
        return super.getSoldPrice();
    }

}
