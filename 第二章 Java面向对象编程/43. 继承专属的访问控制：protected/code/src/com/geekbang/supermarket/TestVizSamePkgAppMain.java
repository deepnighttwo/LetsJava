package com.geekbang.supermarket;

public class TestVizSamePkgAppMain {
    public static void main(String[] args) {
        LittleSuperMarket superMarket = new LittleSuperMarket("大卖场",
            "世纪大道1号", 500, 600, 100);

        // >> TODO 同一个包里的代码，可以访问缺省和protected
        Phone ph = (Phone) superMarket.getMerchandiseOf(10);
        System.out.println(ph.screenSize);
        System.out.println(ph.memoryG);

        // >> TODO 同一个包里的代码，可以访问缺省和protected，子类也没问题
        ShellColorChangePhone scp = (ShellColorChangePhone) superMarket.getMerchandiseOf(100);
        System.out.println(scp.screenSize);
        System.out.println(scp.memoryG);

    }
}
