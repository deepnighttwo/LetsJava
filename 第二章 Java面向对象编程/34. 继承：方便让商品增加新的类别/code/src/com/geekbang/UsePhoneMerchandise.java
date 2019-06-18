package com.geekbang;

import com.geekbang.supermarket.PhoneExtendsMerchandise;

public class UsePhoneMerchandise {
    public static void main(String[] args) {
        PhoneExtendsMerchandise phoneExtendsMerchandise  = new PhoneExtendsMerchandise(
            "手机001","Phone001",100, 1999, 999,
            4.5,3.5,4,128,"索尼","安卓"
        );

        // phoneExtendsMerchandise.describe();

        phoneExtendsMerchandise.describePhone();
    }
}
