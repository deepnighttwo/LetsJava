package com.geekbang.learnlock.countdownlatch;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

public class CountDownLatchAppMain {

    private static final List<String> CONTENTS = new ArrayList<>();

    private static long WORKING_DURATION = 0;

    public static void main(String[] args) throws InterruptedException {

        int threadCount = 10;

        CountDownLatch countDownLatch = new CountDownLatch(threadCount);

        long mainStart = System.currentTimeMillis();

        for (int i = 0; i < threadCount; i++) {
            Thread thread = new Thread(() -> {
                System.out.println(Thread.currentThread().getName() + ":开始抓取网页内容");
                long start = System.currentTimeMillis();
                String content = getContentFromWeb();
                long threadWorkingDuration = System.currentTimeMillis() - start;
                System.out.println(Thread.currentThread().getName() + ":抓取网页内容结束");
                synchronized (CONTENTS) {
                    CONTENTS.add(content);
                    WORKING_DURATION += threadWorkingDuration;
                }
                // TODO 只需要countDown即可，不需要结束，线程可以继续做别的事情
                countDownLatch.countDown();
                try {
                    Thread.sleep(TimeUnit.SECONDS.toMillis(5));
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(Thread.currentThread().getName()+"结束");
            }, "线程" + i);
//            // TODO 如果在线程开始之前，主线程就开始join，会怎么样呢？
//            Thread.sleep(10);

            thread.start();
        }

        // TODO 无需等待，直接await，比join好的地方之一。join必须确保线程已经start
        countDownLatch.await();

        CONTENTS.forEach(s -> {
            System.out.print(s.length() + "：");
            System.out.println(s);
        });

        long mainWorkDuration = System.currentTimeMillis() - mainStart;

        // TODO 多线程的意义就是让工作并发的处理，使用更多的资源（CPU，磁盘，网络等），以便让工作更快的完成。
        System.out.println("工作线程累计工作时间：" + WORKING_DURATION);
        System.out.println("主线程工作时间：" + mainWorkDuration);
        System.out.println("主线程结束");

    }


    private static String getContentFromWeb() {
        StringBuilder ret = new StringBuilder();
        int len = ((int) (Math.random() * 1000000)) % 4096 + 1024;
        for (int i = 0; i < len; i++) {
            int rand = ((int) (Math.random() * 1000)) % 26;
            char ch = (char) (rand + 'a');
            ret.append(ch);
            try {
                Thread.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        return ret.toString();
    }


}
