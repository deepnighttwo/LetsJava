package com.geekbang.learngenerics.ext;

public class GrandParent {
    private int num;

    public GrandParent(int num) {
        this.num = num;
    }

    public GrandParent() {
        this(-1);
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }
}

/**
 * 源代码来自极客时间里的《零基础学Java》，带你零基础入门，夯实Java，欢迎订阅：https://time.geekbang.org/course/intro/181
 */
