package com.geekbang.exception;

import com.geekbang.exception.myexceptions.MyException;
import com.geekbang.exception.myexceptions.MyRuntimeException;

import java.io.IOException;

public class Caller3 {
    // >> TODO 可以将checked exception包装成unchecked exception或者checked exception。反之也可以

    public void callThrowRTException() {
        // >> TODO 可以在这里catch异常，然后封装成自己的异常，并增加相应的异常描述
        System.out.println("Caller3.callThrowRTException开始");
        try {
            Object n = null;
            n.toString();
        } catch (Exception ex) {
            throw new MyRuntimeException("执行callThrowRTException出错", ex);
        }
        System.out.println("Caller3.callThrowRTException结束");
    }

    public void callThrowException() throws MyException {
        // >> TODO 可以在这里catch异常，然后封装成自己的异常，并增加相应的异常描述
        System.out.println("Caller3.callThrowException开始");
        try {
            Class.forName("com.neverland.Rabbit");
        } catch (ClassNotFoundException ex) {
            throw new MyException("", ex);
        }
        System.out.println("Caller3.callThrowException结束");
    }

}
