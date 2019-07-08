package com.geekbang.exception;

import com.geekbang.exception.myexceptions.MyException;

public class Caller2 {
    Caller3 caller3 = new Caller3();

    public void call3RTException() {
        System.out.println("Caller2.call3RTException开始");
        caller3.callThrowRTException();
        System.out.println("Caller2.Caller2call3RTException结束");

    }

    public void call3Exception() throws MyException {
        System.out.println("Caller2.call3Exception开始");
        caller3.callThrowException();
        System.out.println("Caller2.call3Exception结束");
    }
}
