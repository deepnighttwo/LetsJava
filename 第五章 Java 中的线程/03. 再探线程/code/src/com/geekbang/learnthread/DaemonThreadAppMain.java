package com.geekbang.learnthread;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class DaemonThreadAppMain {

    private static final String TEXT = "太阳在这个平静的小村庄缓缓升起，又是开始了平常的一天。我们故事的主人公睡眼惺忪的起来\n" +
        "......";


    public static void main(String[] args) throws InterruptedException {
        System.out.println("程序开始，执行的线程名字叫做" + Thread.currentThread().getName());

        for (int i = 1; i <= 1; i++) {
            Thread thread = new Thread(new PrintStoryRunnable(TEXT, 200 * i), "我的线程-" + i);
            // TODO 可以在start之前设置线程为守护线程
            thread.setDaemon(true);
            // TODO 可以随时改变线程（和是不是守护线程没有关系）的优先级，但是作用不能保证
            thread.setPriority(Thread.MAX_PRIORITY);
            thread.start();
        }

//        Thread.sleep(TimeUnit.SECONDS.toMillis(5));

        System.out.println("启动线程结束，名字叫做" + Thread.currentThread().getName());
    }

    static class PrintStoryRunnable implements Runnable {
        private String text;
        private long interval;

        public PrintStoryRunnable(String text, long interval) {
            this.text = text;
            this.interval = interval;
        }

        @Override
        public void run() {
            try {
                System.out.println("执行这段代码的线程名字叫做" + Thread.currentThread().getName());
                printSlowly(text, interval);
                System.out.println(Thread.currentThread().getName() + "执行结束");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }


    public static void printSlowly(String text, long interval) throws InterruptedException {
        for (char ch : text.toCharArray()) {
            Thread.sleep(interval);
            System.out.print(ch);
        }
        System.out.println();
    }

}
