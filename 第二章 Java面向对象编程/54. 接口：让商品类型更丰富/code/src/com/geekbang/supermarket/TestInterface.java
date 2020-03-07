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

/**
 * 源代码来自极客时间里的《零基础学Java》，带你零基础入门，夯实Java，欢迎订阅：https://time.geekbang.org/course/intro/181
 */
