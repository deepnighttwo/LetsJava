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

/**
 * 源代码来自极客时间里的《零基础学Java》，带你零基础入门，夯实Java，欢迎订阅：https://time.geekbang.org/course/intro/181
 */
