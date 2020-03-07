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
