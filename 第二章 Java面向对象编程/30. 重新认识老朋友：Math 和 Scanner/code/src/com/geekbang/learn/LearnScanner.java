package com.geekbang.learn;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Scanner;

public class LearnScanner {
    public static void main(String[] args) {
        // TODO Scanner是一个方便的可以帮我们从标准输入读取并转换数据的类
        // TODO 注释里 @since   1.5 表示它是从Java5才开始有的。
        Scanner scanner = new Scanner(System.in);

        // TODO 但是这并是说从Java5开始，这个类就没有变化过了
        // TODO 在源代码里搜索一下@since，会发现很多方法是在后续的 Java 版本中加进去的
        // TODO 但是private方法就不会有这个文档标示，因为private方法本来就不给用。

        System.out.println("请输入一个巨大的正数");
        BigInteger bigInteger = scanner.nextBigInteger();
        System.out.println("请输入想给这个数加多少");
        BigInteger toBeAdd = scanner.nextBigInteger();
        System.out.println("结果为：" + bigInteger.add(toBeAdd));

    }
}
