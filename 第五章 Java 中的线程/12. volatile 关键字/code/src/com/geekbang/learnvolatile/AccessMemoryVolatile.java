package com.geekbang.learnvolatile;

public class AccessMemoryVolatile {

    public volatile long counterV = 0;
    public long counter = 0;

    public static void main(String[] args) {
        int loopCount = Integer.MAX_VALUE / 30;
        // TODO 只是为了演示 volatile 每次访问都要直达内存，不能使用缓存，所以耗费的时间略多
        AccessMemoryVolatile accessMemoryVolatile = new AccessMemoryVolatile();
        Thread volatileAdder = new Thread(() -> {
            long start = System.currentTimeMillis();
            for (int i = 0; i < loopCount; i++) {
                accessMemoryVolatile.counterV++;
            }
            System.out.println("volatile adder takes " + (System.currentTimeMillis() - start));
        });
        volatileAdder.start();

        Thread justAdder = new Thread(() -> {
            long start = System.currentTimeMillis();
            for (int i = 0; i < loopCount; i++) {
                accessMemoryVolatile.counter++;
            }
            System.out.println("simple adder takes " + (System.currentTimeMillis() - start));
        });
        justAdder.start();
    }

}
