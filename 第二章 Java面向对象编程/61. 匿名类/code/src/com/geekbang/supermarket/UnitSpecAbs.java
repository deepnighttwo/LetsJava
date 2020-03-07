package com.geekbang.supermarket;

public abstract class UnitSpecAbs {

    private double spec;

    private String producerStr;

    public UnitSpecAbs(double spec, String producer) {
        this.spec = spec;
        this.producerStr = producer;
    }

    public abstract double getNumSpec();

    public abstract String getProducer();

    public double getSpec() {
        return spec;
    }

    public String getProducerStr() {
        return this.producerStr;
    }
}

/**
 * 源代码来自极客时间里的《零基础学Java》，带你零基础入门，夯实Java，欢迎订阅：https://time.geekbang.org/course/intro/181
 */
