package com.geekbang.concurentdatastructure;

import java.util.concurrent.LinkedBlockingQueue;

public class CollectionAppMain {
    public static void main(String[] args) {
        // TODO 默认是 Integer.MAX_VALUE 这么大
        // TODO 元素不允许为null
        LinkedBlockingQueue<String> linkedBlockingQueue = new LinkedBlockingQueue<>(128);

        // TODO 获取队列最前面的，但是不出列，偷瞄一眼
        linkedBlockingQueue.peek();

        // TODO 将元素放入队列，返回是否放入成功。一般在限制队列大小的情况下才会失败，毕竟到达Integer.MAX_VALUE程序可能就因为没有内存挂了
        // TODO 这个方法也有超时版本
        boolean added = linkedBlockingQueue.offer("");

        // TODO 队列里有就拿出来，没有就返回空，还有超时重载版本
        linkedBlockingQueue.poll();

        // TODO offer和poll是一对儿，都随缘，能行就行不行就算了

        try {
            // TODO 将元素加入队列，如果队列满了，就等着
            linkedBlockingQueue.put("");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // TODO 一定要拿到一个，否则就无限等待
        try {
            linkedBlockingQueue.take();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // TODO put和take可以方便的实现生产者消费者模式

    }
}
