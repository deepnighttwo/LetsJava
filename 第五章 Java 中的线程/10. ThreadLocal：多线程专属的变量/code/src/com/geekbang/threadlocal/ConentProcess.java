package com.geekbang.threadlocal;

public class ConentProcess {

    public void process(String content) {
        PerformanceTracker.startPhase();
        long ms = content.chars().reduce(Integer::sum).orElse(0);
        try {
            Thread.sleep(ms);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        PerformanceTracker.endPhase("ProcessContent");
    }

}

/**
 * 源代码来自极客时间里的《零基础学Java》，带你零基础入门，夯实Java，欢迎订阅：https://time.geekbang.org/course/intro/181
 */
