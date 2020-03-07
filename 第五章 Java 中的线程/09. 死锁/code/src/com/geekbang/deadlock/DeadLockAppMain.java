package com.geekbang.deadlock;

public class DeadLockAppMain {

    public static void main(String[] args) throws InterruptedException {
        System.out.println("程序开始");

        AppResources appResources = new AppResources();
        Thread t1 = new Thread(new Task1(appResources), "Thread-For-Task1");
        t1.start();
        Thread t2 = new Thread(new Task2(appResources), "Thread-For-Task2");
        t2.start();

        t1.join();
        t2.join();
        System.out.println("程序结束");
    }
}

/**
 * 源代码来自极客时间里的《零基础学Java》，带你零基础入门，夯实Java，欢迎订阅：https://time.geekbang.org/course/intro/181
 */
