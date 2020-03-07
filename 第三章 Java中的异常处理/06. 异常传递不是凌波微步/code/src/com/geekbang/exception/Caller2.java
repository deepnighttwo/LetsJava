package com.geekbang.exception;

import com.geekbang.exception.myexceptions.MyException;

public class Caller2 {
    Caller3 caller3 = new Caller3();

    public void call3RTException() {
        System.out.println("Caller2.call3RTException开始");
        caller3.callThrowRTException();
        System.out.println("Caller2.Caller2call3RTException结束");

    }

    public void call3Exception() throws ClassNotFoundException, MyException {
        System.out.println("Caller2.call3Exception开始");
        caller3.callThrowException();
        System.out.println("Caller2.call3Exception结束");
    }
}

/**
 * 源代码来自极客时间里的《零基础学Java》，带你零基础入门，夯实Java，欢迎订阅：https://time.geekbang.org/course/intro/181
 */
