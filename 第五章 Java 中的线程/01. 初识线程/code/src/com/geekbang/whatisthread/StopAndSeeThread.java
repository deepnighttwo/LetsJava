package com.geekbang.whatisthread;

public class StopAndSeeThread {
    public static void main(String[] args) {
        m1();
    }

   private static void m1(){
        m2();
   }

    private static void m2() {
        int a =999;
        m3();
    }

    private static void m3() {
        int a =333;
        m4();
    }

    private static void m4() {
        m5();
    }

    private static void m5() {
        int a = 555;
        m6();
    }

    private static void m6() {
        System.out.println("断点停住");
    }
}
