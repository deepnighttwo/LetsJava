package com.geekbang.exception;

public class ThrowIt {

    // >> TODO 可以使用throws关键字，抛出一个异常。
    // >> TODO 抛出的异常类型，可以是实际异常的父类或者本身。
    // >> TODO 可以抛出多种类型的异常，用逗号分开就可以。
    public static void main(String[] args) throws ClassNotFoundException, NoSuchFieldException {
        Class clazz = Class.forName("abc");
        clazz.getField("");
    }

}

/**
 * 源代码来自极客时间里的《零基础学Java》，带你零基础入门，夯实Java，欢迎订阅：https://time.geekbang.org/course/intro/181
 */
