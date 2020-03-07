package com.geekbang.learnthrread;

public class DataHolder {

    private Object lockObj = new Object();

    private long number = 0;
    private static long numberStatic = 0;

    // TODO 一个synchronized解决问题
    public synchronized void change(long delta) {
        number += delta;
    }

    public void changeSyncBlock(long delta){
        int abc = 99;
        synchronized (lockObj){
            number += delta;
        }
        int cde = 987;
    }

    // TODO 一个synchronized解决问题
    public synchronized static void changeStatic(long delta) {
        numberStatic += delta;
    }

    public void print() {
        System.out.println("Number=" + number);
    }

    public static void printStatic() {
        System.out.println("static Number=" + numberStatic);
    }

}

/**
 * 源代码来自极客时间里的《零基础学Java》，带你零基础入门，夯实Java，欢迎订阅：https://time.geekbang.org/course/intro/181
 */
