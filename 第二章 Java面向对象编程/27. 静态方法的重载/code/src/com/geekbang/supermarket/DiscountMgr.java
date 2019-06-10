package com.geekbang.supermarket;

public class DiscountMgr {

    public static double BASE_DISCOUNT = 0.99;

    public static double VIP_DISCOUNT = 0.85;

    public static double SVIP_DISCOUNT = 0.75;

    // >> TODO 静态方法的重载也是一样的，方法签名不同即可：方法名+参数类型
    // >> TODO 判断调用哪个方法，也是根据调用时参数匹配决定的。
    public static double getDiscount() {
        return BASE_DISCOUNT;
    }

    public static double getDiscount(boolean isVIP) {
        // TODO >> 这节课这么无聊，我们顺带学一个三元操作符吧。
        // TODO    三元操作符的返回类型就是冒号两边的类型，两边的类型要和等号左边的变量类型兼容
        // double abc = true ? "" : 0;

        double svipDiscount = (isVIP ? VIP_DISCOUNT : 1);
        return getDiscount() * svipDiscount;
    }

    public static double getDiscount(int svipLevel) {
        double ret = getDiscount() * VIP_DISCOUNT;
        for (int i = 0; i < svipLevel; i++) {
            ret *= SVIP_DISCOUNT;
        }
        return ret;
    }

    // 这节课这么无聊，我们顺带看几个不是那么正经的getDiscount吧

    // >> TODO 返回值不算是方法签名，重载的方法可以有完全不同的返回值类型
    public static void getDiscount(String s) {
        System.out.println(s);
    }

    public static int getDiscount(int a, int b) {
        return a > b ? a : b;
    }


    public static boolean getDiscount(int a, int b, int c) {
        return a > b && b > c;
    }

    public static String getDiscount(long abc) {
        return "" + abc;
    }

    public static void main(String[] args) {
        getDiscount(1, 2);
    }

}
