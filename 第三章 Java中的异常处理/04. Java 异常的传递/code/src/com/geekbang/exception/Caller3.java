package com.geekbang.exception;

public class Caller3 {
    public void callThrowRTException() {
        System.out.println("Caller3.callThrowRTException开始");
        Object n = null;
        n.toString();
        System.out.println("Caller3.callThrowRTException结束");
    }

    public void callThrowException() throws ClassNotFoundException {
        System.out.println("Caller3.callThrowException开始");
        Class.forName("com.neverland.Rabbit");
        System.out.println("Caller3.callThrowException结束");
    }
}

/**
 * 源代码来自极客时间里的《零基础学Java》，带你零基础入门，夯实Java，欢迎订阅：https://time.geekbang.org/course/intro/181
 */
