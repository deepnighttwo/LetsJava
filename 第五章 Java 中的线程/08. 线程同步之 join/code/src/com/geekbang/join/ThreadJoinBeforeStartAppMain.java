package com.geekbang.join;

import java.util.ArrayList;
import java.util.List;

public class ThreadJoinBeforeStartAppMain {

    private static final List<String> CONTENTS = new ArrayList<>();

    private static long WORKING_DURATION = 0;

    public static void main(String[] args) throws InterruptedException {

        long mainStart = System.currentTimeMillis();

        List<Thread> threads = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
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
            }, "线程" + i);

            threads.add(thread);
        }

        // TODO sleep一下，让线程都启动起来
//        Thread.sleep(1);

        System.out.println(" ------------ 主线程开始 join  ------------ ");

        new Thread(() -> {
            for (Thread thread : threads) {
                try {
                    String name = thread.getName();
                    System.out.println(" ------------ 主线程开始join " + name + " ------------ ");
                    thread.join();
                    System.out.println(" ------------ 主线程join " + name + " 结束 ------------ ");
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            System.out.println(" ------------ 主线程join结束，获取的内容为： ------------ ");

            CONTENTS.forEach(s -> {
                System.out.print(s.length() + "：");
                System.out.println(s);
            });

            long mainWorkDuration = System.currentTimeMillis() - mainStart;

            // TODO 多线程的意义就是让工作并发的处理，使用更多的资源（CPU，磁盘，网络等），以便让工作更快的完成。
            System.out.println("工作线程累计工作时间：" + WORKING_DURATION);
            System.out.println("主线程工作时间：" + mainWorkDuration);

        }).start();

        // TODO 如果在线程开始之前，主线程就开始join，会怎么样呢？
        Thread.sleep(100);

        threads.forEach(Thread::start);

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
