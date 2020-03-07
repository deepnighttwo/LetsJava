package com.geekbang.threadpool;

import java.util.concurrent.*;

public class ThreadPoolAppMain {
    public static void main(String[] args) {
        // TODO 查看 ThreadPoolExecutor 完整形态的构造方法，了解构建一个线程池考虑的各种参数
        ExecutorService executorService = Executors.newFixedThreadPool(1);

        executorService.submit(new Runnable() {
            @Override
            public void run() {
                printExecutionThreadStatus("run方法");
            }
        });
        System.out.println("已经提交run task");


        Future<String> future = executorService.submit(new Callable<String>() {
            @Override
            public String call() throws Exception {
                printExecutionThreadStatus("call方法");
                System.out.println("执行call任务ing");
                Thread.sleep(TimeUnit.SECONDS.toMillis(5));
                System.out.println("执行call任务结束");
                return "这是call返回的结果";
            }
        });

        System.out.println("已经提交call task");

//        System.out.println("任务提交完毕");
//        // TODO 关闭线程池，shutdown方法会等待所有已经提交的任务完成，然后释放所有资源
//        // TODO 正常应该在应用程序需要结束的时候，将工作线程池关闭。这里我们为了演示，提交完任务就关闭
//        System.out.println("关闭线程池");
//        executorService.shutdown();

        try {
            System.out.println("开始获取call task的执行结果");
            String result = future.get();
            System.out.println("获取到了任务执行的结果，为：" + result);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }

        System.out.println("任务提交完毕");
        // TODO 关闭线程池，shutdown方法会等待所有已经提交的任务完成，然后释放所有资源
        // TODO 正常应该在应用程序需要结束的时候，将工作线程池关闭。这里我们为了演示，提交完任务就关闭
        System.out.println("关闭线程池");
        executorService.shutdown();

    }

    private static void printExecutionThreadStatus(String phase) {
        System.out.println(Thread.currentThread().getName() + ":这是在线程池里执行的代码：" + phase);
    }
}
