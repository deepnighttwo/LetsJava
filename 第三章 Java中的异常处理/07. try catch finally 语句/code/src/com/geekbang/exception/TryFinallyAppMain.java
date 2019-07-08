package com.geekbang.exception;

public class TryFinallyAppMain {

    private static int VAL = 0;

    public static void main(String[] args) {
        System.out.println(withFinally());
        System.out.println(VAL);
    }

    private static int withFinally() {
        int len = 0;
        try {
            String s = null;
//            String s = "abc";
            return s.length();
        } finally {
            // >> TODO 可以认为finally语句会在方法返回后，后面的方法开始前，会在return语句后
            // >> TODO 无论是因为return结束还是因为异常结束，finally语句都会执行
            System.out.println("执行finally语句");
            // >> TODO finally里最好不要有return语句，会打乱exception的传递
//            return -2;

            // >> TODO finally里给return用的变量值赋值没用
//            len = -2;

//            VAL = 999;
//            System.out.println("finally语句执行完毕");
        }
    }


}
