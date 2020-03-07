package com.geekbang.atomicnumber;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

public class AtomicNumberAppMain {

    private AtomicLong atomicLong = new AtomicLong(0);
    private volatile long longVar = 0;

    public static void main(String[] args) throws InterruptedException {
        AtomicNumberAppMain atomicNumberAppMain = new AtomicNumberAppMain();
        int loop = Integer.MAX_VALUE / 10;

        // TODO 并发使用线程给AtomicLong对象加一
        int parallel = 10;
        List<Thread> atomicThreads = new ArrayList<>();
        for (int p = 0; p < parallel; p++) {
            int loopCount = loop / parallel;
            if (p == parallel - 1) {
                loopCount = loop - (loop / parallel) * (parallel - 1);
            }
            int finalLoopCount = loopCount;
            Thread atomic = new Thread(() -> {
                long start = System.currentTimeMillis();

                for (int i = 0; i < finalLoopCount; i++) {
                    atomicNumberAppMain.atomicLong.incrementAndGet();
                }
                System.out.println("Atomic takes " + (System.currentTimeMillis() - start));
            });
            atomic.start();
            atomicThreads.add(atomic);
        }

        // TODO 单线程给long的变量加一
        Thread primary = new Thread(() -> {
            long start = System.currentTimeMillis();
            for (int i = 0; i < loop; i++) {
                atomicNumberAppMain.longVar++;
            }
            System.out.println("Primary var takes " + (System.currentTimeMillis() - start));
        });
        primary.start();

        for (Thread atomicThread : atomicThreads) {
            atomicThread.join();
        }
        primary.join();

        // TODO 结果是一样的
        System.out.println(atomicNumberAppMain.toString());
    }

    @Override
    public String toString() {
        return "AtomicNumberAppMain{" +
            "atomicLong=" + atomicLong +
            ", longVar=" + longVar +
            '}';
    }
}
