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
