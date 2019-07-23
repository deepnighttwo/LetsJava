package com.geekbang.learnvolatile;

public class VolatileAppMain {
    public static void main(String[] args) {
        DataHolder dataHolder = new DataHolder();

        Thread operator = new Thread(() -> {
            while (true) {
                dataHolder.operateData();
            }
        });
        operator.start();

        Thread checker = new Thread(() -> {
            while (true) {
                dataHolder.check();
            }
        });
        checker.start();
    }
}
