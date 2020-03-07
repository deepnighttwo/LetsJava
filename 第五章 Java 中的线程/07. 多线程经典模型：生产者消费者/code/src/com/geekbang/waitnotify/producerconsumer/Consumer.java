package com.geekbang.waitnotify.producerconsumer;

import java.util.Queue;

public class Consumer<T> {
    private Queue<T> tasks;

    public Consumer(Queue<T> tasks) {
        this.tasks = tasks;
    }

    public T consume() throws InterruptedException {
        synchronized (tasks) {
            // TODO 如果不用while，用if，会怎么样？
            while (tasks.size() == 0) {
                System.out.println("消费者线程进入等待：" + Thread.currentThread().getName());
                // >> TODO wait方法会释放monitor
                tasks.wait();
            }
            T ret = tasks.poll();
            // >> TODO 调用notify或者notifyAll的时候，必须已经获得对象的monitor，也就是在对象的synchronized块中
            tasks.notifyAll();
            return ret;
        }
    }
}

/**
 * 源代码来自极客时间里的《零基础学Java》，带你零基础入门，夯实Java，欢迎订阅：https://time.geekbang.org/course/intro/181
 */
