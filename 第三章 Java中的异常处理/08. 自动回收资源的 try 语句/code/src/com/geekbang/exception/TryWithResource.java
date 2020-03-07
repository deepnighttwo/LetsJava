package com.geekbang.exception;

public class TryWithResource {
    public static void main(String[] args) {
        try (
             MyAutoClosableResource res1 = new MyAutoClosableResource("res1");
             MyAutoClosableResource res2 = new MyAutoClosableResource("res2")
        ) {
            while (true) {
                System.out.println(res1.read());
                System.out.println(res2.read());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

/**
 * 源代码来自极客时间里的《零基础学Java》，带你零基础入门，夯实Java，欢迎订阅：https://time.geekbang.org/course/intro/181
 */
