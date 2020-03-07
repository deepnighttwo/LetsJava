package com.geekbang.learn;

public class InvokeMain {
    public static void main(String[] args) {
        System.out.println("进入了InvokeMain的main方法");
        LearnMain.main(args);
        System.out.println("InvokeMain的main方法执行结束");
    }
}
