package com.geekbang.supermarket;

// >> TODO 类，静态方法，静态变量，成员变量，构造方法，成员方法都可以使用访问修饰符
public class MerchandiseV2 {

    // >> TODO 成员变量应该都声明为private
    // >> TODO 如果要读写这些成员变量，最好使用get set方法，这些方法应该是public的
    // >> TODO 这样做的好处是，如果有需要，可以通过代码，检查每个属性值是否合法。
    private String name;
    private String id;
    private int count;
    private double soldPrice;
    private double purchasePrice;
    private NonPublicClassCanUseAnyName nonPublicClassCanUseAnyName;
    public static double DISCOUNT = 0.1;

    // >> TODO 构造方法如果是private的，那么就只有当前的类可以调用这个构造方法
    public MerchandiseV2(String name, String id, int count, double soldPrice, double purchasePrice) {
        this.name = name;
        this.id = id;
        this.count = count;
        this.soldPrice = soldPrice;
        this.purchasePrice = purchasePrice;
        // soldPrice = 9/0;
    }

    // >> TODO 有些时候，会把所有的构造方法都定义成private的，然后使用静态方法调用构造方法
    // >> TODO 同样的，这样的好处是可以通过代码，检查每个属性值是否合法。
    public static MerchandiseV2 createMerchandise(String name, String id, int count,
                                                  double soldPrice, double purchasePrice) {
        if (soldPrice < 0 || purchasePrice < 0) {
            return null;
        }
        return new MerchandiseV2(name, id, count, soldPrice, purchasePrice);
    }

    public MerchandiseV2(String name, String id, int count, double soldPrice) {
        this(name, id, count, soldPrice, soldPrice * 0.8);
    }

    public MerchandiseV2() {
        this("无名", "000", 0, 1, 1.1);
    }

    // >> TODO public的方法类似一种约定，既然外面的代码可以使用，就意味着不能乱改。比如签名不能改之类的
    public void describe() {
        System.out.println("商品名字叫做" + name + "，id是" + id + "。 商品售价是" + soldPrice
            + "。商品进价是" + purchasePrice + "。商品库存量是" + count +
            "。销售一个的毛利润是" + (soldPrice - purchasePrice));
        freeStyle();
    }

    // >> TODO 对于private的方法，因为类外面掉不到，所以无论怎么改，也不会影响（直接影响）类外面的代码
    private void freeStyle() {

    }

    public double calculateProfit() {
        double profit = soldPrice - purchasePrice;
        return profit;
    }

    public double buy(int count) {
        if (this.count < count) {
            return -1;
        }
        return this.count -= count;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public double getSoldPrice() {
        return soldPrice;
    }

    public void setSoldPrice(double soldPrice) {
        this.soldPrice = soldPrice;
    }

    public double getPurchasePrice() {
        return purchasePrice;
    }

    public void setPurchasePrice(double purchasePrice) {
        this.purchasePrice = purchasePrice;
    }
}
