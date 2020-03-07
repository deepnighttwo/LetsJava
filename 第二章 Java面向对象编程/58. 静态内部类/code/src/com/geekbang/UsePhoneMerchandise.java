package com.geekbang;


import com.geekbang.supermarket.Phone;

public class UsePhoneMerchandise {
    public static void main(String[] args) {
        Phone phone = new Phone(
            "手机001", "Phone001", 100, 1999, 999,
            4.5, 3.5, 4, 128, "索尼", "安卓"
        );

        // phoneExtendsMerchandise.describe();

        phone.describePhone();

        // >> TODO 静态内部类，可以认为是和静态方法、静态成员一样，是类的一个类内部的一个成员，一个组成部分。
        // >> TODO 所以使用的时候，也可以点出来，只是点出来的是个类而已。点出来以后，改怎么用一个类都行
        Phone.CPU cpu = new Phone.CPU(5.5, "default");

        // >> TODO 访问控制：在定义静态内部类的外部的代码，就不可以访问其private的属性了。
//         cpu.speed = 99;

        Math.random();
    }
}
