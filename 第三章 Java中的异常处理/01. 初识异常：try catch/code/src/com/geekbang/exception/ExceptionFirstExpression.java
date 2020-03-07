package com.geekbang.exception;


public class ExceptionFirstExpression {
    public static void main(String[] args) {
        // >> TODO try 语句中如果发生了异常（Exception），那么程序会跳转到catch语句。
        // >> TODO Java会将异常相关信息封装在一个异常类的实例中，ex是指向这个异常实例的引用
        // >> TODO "处理"最简单的方法，就是调用printStackTrace将异常信息输出到控制台
        // >> TODO catch语句执行完毕，程序会继续向下顺序执行
        try {
            int[] arr = new int[1];
            arr[1] = 9;
        } catch (Exception ex) {

            int abc = 999;
            ex.printStackTrace();
        }

        try {
            String str = "";
            str.substring(9, 10);
        } catch (Exception ex) {
            ex.printStackTrace();
        }

        System.out.println("程序执行结束");

    }
}

/**
 * 源代码来自极客时间里的《零基础学Java》，带你零基础入门，夯实Java，欢迎订阅：https://time.geekbang.org/course/intro/181
 */
