package com.geekbang.supermarket;

public class Phone extends MerchandiseV2 {

    // 给Phone增加新的属性和方法
    private double screenSize;
    private CPU cpu;
    private int memoryG;
    private int storageG;
    private String brand;
    private String os;

    // >> TODO 静态内部类，是在类中使用static修饰的类
    // >> TODO 静态内部类，可以有访问控制符。静态内部类和静态方法，静态变量一样，都是类的静态组成部分
    // >> TODO 静态内部类也是类，在继承，实现接口方面，都是一样的。以后我们讲的类，不特殊说明，在这方面都是一样的
    public static class CPU {
        private double speed;
        private String producer;

        public CPU(double speed, String producer) {
            this.speed = speed;
            this.producer = producer;
        }

        public double getSpeed() {
            // >> TODO 静态内部类，代码和这个类本身的访问权限一样，可以访问外部（Phone）的private属性
            // >> TODO 注意，这并不少说它可以访问private变量，
            // >> TODO 静态内部类是静态的，就好像静态方法一样，没有this自引用，可以通过引用访问Phone对象的private属性
            // 仅作演示访问性，不具有实际意义
            Phone phone = null;
            phone.memoryG = 99;
            return speed;
        }

        public void setSpeed(double speed) {
            this.speed = speed;
        }

        public String getProducer() {
            return producer;
        }

        public void setProducer(String producer) {
            this.producer = producer;
        }

        @Override
        public String toString() {
            return "CPU{" +
                "speed=" + speed +
                ", producer='" + producer + '\'' +
                '}';
        }

        // >> TODO 静态内部类，里面可以有任意合法的类的组成部分，包括静态内部类
//        public static class ABC{
//
//        }

    }

    public void accessStaticClass(){
        // >> TODO 同样，外部类也可以访问静态内部类（CPU）的private属性
        // 仅作演示访问性，不具有实际意义
        this.cpu.producer = "";
    }


    public Phone(
        String name, String id, int count, double soldPrice, double purchasePrice,
        double screenSize, double cpuHZ, int memoryG, int storageG, String brand, String os
    ) {

        this.screenSize = screenSize;
        // >> TODO 可以像平常的类一样使用静态内部类
        this.cpu = new CPU(cpuHZ, "Default");
        this.memoryG = memoryG;
        this.storageG = storageG;
        this.brand = brand;
        this.os = os;

        this.setName(name);
        this.setId(id);
        this.setCount(count);
        this.setSoldPrice(soldPrice);
        this.setPurchasePrice(purchasePrice);
    }

    public void describePhone() {

        System.out.println("此手机商品属性如下");
        describe();
        System.out.println("手机厂商为" + brand + "；系统为" + os + "；硬件配置如下：\n" +
            "屏幕：" + screenSize + "寸\n" +
            "cpu信息：" + cpu + " \n" +
            "内存" + memoryG + "Gb\n" +
            "存储空间" + storageG + "Gb\n");

    }

}

// >> TODO 非共有类和静态内部类，实际区别就在于能否访问类的private成员
class Memory {
    private long capacity;
    private String producer;

    public Memory(long capacity, String producer) {
        this.capacity = capacity;
        this.producer = producer;
    }

    public void test(){
        // >> TODO 在类的外面的代码，不能访问类的private成员
        // 仅作演示访问性，不具有实际意义
//        Phone ph = null;
//        ph.screenSize = 9;
    }

    public long getCapacity() {
        return capacity;
    }

    public void setCapacity(long capacity) {
        this.capacity = capacity;
    }

    public String getProducer() {
        return producer;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }
}
