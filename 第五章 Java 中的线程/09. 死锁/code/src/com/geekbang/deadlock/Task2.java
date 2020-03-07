package com.geekbang.deadlock;

import java.util.concurrent.TimeUnit;

public class Task2 implements Runnable {

    private AppResources appResources;

    public Task2(AppResources appResources) {
        this.appResources = appResources;
    }

    @Override
    public void run() {
        // TODO 申请资源顺序不同，可能会造成死锁
//        differentSeq();

        // TODO 申请资源顺序相同，可以避免死锁，但是会降低资源的使用效率
        sameSeq();
    }

    private void differentSeq(){
        synchronized (appResources.getResourcePrinter()) {
            // TODO 先申请printer资源
            System.out.println("Task2得到了Printer资源");
            System.out.println("Task2开始工作……");
            try {
                Thread.sleep(TimeUnit.SECONDS.toMillis(3));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            // TODO 工作3秒中，在不释放printer资源的情况下，继续申请input资源
            System.out.println("Task2尝试去获取Input资源");
            synchronized (appResources.getResourceInput()) {
                System.out.println("Task2得到了Input资源");
                System.out.println("Task2继续工作……");
                try {
                    Thread.sleep(TimeUnit.SECONDS.toMillis(2));
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    private void sameSeq(){
        synchronized (appResources.getResourceInput()) {
            System.out.println("Task2得到了Input资源");
            System.out.println("Task2开始工作……");
            try {
                Thread.sleep(TimeUnit.SECONDS.toMillis(3));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Task2尝试去获取Printer资源");
            synchronized (appResources.getResourcePrinter()) {
                System.out.println("Task2得到了Printer资源");
                System.out.println("Task2继续工作……");
                try {
                    Thread.sleep(TimeUnit.SECONDS.toMillis(2));
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }

}
