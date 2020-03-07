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

        // >> TODO 我们说过，成员内部类里有一个外部类对象的引用。如果是在类内部的成员方法/构造方法创建这个内部类对象，比如CPU，那么
        // >> TODO 这个引用就是this自引用，也就是当前执行方法的对象
        // >> TODO 如果是在成员外部创建内部类的对象，那么就需要指定这个引用是谁，语法如下，有点奇怪，用的比较少
        Phone.CPU cpu = phone.new CPU("default");

    }
}
