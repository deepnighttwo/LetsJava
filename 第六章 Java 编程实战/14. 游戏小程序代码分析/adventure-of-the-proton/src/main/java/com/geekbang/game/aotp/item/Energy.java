package com.geekbang.game.aotp.item;

public class Energy extends Item {
    private long energyValue;

    public Energy(long energyValue) {
        super(ItemType.Energy);
        this.energyValue = energyValue;
    }

    public Energy() {
        super(ItemType.Energy);
        this.energyValue = energyValue;
    }

    public long getEnergyValue() {
        return energyValue;
    }

    public void setEnergyValue(long energyValue) {
        this.energyValue = energyValue;
    }
}

/**
 * 源代码来自极客时间里的《零基础学Java》，带你零基础入门，夯实Java，欢迎订阅：https://time.geekbang.org/course/intro/181
 */
