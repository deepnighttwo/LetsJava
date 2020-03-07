package com.geekbang.game.aotp.util;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Utils {

    private static final Logger logger = LoggerFactory.getLogger(Utils.class);

    public static void sleepMS(long ms) {
        try {
            Thread.sleep(ms);
        } catch (InterruptedException e) {
            logger.error("error in sleep", e);
        }
    }

    public static long e(int b) {
        return (long) Math.pow(10, b);
    }


}

/**
 * 源代码来自极客时间里的《零基础学Java》，带你零基础入门，夯实Java，欢迎订阅：https://time.geekbang.org/course/intro/181
 */
