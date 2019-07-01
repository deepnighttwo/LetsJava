package com.geekbang.supermarket;

import java.util.Date;

public class TestInterface implements ExpireDateMerchandise, VirtualMerchandise {
    public boolean notExpireInDays(int days) {
        return false;
    }

    public Date getProducedDate() {
        return null;
    }

    public Date getExpireDate() {
        return null;
    }

    public double leftDatePercentage() {
        return 0;
    }

    public double actualValueNow(double leftDatePercentage) {
        return 0;
    }
}
