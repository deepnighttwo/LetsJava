package com.geekbang.learntimer;

import java.util.TimerTask;

// TODO 必须继承 TimerTask 才能被 Timer schedule
public class FindABCTask extends TimerTask {
    @Override
    public void run() {
        try {
            String content = getWebContent();
            if (content.contains("ABC")) {
                System.out.println("Find ABC in " + content);
            } else {
                System.out.println("ABC not found");
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }

        // TODO 如果抛出异常， Timer是不会帮助处理的，整个Timer就挂了
//        throw new RuntimeException("not handled exception");
    }


    private static String getWebContent() {
        StringBuilder ret = new StringBuilder();
        for (int i = 0; i < 4096; i++) {
            int rand = ((int) (Math.random() * 1000)) % 26;
            char ch = (char) (rand + 'A');
            ret.append(ch);
        }

        return ret.toString();
    }


}

/**
 * 源代码来自极客时间里的《零基础学Java》，带你零基础入门，夯实Java，欢迎订阅：https://time.geekbang.org/course/intro/181
 */
