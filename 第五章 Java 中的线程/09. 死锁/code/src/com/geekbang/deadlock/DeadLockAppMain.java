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
