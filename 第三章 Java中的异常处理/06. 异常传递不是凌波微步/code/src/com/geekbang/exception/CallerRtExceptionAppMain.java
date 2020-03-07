package com.geekbang.exception;

import com.geekbang.exception.myexceptions.MyRuntimeException;

public class CallerRtExceptionAppMain {
    public static void main(String[] args) {
        Caller1 caller1 = new Caller1();
        System.out.println("调用开始");
        try {
            caller1.call2RTException();
        } catch (MyRuntimeException ex) {
            // >> TODO 错误的演示！不应该使用异常做正常处理逻辑下的跳转
            System.out.println("凌波微步收到！");
        }
        System.out.println("调用结束");
    }
}

/**
 * 源代码来自极客时间里的《零基础学Java》，带你零基础入门，夯实Java，欢迎订阅：https://time.geekbang.org/course/intro/181
 */
