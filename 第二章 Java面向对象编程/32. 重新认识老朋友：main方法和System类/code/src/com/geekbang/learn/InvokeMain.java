package com.geekbang.learn;

public class InvokeMain {
    public static void main(String[] args) {
        System.out.println("进入了InvokeMain的main方法");
        LearnMain.main(args);
        System.out.println("InvokeMain的main方法执行结束");
    }
}

/**
 * 源代码来自极客时间里的《零基础学Java》，带你零基础入门，夯实Java，欢迎订阅：https://time.geekbang.org/course/intro/181
 */
