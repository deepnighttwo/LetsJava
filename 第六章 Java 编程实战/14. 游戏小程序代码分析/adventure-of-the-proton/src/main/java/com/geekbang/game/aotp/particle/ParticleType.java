package com.geekbang.game.aotp.particle;

import static com.geekbang.game.aotp.util.Utils.e;

public enum ParticleType {
    // 质子
    Proton("质子", e(5), e(11)),

    // 中子
    Neutron("中子", e(5), e(11)),

    // 电子
    Electron("电子", e(3), e(5)),

    // 中微子
    Neutrino("中微子", e(2), e(5)),

    // 正电子
    Positron("正电子", e(6), e(8)),

    // 光子
    Photon("光子", e(3), e(6)),

    // 强子
    Hadron("强子", e(3), e(8)),

    // 轻子
    Lepton("轻子", e(3), e(7)),

    // 介子
    Mesotron("介子", e(3), e(6)),

    // 夸克
    Quark("夸克", e(5), e(9));


    private String name;
    private long minimalEnergy;
    private long maxEnergy;

    ParticleType(String name, long minimalEnergy, long maxEnergy) {
        this.name = name;
        this.minimalEnergy = minimalEnergy;
        this.maxEnergy = maxEnergy;
    }

    public long energy() {
        return this.minimalEnergy + (long) ((Math.random() * e(11) % (maxEnergy - minimalEnergy)));
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getMinimalEnergy() {
        return minimalEnergy;
    }

    public void setMinimalEnergy(long minimalEnergy) {
        this.minimalEnergy = minimalEnergy;
    }

    public long getMaxEnergy() {
        return maxEnergy;
    }

    public void setMaxEnergy(long maxEnergy) {
        this.maxEnergy = maxEnergy;
    }

    public static ParticleType randType() {
        return ParticleType.values()[((int) (Math.random() * 100000) % ParticleType.values().length)];
    }
}
