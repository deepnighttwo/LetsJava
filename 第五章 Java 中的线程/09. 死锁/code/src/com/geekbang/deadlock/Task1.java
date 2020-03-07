package com.geekbang.deadlock;

import java.util.concurrent.TimeUnit;

public class Task1 implements Runnable {

    private AppResources appResources;

    public Task1(AppResources appResources) {
        this.appResources = appResources;
    }

    @Override
    public void run() {
        synchronized (appResources.getResourceInput()) {
            System.out.println("Task1得到了Input资源");
            System.out.println("Task1开始工作……");
            // TODO 申请到input资源后，模拟工作2秒
            try {
                Thread.sleep(TimeUnit.SECONDS.toMillis(2));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            // TODO 然后在不释放input锁的情况下，继续申请printer资源
            System.out.println("Task1尝试去获取Printer资源");
            synchronized (appResources.getResourcePrinter()) {
                System.out.println("Task1得到了Printer资源");
                System.out.println("Task1继续工作……");
                try {
                    Thread.sleep(TimeUnit.SECONDS.toMillis(3));
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
