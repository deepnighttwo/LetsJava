package com.geekbang.learn;


import java.util.Random;

public class LearnMath {

    public double abc;

    public static void main(String[] args) {

        // TODO 我们调用的都是 Math 里的静态方法，Math的构造函数就是private的，意味着不能创建Math类的实例
        System.out.println(Math.random());
        // TODO 原来归根结底，Math的random是用的Random类来实现的。它在java.util包里
        Random random = new Random();
        for (int i = 0; i < 100; i++) {
            // TODO nextInt的返回值竟然有正数有负数哦！所以使用别人的类之前，一定要看看文档，避免出问题
            System.out.println(Math.abs(random.nextInt()));
        }

        System.out.println(Math.abs(-9));

        System.out.println(Math.round(-9.2));
        System.out.println(Math.round(-9.5));
        System.out.println(Math.round(-9.8));
        System.out.println(Math.round(9.2));
        System.out.println(Math.round(9.5));
        System.out.println(Math.round(9.8));
    }
}
