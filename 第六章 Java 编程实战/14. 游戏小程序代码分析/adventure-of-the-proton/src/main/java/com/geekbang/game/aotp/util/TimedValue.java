package com.geekbang.game.aotp.util;

public class TimedValue<T> {
    private T value;
    private long time = System.currentTimeMillis();

    public TimedValue(T value) {
        this.value = value;
    }

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }

    public long getTime() {
        return time;
    }

    public void setTime(long time) {
        this.time = time;
    }
}
