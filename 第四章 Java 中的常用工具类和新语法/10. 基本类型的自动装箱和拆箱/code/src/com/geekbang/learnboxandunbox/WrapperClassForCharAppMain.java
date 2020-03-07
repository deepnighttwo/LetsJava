package com.geekbang.learnboxandunbox;

public class WrapperClassForCharAppMain {
    public static void main(String[] args) {
        // TODO char对应的类为Character，里面有很多isXXX方法比较实用，比如判断字符是否为数字
        System.out.println(Character.isDigit('A'));
        System.out.println(Character.isDigit('字'));
        System.out.println(Character.isDigit('0'));
        System.out.println(Character.isDigit('9'));
    }
}

/**
 * 源代码来自极客时间里的《零基础学Java》，带你零基础入门，夯实Java，欢迎订阅：https://time.geekbang.org/course/intro/181
 */
