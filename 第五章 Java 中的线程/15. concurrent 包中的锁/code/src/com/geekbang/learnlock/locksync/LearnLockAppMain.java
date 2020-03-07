package com.geekbang.learnlock.locksync;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class LearnLockAppMain {
    public static void main(String[] args) {
        Lock lock = new ReentrantLock();
        for (int i = 0; i < 3; i++) {
            Thread thread = new Thread(new WorkWithLock(lock), "Worker-" + i);
            thread.start();
        }
    }
}

/**
 * 源代码来自极客时间里的《零基础学Java》，带你零基础入门，夯实Java，欢迎订阅：https://time.geekbang.org/course/intro/181
 */
