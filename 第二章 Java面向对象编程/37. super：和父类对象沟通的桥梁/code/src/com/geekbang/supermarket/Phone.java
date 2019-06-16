package com.geekbang.supermarket;

public class Phone extends MerchandiseV2 {

    // 给Phone增加新的属性和方法
    private double screenSize;
    private double cpuHZ;
    private int memoryG;
    private int storageG;
    private String brand;
    private String os;
    private static int MAX_BUY_ONE_ORDER = 5;

    // >> TODO 使用super可以调用父类的方法和属性（当然必须满足访问控制符的控制）
    public double buy(int count) {
        if (count > MAX_BUY_ONE_ORDER) {
            System.out.println("购买失败，手机一次最多只能买" + MAX_BUY_ONE_ORDER + "个");
            return -2;
        }
        return super.buy(count);
    }

    public String getName() {
        return this.brand + ":" + this.os + ":" + name;
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

    // >> TODO super是子类和父类交流的桥梁，但是并不是父类的引用
    // >> TODO 所以，super和this自引用不一样，不是简单可以模拟的（可以模拟的话不就成了组合了吗）
//    public MerchandiseV2 getParent(){
//        return super;
//    }

    public Phone getThisPhone(){
        return this;
    }

    // >> TODO 使用super可以调用父类的public属性，但是super不是一个引用。
    public void accessParentProps() {
        System.out.println("父类里的name属性：" + super.name);
    }

    public void useSuper() {
        // >> TODO super的用法就像是一个父类的引用。它是继承的一部分，像组合的那部分，但不是全部
        super.describe();
        super.buy(66);
        System.out.println("父类里的count属性：" + super.count);
    }

    public Phone(
        String name, String id, int count, double soldPrice, double purchasePrice,
        double screenSize, double cpuHZ, int memoryG, int storageG, String brand, String os
    ) {
        // >> TODO 可以认为，创建子类对象的时候，也就同时创建了一个隐藏的父类对象

        this.screenSize = screenSize;
        this.cpuHZ = cpuHZ;
        this.memoryG = memoryG;
        this.storageG = storageG;
        this.brand = brand;
        this.os = os;

        // >> TODO 所以，才能够setName，对name属性进行操作。
        this.setName(name);
        this.setId(id);
        this.setCount(count);
        this.setSoldPrice(soldPrice);
        this.setPurchasePrice(purchasePrice);
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
}
