package com.geekbang.learn;

public class LearnSystem {
    public static void main(String[] args) {
        long startMS = System.currentTimeMillis();

        int counter = 0;
        for (int i = 0; i < 1000; i++) {
            counter++;
        }

        long endMS = System.currentTimeMillis();
        System.out.println("程序执行使用了几个毫秒？" + (endMS - startMS));

        long startNS = System.nanoTime();

        counter = 0;
        for (int i = 0; i < 1000; i++) {
            counter++;
        }

        long endNS = System.nanoTime();
        System.out.println("程序执行使用了几个纳秒？" + (endNS - startNS));
    }
}

/**
 * 源代码来自极客时间里的《零基础学Java》，带你零基础入门，夯实Java，欢迎订阅：https://time.geekbang.org/course/intro/181
 */
