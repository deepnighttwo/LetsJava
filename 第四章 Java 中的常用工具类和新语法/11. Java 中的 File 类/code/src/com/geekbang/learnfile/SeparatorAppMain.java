package com.geekbang.learnfile;

import java.io.File;

public class SeparatorAppMain {
    public static void main(String[] args) {
        System.out.println("文件路径分隔符：" + File.separator);
        System.out.println("环境变量分隔符" + File.pathSeparator);
    }
}

/**
 * 源代码来自极客时间里的《零基础学Java》，带你零基础入门，夯实Java，欢迎订阅：https://time.geekbang.org/course/intro/181
 */
