package com.geekbang.exception;


public class MustHandel {
    public static void main(String[] args) throws ClassNotFoundException {
        try {
            Class clazz = Class.forName("com.geekbang.exception.MustHandle");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}

/**
 * 源代码来自极客时间里的《零基础学Java》，带你零基础入门，夯实Java，欢迎订阅：https://time.geekbang.org/course/intro/181
 */
