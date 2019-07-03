package com.geekbang.supermarket;

public class Phone extends MerchandiseV2 {

    // 给Phone增加新的属性和方法
    private double screenSize;
    private CPU cpu;
    private Memory memory;
    private int storageG;
    private String brand;
    private String os;
    private double speed;
    private int memoryG;

    // >> TODO 成员内部类，是在类中直接定义类
    // >> TODO 成员内部类，不可以包含任何静态的成分，比如静态方法，静态变量，静态内部类。否则会造成内外部类初始化问题。
    // >> TODO 成员内部类，可以有访问控制符。成员内部类和成员方法，成员变量一样，都是类的组成部分
    public class CPU {
        // >> TODO 可以有final static的基本数据类型变量
        final static int abc = 999;

        private String producer;

        public CPU(String producer) {
            this.producer = producer;
        }

        public double getSpeed() {
            // >> TODO 成员内部类，代码和这个类本身的访问权限一样，可以访问外部（Phone）的private属性
            // >> TODO 成员内部类中有一个外部类的引用，其访问外部类的对象的成员属性就是使用这个引用，完整写法是：类名.this.属性/方法
            return Phone.this.speed;
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
                "speed=" + getSpeed() +
                ", producer='" + producer + '\'' +
                '}';
        }

        // >> TODO 成员内部类，里面可以有任意合法的类的组成部分，包括成员内部类，但是不可以有静态内部类
//        public class ABC{
//            public void test(){
//
//            }
//        }

    }


    public class Memory {
        private String producer;

        public Memory(String producer) {
            this.producer = producer;
        }

        public double getSpeed() {
            return Phone.this.memoryG;
        }

        public String getProducer() {
            return producer;
        }

        public void setProducer(String producer) {
            this.producer = producer;
        }

        @Override
        public String toString() {
            return "Memory{" +
                "memoryG=" + memoryG +
                ", producer='" + producer + '\'' +
                '}';
        }

    }


    public void accessStaticClass() {
        // >> TODO 同样，外部类也可以访问成员内部类（CPU）的private属性
        // 仅作演示访问性，不具有实际意义
        this.cpu.producer = "";
    }


    public Phone(
        String name, String id, int count, double soldPrice, double purchasePrice,
        double screenSize, double cpuHZ, int memoryG, int storageG, String brand, String os
    ) {
        this.screenSize = screenSize;
        // >> TODO 可以像平常的类一样使用成员内部类
        this.speed = cpuHZ;
        this.memoryG = memoryG;
        this.cpu = new CPU("Default");
        this.memory = new Memory("Default");
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
            "内存信息：" + memory + "\n" +
            "存储空间" + storageG + "Gb\n");
    }

    public double getScreenSize() {
        return screenSize;
    }

    public void setScreenSize(double screenSize) {
        this.screenSize = screenSize;
    }

    public CPU getCpu() {
        return cpu;
    }

    public void setCpu(CPU cpu) {
        this.cpu = cpu;
    }

    public Memory getMemory() {
        return memory;
    }

    public void setMemory(Memory memory) {
        this.memory = memory;
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

    public double getSpeed() {
        return speed;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }
}
