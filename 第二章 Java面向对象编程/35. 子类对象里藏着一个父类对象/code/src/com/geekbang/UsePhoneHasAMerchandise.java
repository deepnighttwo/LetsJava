package com.geekbang;

import com.geekbang.supermarket.MerchandiseV2;
import com.geekbang.supermarket.PhoneHasAMerchandise;

public class UsePhoneHasAMerchandise {
    public static void main(String[] args) {
        MerchandiseV2 merchandise = new MerchandiseV2(
            "手机001", "Phone001", 100, 1999, 999);
        PhoneHasAMerchandise phone = new PhoneHasAMerchandise(
            4.5, 3.5, 4, 128, "索尼", "安卓", merchandise);

        phone.describePhone();

        // TODO 所有和商品相关的操作，我们要先从Phone里获得商品的引用，然后再通过这个引用操作商品
        phone.getMerchandise().describe();

        // TODO 如果我们想要让手机返回不一样的商品名字，比如加上手机厂商和型号，其实可以做到，但是不容易。
        // TODO 我们可以在每次修改手机的厂商和型号的时候，都去set一下商品的名字。繁琐，但是做得到
        phone.getMerchandise().getName();

        // TODO 如果要限制购买的数量不超过5怎么办？来移步继承
        phone.getMerchandise().buy(100);

    }
}
