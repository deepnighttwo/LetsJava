package com.geekbang;

import com.geekbang.supermarket.PhoneExtendsMerchandise;

public class UsePhoneExtendsMerchandise {
    public static void main(String[] args) {
        PhoneExtendsMerchandise phone  = new PhoneExtendsMerchandise(
            "手机001","Phone001",100, 1999, 999,
            4.5,3.5,4,128,"索尼","安卓"
        );

        phone.describePhone();

        phone.buy(100);
    }
}
