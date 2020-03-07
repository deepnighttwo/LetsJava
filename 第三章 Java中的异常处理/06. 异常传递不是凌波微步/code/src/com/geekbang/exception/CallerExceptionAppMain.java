package com.geekbang.exception;

import com.geekbang.exception.myexceptions.MyException;

public class CallerExceptionAppMain {
    public static void main(String[] args) throws ClassNotFoundException, MyException {
        Caller1 caller1 = new Caller1();
        System.out.println("调用开始");

        caller1.call2Exception();

        System.out.println("调用结束");
    }
}

/**
 * 源代码来自极客时间里的《零基础学Java》，带你零基础入门，夯实Java，欢迎订阅：https://time.geekbang.org/course/intro/181
 */
