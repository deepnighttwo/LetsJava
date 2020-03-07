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

    // >> TODO 匿名类的语法如下，new后面跟着一个接口或者抽象类
    private UnitSpec anywhere = new UnitSpec() {
        @Override
        public double getNumSpec() {
            return Phone.this.speed;
        }

        @Override
        public String getProducer() {
            return "Here";
        }
    };

    // >> TODO 对于抽象类，也可以给构造方法传递参数
    private UnitSpecAbs anywhereAbs = new UnitSpecAbs(1.2, "default") {
        @Override
        public double getNumSpec() {
            return Math.max(Phone.this.speed, this.getSpec());
        }

        @Override
        public String getProducer() {
            return this.getProducerStr();
        }
    };


    private static UnitSpec anywhereStatic = new UnitSpec() {
        @Override
        public double getNumSpec() {
            return Math.random();
        }

        @Override
        public String getProducer() {
            return "Here";
        }
    };

    public Phone(

        String name, String id, int count, double soldPrice, double purchasePrice,
        double screenSize, double cpuHZ, int memoryG, int storageG, String brand, String os
    ) {

        double localCPUHZ = cpuHZ;

//        localCPUHZ = Math.random();

        this.screenSize = screenSize;
        // >> TODO 可以像平常的类一样使用局部内部类
        this.speed = cpuHZ;
        this.cpu = new UnitSpec() {
            @Override
            public double getNumSpec() {
                // >> TODO 实际用的比较多的是匿名类和静态内部类（为了单例），成员内部类和局部内部类用的比较少
                // >> TODO 同样的，方法里的匿名类在访问局部变量和参数时，它们也必须是实际final的
                return Math.max(Phone.this.speed, Math.max(cpuHZ, localCPUHZ));
            }

            @Override
            public String getProducer() {
                return "default";
            }
        };
        this.memoryG = new UnitSpec() {

            @Override
            public double getNumSpec() {
                return memoryG;
            }

            @Override
            public String getProducer() {
                return "default";
            }
        };
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

    public UnitSpec getCpu() {
        return cpu;
    }

    public void setCpu(UnitSpec cpu) {
        this.cpu = cpu;
    }

    public UnitSpec getMemoryG() {
        return memoryG;
    }

    public void setMemoryG(UnitSpec memoryG) {
        this.memoryG = memoryG;
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
