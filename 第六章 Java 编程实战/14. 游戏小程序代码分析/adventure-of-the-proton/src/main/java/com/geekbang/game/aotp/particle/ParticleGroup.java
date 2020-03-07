package com.geekbang.game.aotp.particle;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static com.geekbang.game.aotp.util.Constants.LINE;

public class ParticleGroup {

    private Map<ParticleType, List<Particle>> particlesInGroup = new HashMap<>();

    public void addToGroup(Particle particle) {
        particlesInGroup.computeIfAbsent(particle.getParticleType(), k -> new ArrayList<>())
            .add(particle);
    }

    public void removeFromGroup(Particle particle) {
        List<Particle> particles = particlesInGroup.get(particle.getParticleType());
        particles.remove(particle);
        if (particles.isEmpty()) {
            particlesInGroup.remove(particle.getParticleType());
        }
    }

    public String describeGroup() {
        StringBuilder ret = new StringBuilder();
        for (Map.Entry<ParticleType, List<Particle>> entry : particlesInGroup.entrySet()) {
            ret.append(entry.getKey()).append(":").append(entry.getValue().size()).append(LINE);
        }
        return ret.toString();
    }

}

/**
 * 源代码来自极客时间里的《零基础学Java》，带你零基础入门，夯实Java，欢迎订阅：https://time.geekbang.org/course/intro/181
 */
