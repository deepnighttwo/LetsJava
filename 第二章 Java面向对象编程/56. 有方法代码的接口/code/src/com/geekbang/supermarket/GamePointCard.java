package com.geekbang.supermarket;

import java.util.Date;

// >> TODO 实现有缺省方法的接口后，面对每个缺省的方法，一个类可以有三个选择
//    TODO 1）默默继承，相当于把这部分代码，拷贝到了当前类当中
//    TODO 2）重新声明此方法为abstract，相当于把这部分代码拒之门外，但是有abstract方法，也就是类必须是抽象的
//    TODO 3）覆盖，重新实现

public class GamePointCard extends MerchandiseV2 implements ExpireDateMerchandise, VirtualMerchandise {
    private Date produceDate;
    private Date expirationDate;


    public GamePointCard(String name, String id, int count, double soldPrice, double purchasePrice, Date produceDate, Date expirationDate) {
        super(name, id, count, soldPrice, purchasePrice);
        this.produceDate = produceDate;
        this.expirationDate = expirationDate;
    }

    @Override
    public Date getProducedDate() {
        return produceDate;
    }

    @Override
    public Date getExpireDate() {
        return expirationDate;
    }

    @Override
    public double actualValueNow(double leftDatePercentage) {
        return super.getSoldPrice();
    }


}
