package com.geekbang.learnthrread;

public class DataHolder {
    private long number = 0;

    public void change(long delta) {
        number += delta;
    }

    public void print() {
        System.out.println("Number=" + number);
    }

}

/**
 * 源代码来自极客时间里的《零基础学Java》，带你零基础入门，夯实Java，欢迎订阅：https://time.geekbang.org/course/intro/181
 */
