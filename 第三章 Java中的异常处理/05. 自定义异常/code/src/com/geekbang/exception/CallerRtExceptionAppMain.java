package com.geekbang.exception;

public class CallerRtExceptionAppMain {
    public static void main(String[] args) {
        // >> TODO RuntimeException，也就是unchecked exception不强制处理，所以冷不丁吃到一个RuntimeException，程序会失败
        Caller1 caller1 = new Caller1();
        System.out.println("调用开始");
        caller1.call2RTException();
        System.out.println("调用结束");
    }
}
