package com.phone.parts;

public class TestUseMainboard {
    public static void main(String[] args) {
        Mainboard mainboard = new Mainboard();
        mainboard.cpu = new CPU();
        mainboard.cpu.producer="aaa";
    }
}
