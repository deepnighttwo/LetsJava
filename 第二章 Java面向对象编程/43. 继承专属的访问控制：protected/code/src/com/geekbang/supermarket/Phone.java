package com.geekbang.supermarket;

public class Phone extends MerchandiseV2 {

    // >> TODO 使用不同的可见性定义Phone中的属性，protected = default + 继承者可见
    protected double screenSize;
    protected double cpuHZ;
    int memoryG;
    int storageG;
    private String brand;
    private String os;
    private static int MAX_BUY_ONE_ORDER = 5;

    // >> TODO 构造方法可以是protected，但是如果是private，子类就不可以覆盖了。
    //    TODO 如果父类只有一个private的构造方法，相当于这个类不能有子类
    protected Phone(
        String name, String id, int count, double soldPrice, double purchasePrice,
        double screenSize, double cpuHZ, int memoryG, int storageG, String brand, String os
    ) {
        super(name, id, count, soldPrice * 1.2, purchasePrice);
        this.screenSize = screenSize;
        this.cpuHZ = cpuHZ;
        this.memoryG = memoryG;
        this.storageG = storageG;
        this.brand = brand;
        this.os = os;
    }

    public double buy(int count) {
        System.out.println("Phone里的buy(int count)");
        if (count > MAX_BUY_ONE_ORDER) {
            System.out.println("购买失败，手机一次最多只能买" + MAX_BUY_ONE_ORDER + "个");
            return -2;
        }
        return super.buy(count);
    }

    protected String getNameOfPhone() {
        return this.brand + ":" + this.os + ":" + super.getName();
    }

    public String getName() {
        return this.brand + ":" + this.os + ":" + super.getName();
    }

    public void describe() {
        System.out.println("此手机商品属性如下");
        super.describe();
        System.out.println("手机厂商为" + brand + "；系统为" + os + "；硬件配置如下：\n" +
            "屏幕：" + screenSize + "寸\n" +
            "cpu主频" + cpuHZ + " GHz\n" +
            "内存" + memoryG + "Gb\n" +
            "存储空间" + storageG + "Gb");
    }

    public boolean meetCondition() {
        return true;
    }

    public double getScreenSize() {
        return screenSize;
    }

    public void setScreenSize(double screenSize) {
        this.screenSize = screenSize;
    }

    public double getCpuHZ() {
        return cpuHZ;
    }

    public void setCpuHZ(double cpuHZ) {
        this.cpuHZ = cpuHZ;
    }

    public int getMemoryG() {
        return memoryG;
    }

    public void setMemoryG(int memoryG) {
        this.memoryG = memoryG;
    }

    public int getStorageG() {
        return storageG;
    }

    public void setStorageG(int storageG) {
        this.storageG = storageG;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getOs() {
        return os;
    }

    public void setOs(String os) {
        this.os = os;
    }

    public static void staticNoOverride() {
        System.out.println("staticNoOverride in Phone");
    }
}
