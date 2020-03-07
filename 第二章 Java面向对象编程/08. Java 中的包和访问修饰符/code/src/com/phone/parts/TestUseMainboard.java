package com.phone.parts;

public class TestUseMainboard {
    public static void main(String[] args) {
        Mainboard mainboard = new Mainboard();
        mainboard.cpu = new CPU();
        mainboard.cpu.producer="aaa";
    }
}

/**
 * 源代码来自极客时间里的《零基础学Java》，带你零基础入门，夯实Java，欢迎订阅：https://time.geekbang.org/course/intro/181
 */
