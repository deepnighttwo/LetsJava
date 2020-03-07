package com.geekbang.threadlocal;

import java.util.concurrent.TimeUnit;

public class DBQuery {

    public void query() {
        PerformanceTracker.startPhase();

        try {
            Thread.sleep((int)(Math.random()* TimeUnit.SECONDS.toMillis(5)));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        PerformanceTracker.endPhase("DBQuery");
    }

}

/**
 * 源代码来自极客时间里的《零基础学Java》，带你零基础入门，夯实Java，欢迎订阅：https://time.geekbang.org/course/intro/181
 */
