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

/**
 * 源代码来自极客时间里的《零基础学Java》，带你零基础入门，夯实Java，欢迎订阅：https://time.geekbang.org/course/intro/181
 */
