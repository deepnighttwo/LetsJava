package com.geekbang.learnlock.lockwaitnotify;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class LearnLockWaitNotifyAppMain {
    public static void main(String[] args) {
        Lock locker = new ReentrantLock();
        Condition condition = locker.newCondition();
        int workingSec = 2;
        int threadCount = 3;
        for (int i = 0; i < threadCount; i++) {
            new Thread(() -> {
                System.out.println(getName() + "：线程开始工作……");
                try {
                    locker.lock();
                    sleepSec(workingSec);
                    System.out.println(getName() + "：进入等待");
                    // >> TODO await 方法必须在当前线程获取锁之后才能调用
                    // >> TODO await 方法调用后自动失去锁
                    condition.await();
                    // >> TODO 被唤醒的线程，就相当于执行过了await方法，开始向下执行，指定的第一件事就是获取之前失去的锁
                    System.out.println(getName() + "：线程继续……");
                    sleepSec(2);
                    System.out.println(getName() + "：结束");
                } catch (InterruptedException e) {
                    e.printStackTrace();
                } finally {
                    locker.unlock();
                }

            }, "工作线程" + i).start();
        }

        // >> TODO await / signal 一样也有 lost notification 的问题
        System.out.println("------------- 唤醒线程开始sleep -------------");
        sleepSec(workingSec + 1);
        System.out.println("------------- 唤醒线程sleep结束 -------------");
        try {
            locker.lock();
            // >> TODO signal / signalAll 方法必须在当前线程获取锁之后才能调用
            System.out.println("------------- 开始唤醒所有 -------------");
            condition.signalAll();

//            for (int i = 0; i < threadCount; i++) {
//                System.out.println("------------- 开始逐个唤醒 -------------");
//                condition.signal();
//            }

        } finally {
            locker.unlock();
        }

    }

    private static void sleepSec(int sec) {
        try {
            Thread.sleep(TimeUnit.SECONDS.toMillis(sec));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    private static String getName() {
        return Thread.currentThread().getName();
    }
}

