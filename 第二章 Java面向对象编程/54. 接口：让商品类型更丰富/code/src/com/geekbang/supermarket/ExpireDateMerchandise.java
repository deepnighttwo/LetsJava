package com.geekbang.supermarket;

import java.util.Date;

// >> TODO 接口的定义使用interface，而非class
// >> TODO 接口中的方法，就是这个类型的规范，接口专注于规范，怎么实现这些规范，它不管
// >> TODO 接口无法被实例话，也就是不可以new一个接口的实例。
public interface ExpireDateMerchandise {

    // >> TODO 接口里的方法都是public abstract修饰的，方法有名字，参数和返回值，没有方法体，以分号;结束，
    // TODO 接口注释最好写一下
    /**
     * 截止到当前，商品的保质期天数是否超过传递的天数
     *
     * @param days 截止到当前，保质期超过这么多天
     * @return 截止到当前，true如果保质期剩余天数比参数长，false如果保质期不到这多天
     */
    boolean notExpireInDays(int days);

    // >> TODO 因为接口里的方法都是且只能用public abstract修饰，所以这俩修饰符可以省略
    // >> TODO abstract就是抽象方法的修饰符，没有方法体，以分号结束
    /**
     * @return 商品生产日期
     */
    Date getProducedDate();

    /**
     * @return 商品保质期到期日
     */
    public abstract Date getExpireDate();

    /**
     * @return 截止到当前，剩余保质期还剩下总保质期长度的百分比
     */
    double leftDatePercentage();


    /**
     * 根据剩余的有效期百分比，得出商品现在实际的价值
     * @param leftDatePercentage 剩余有效期百分比
     * @return 剩余的实际价值
     */
    double actualValueNow(double leftDatePercentage);

    // >> TODO 接口里不能定义局部变量，定义的变量默认都是public static final的，这三个修饰符同样可以省略

    public static final int VAL_IN_INTERFACE = 999;

}
