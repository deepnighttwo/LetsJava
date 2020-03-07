package com.geekbang.learnvolatile;

public class DataHolder {

    int a, b, c, d, f, g;
//    long e;
    // TODO 有 volatile 修饰就会影响之前的指令重排
    volatile long e;

    public void operateData() {
        // TODO 按照这个顺序执行，g 的值是肯定小于等于 e 的。但是实际执行在执行的时候，可能会为了优化的目的重排
        a += 1;
        b += 1;
        c += 1;
        d += 1;

        e += 1;

        f += 1;
        g += 1;
    }

    int counter;

    public void check() {
        // TODO 看似不可能的条件，实际可能被触发到
        if (g > e) {
            System.out.println("got it " + (counter++));
        }
    }
}
