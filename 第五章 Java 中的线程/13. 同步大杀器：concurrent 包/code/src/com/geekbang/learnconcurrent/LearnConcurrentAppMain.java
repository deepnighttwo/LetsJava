package com.geekbang.learnconcurrent;


import sun.misc.Unsafe;

public class LearnConcurrentAppMain {
    public static void main(String[] args) {
        Unsafe unsafe = null;
        unsafe.park(true, 1);
        unsafe.unpark(null);
    }
}

/**
 * 源代码来自极客时间里的《零基础学Java》，带你零基础入门，夯实Java，欢迎订阅：https://time.geekbang.org/course/intro/181
 */
