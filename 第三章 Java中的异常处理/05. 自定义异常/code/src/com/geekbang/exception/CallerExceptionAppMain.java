package com.geekbang.exception;

import com.geekbang.exception.myexceptions.MyException;

public class CallerExceptionAppMain {
    public static void main(String[] args) throws MyException {
        // >> TODO catch 语句是根据异常类型匹配来捕捉相应类型的异常的。
        // >> TODO 如果类型不匹配，catch语句是不会执行的，异常会继续抛出
        // >> TODO 也就是说，catch (Throwable )会捕捉到所有的异常，包括Error，建议最多只捕捉Exception
        // >> TODO 如果catch一个其实并没有被抛出的checked exception，Java程序会报错，因为Java明确的知道这个类型的异常不会发生
        // >> TODO 如果catch一个unchecked exception，Java程序不会报错
        // >> TODO 如果throws一个其实并没有被抛出的checked exception或者unchecked exception，Java程序不会报错
        Caller1 caller1 = new Caller1();
        System.out.println("调用开始");

        caller1.call2Exception();

        System.out.println("调用结束");
    }
}
