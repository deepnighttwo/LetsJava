package com.geekbang.learn.ai;

import java.util.Scanner;

public class AII2AppMain {
    public static void main(String[] args) {
        AI2 ai2 = new AI2();
        Scanner in = new Scanner(System.in);
        while (true) {
            String input = in.next();
            if ("exit".equals(input)) {
                System.out.println("再见！");
                break;
            }
            String answer = ai2.answer(input);
            System.out.println(answer);
        }
    }
}

/**
 * 源代码来自极客时间里的《零基础学Java》，带你零基础入门，夯实Java，欢迎订阅：https://time.geekbang.org/course/intro/181
 */
