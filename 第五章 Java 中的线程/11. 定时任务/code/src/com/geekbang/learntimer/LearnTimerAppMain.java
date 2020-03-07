package com.geekbang.learntimer;

import java.util.Timer;
import java.util.concurrent.TimeUnit;

public class LearnTimerAppMain {
    public static void main(String[] args) {
        Timer timer = new Timer();
        // TODO 使用固定的频率schedule任务
        timer.scheduleAtFixedRate(new FindABCTask(), 0, TimeUnit.SECONDS.toMillis(2));
    }
}

/**
 * 源代码来自极客时间里的《零基础学Java》，带你零基础入门，夯实Java，欢迎订阅：https://time.geekbang.org/course/intro/181
 */
