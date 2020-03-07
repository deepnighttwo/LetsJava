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
