package com.geekbang.game.aotp.particle;

import com.geekbang.game.aotp.item.Inventory;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import static com.geekbang.game.aotp.AOTPAppMain.Game;

public class Particle {

    private ParticleType particleType;

    private long energy;

    private Inventory inventory;

    private Map<String, Object> properties = new HashMap<>();

    private ParticleGroup particleGroup = null;

    public Particle(ParticleType particleType) {
        this(particleType, particleType.energy());
    }

    public Particle(ParticleType particleType, long energy) {
        this.particleType = particleType;
        this.energy = energy;
        inventory = Game.getInventoryGen().genInventory();
    }

    public ParticleType getParticleType() {
        return particleType;
    }

    public void setParticleType(ParticleType particleType) {
        this.particleType = particleType;
    }

    public long getEnergy() {
        return energy;
    }

    public void setEnergy(long energy) {
        this.energy = energy;
    }

    public Inventory getInventory() {
        return inventory;
    }

    public void setInventory(Inventory inventory) {
        this.inventory = inventory;
    }

    public Map<String, Object> getProperties() {
        return properties;
    }

    public void setProperties(Map<String, Object> properties) {
        this.properties = properties;
    }

    public List<BattleChoice> getChoiceForBattle() {
        return Game.getChoiceList().stream().filter(BattleChoice::canEnable)
            .collect(Collectors.toList());
    }

    public ParticleGroup getParticleGroup() {
        return particleGroup;
    }

    public void setParticleGroup(ParticleGroup particleGroup) {
        this.particleGroup = particleGroup;
    }
}

/**
 * 源代码来自极客时间里的《零基础学Java》，带你零基础入门，夯实Java，欢迎订阅：https://time.geekbang.org/course/intro/181
 */
