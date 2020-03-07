package com.geekbang.learntimer;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

public class LearnDate {
    public static void main(String[] args) {
        operateTime();

        initCalendar();

        setTimeManually();
    }

    private static void setTimeManually() {
        Calendar calendar = Calendar.getInstance();
        calendar.set(2020, Calendar.NOVEMBER, 20, 21, 36, 55);
        Date date = calendar.getTime();
        System.out.println(date);

        // TODO SimpleDateFormat 不是线程安全的，对线程共用一个 instance 会有问题
        // TODO 可以考虑用 ThreadLocal 给每个工作线程分配一个，也可以每次用到的时候创建实例。
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日 HH时mm分ss秒", Locale.SIMPLIFIED_CHINESE);

        System.out.println(sdf.format(date));

    }

    private static void initCalendar() {
        Calendar c2 = Calendar.getInstance();
        // TODO 如果要操作一个 Date 实例的时间，可以先创建一个Calendar，然后进行操作
        c2.setTimeInMillis(System.currentTimeMillis() - TimeUnit.DAYS.toMillis(10));
        c2.setTime(new Date());
    }

    private static void operateTime() {
        // TODO 默认是当前时间
        Calendar calendar = Calendar.getInstance();

        // TODO 使用 Calendar 可以对时间进行加减
        calendar.add(Calendar.DAY_OF_YEAR, 100);

        calendar.add(Calendar.MINUTE, 100);

        // TODO 可以方便的得到 Date 对象
        Date date = calendar.getTime();
    }
}
