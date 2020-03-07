package com.geekbang.learnthrread;

public class ChangeData implements Runnable {

    private long delta;

    private long loopCount;

    private DataHolder dataHolder;

    public ChangeData(long delta, long loopCount, DataHolder dataHolder) {
        this.delta = delta;
        this.loopCount = loopCount;
        this.dataHolder = dataHolder;
    }


    @Override
    public void run() {
        for (int i = 0; i < loopCount; i++) {
//            dataHolder.change(delta);
            DataHolder.changeStatic(delta);
        }
//        dataHolder.print();
        DataHolder.printStatic();
    }
}
/**
 * 源代码来自极客时间里的《零基础学Java》，带你零基础入门，夯实Java，欢迎订阅：https://time.geekbang.org/course/intro/181
 */
