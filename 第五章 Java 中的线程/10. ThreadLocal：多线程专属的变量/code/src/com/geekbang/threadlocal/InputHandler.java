package com.geekbang.threadlocal;

public class InputHandler {

    public String getInput() {
        return produceString();
    }

    private static String produceString() {
        PerformanceTracker.startPhase();
        StringBuilder ret = new StringBuilder();
        for (int i = 0; i < 128; i++) {
            int rand = ((int) (Math.random() * 1000)) % 26;
            char ch = (char) (rand + 'a');
            ret.append(ch);
        }
        PerformanceTracker.endPhase("InputGen");
        return ret.toString();
    }
}

/**
 * 源代码来自极客时间里的《零基础学Java》，带你零基础入门，夯实Java，欢迎订阅：https://time.geekbang.org/course/intro/181
 */
