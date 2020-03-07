package com.geekbang;

import com.geekbang.supermarket.LittleSuperMarket;
import com.geekbang.supermarket.MerchandiseV2;
import com.geekbang.supermarket.Phone;
import com.geekbang.supermarket.ShellColorChangePhone;

public class StaticMethodDoesNotBelieveOverride {
    public static void main(String[] args) {
        LittleSuperMarket superMarket = new LittleSuperMarket("大卖场",
            "世纪大道1号", 500, 600, 100);


        System.out.println("-----1------");


        // >> TODO 静态方法可以被继承
        MerchandiseV2.staticMethod();
        Phone.staticMethod();
        ShellColorChangePhone.staticMethod();

        System.out.println("-----2------");

        MerchandiseV2 m = superMarket.getMerchandiseOf(100);

        // >> TODO 用引用调用静态方法没有覆盖
        m.staticMethod();
        ((Phone) m).staticMethod();
        ((ShellColorChangePhone) m).staticMethod();
        // TODO 有些东西，学会就应该马上忘掉，比如上面使用引用调用静态方法的内容

        System.out.println("-----3------");

        ((MerchandiseV2) null).staticMethod();
        ((Phone) null).staticMethod();
        ((ShellColorChangePhone) null).staticMethod();
        // TODO 有些东西，学会就应该马上忘掉，比如上面使用有类型的null引用调用静态方法的内容

    }
}
