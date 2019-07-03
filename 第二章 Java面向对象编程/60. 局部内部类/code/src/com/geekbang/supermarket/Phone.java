package com.geekbang.supermarket;

public class Phone extends MerchandiseV2 {

    // 给Phone增加新的属性和方法
    private double screenSize;
    private UnitSpec cpu;
    private UnitSpec memoryG;
    private int storageG;
    private String brand;
    private String os;
    private double speed;

    // >> TODO 接口也可以定义为静态内部接口，但是一般不这么做。接口的目的是为了让更多人实现，所以一般会是单独一个文件作为公共接口
    public static interface UnitSpec {
        public double getNumSpec();

        public String getProducer();
    }

    public Phone(
        String name, String id, int count, double soldPrice, double purchasePrice,
        double screenSize, double cpuHZ, int memoryG, int storageG, String brand, String os
    ) {

        double localCPUHZ = cpuHZ;

//        localCPUHZ = Math.random();

        // >> TODO 局部内部类，是在类中直接定义类
        // >> TODO 局部内部类，不可以包含任何静态的成分，比如静态方法，静态变量，静态内部类。否则会造成内外部类初始化问题。
        // >> TODO 局部内部类，不可以有访问控制符。局部内部类和成员方法，成员变量一样，都是类的组成部分
        class CPU implements UnitSpec {
            // >> TODO 可以有final static的基本数据类型变量
            final static int abc = 999;

            private String producer;

            public CPU(String producer) {
                this.producer = producer;
            }

            public double getNumSpec() {
                // >> TODO 局部内部类，代码和这个类本身的访问权限一样，可以访问外部（Phone）的private属性
                // >> TODO 局部内部类中有一个外部类的引用
                // >> TODO 局部内部类访问外部类的对象的成员属性的完整写法如下，类名.this.属性/方法
                // >> TODO 以上都和成员内部类一样。除此之外，局部内部类还可以访问参数和局部变量，但是它俩必须是实际final的
              // 仅做访问数据的演示，没有实际意义
                return Math.max(Phone.this.speed, Math.max(cpuHZ, localCPUHZ));
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
                    "speed=" + getNumSpec() +
                    ", producer='" + producer + '\'' +
                    '}';
            }

            // >> TODO 局部内部类，就好像局部变量一样，方法内部的东西出了代码就不可被访问，
            // >> TODO 所以可以再定义类，但是不能有访问控制符，也不能是static，就好像成员变量没有访问控制符没有static一样
            // >> TODO 但是可以有final。记忆要点：和局部变量一样
//            final class ABC {
//                public void test() {
//
//                }
//            }

        }


        class Memory implements UnitSpec {
            private String producer;

            public Memory(String producer) {
                this.producer = producer;
            }

            @Override
            public double getNumSpec() {
                return memoryG;
            }

            public String getProducer() {
                return producer;
            }

            public String toString() {
                return "Memory{" +
                    "storage=" + getNumSpec() +
                    ", producer='" + producer + '\'' +
                    '}';
            }

        }

        this.screenSize = screenSize;
        // >> TODO 可以像平常的类一样使用局部内部类
        this.speed = cpuHZ;
        this.cpu = new CPU("Default");
        this.memoryG = new Memory("Default");
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
            "内存" + memoryG.getNumSpec() + "Gb\n" +
            "存储空间" + storageG + "Gb\n");
    }

    public double getScreenSize() {
        return screenSize;
    }

    public void setScreenSize(double screenSize) {
        this.screenSize = screenSize;
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
