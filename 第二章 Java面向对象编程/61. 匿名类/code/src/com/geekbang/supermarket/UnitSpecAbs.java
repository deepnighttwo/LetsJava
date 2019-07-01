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
