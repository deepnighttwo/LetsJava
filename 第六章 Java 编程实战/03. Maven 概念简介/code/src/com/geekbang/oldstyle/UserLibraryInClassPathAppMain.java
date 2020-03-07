package com.geekbang.oldstyle;

import com.google.common.base.Splitter;

public class UserLibraryInClassPathAppMain {
    public static void main(String[] args) {
        String line = "  This is a     字符串    ";
        Iterable<String> words = Splitter.on(' ').trimResults().omitEmptyStrings().split(line);
        for (String word : words) {
            System.out.println(word);
        }
    }
}

/**
 * 源代码来自极客时间里的《零基础学Java》，带你零基础入门，夯实Java，欢迎订阅：https://time.geekbang.org/course/intro/181
 */
