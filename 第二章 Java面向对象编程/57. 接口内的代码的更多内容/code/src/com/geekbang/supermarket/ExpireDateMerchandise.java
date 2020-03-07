package com.geekbang.supermarket;

import java.util.Date;

// >> TODO 有方法的接口，并不是多继承。接口不可以继承类，这一点就打破了
// >> TODO 同样，接口不可以声明实例变量。其方法是有限制的，比如这个接口，因为不能声明实例变量，
// >> TODO 只能通过getProducedDate和getExpireDate，间接通过实现接口的类，获取数据
// >> TODO 和抽象方法不同，如果一个类实现了两个接口，并且两个接口里有相同的缺省方法，编译器会报错
public interface ExpireDateMerchandise {

    // >> TODO 缺省方法，也有this自引用，但是只能调用接口里的方法，或者继承的接口里的方法
    // >> TODO 因为能new出实例来的，肯定是实现了所有方法的，this自引用就是指向那个对象，所以使用起来不会有问题

    /**
     * 截止到当前，商品的保质期天数是否超过传递的天数
     *
     * @param days 截止到当前，保质期超过这么多天
     * @return 截止到当前，true如果保质期剩余天数比参数长，false如果保质期不到这多天
     */
    default boolean notExpireInDays(int days) {
        return daysBeforeExpire() > days;
    }

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
    default double leftDatePercentage() {
        return 1.0 * daysBeforeExpire() / (daysBeforeExpire() + daysAfterProduce());
    }

    /**
     * 根据剩余的有效期百分比，得出商品现在实际的价值
     *
     * @param leftDatePercentage 剩余有效期百分比
     * @return 剩余的实际价值
     */
    double actualValueNow(double leftDatePercentage);

    private long daysBeforeExpire() {
        return daysBetween(System.currentTimeMillis(), getExpireDate().getTime());
    }

    private long daysAfterProduce() {
        return daysBetween(getProducedDate().getTime(), System.currentTimeMillis());
    }

    // >> TODO 接口中可以有静态方法，不需要用default修饰。静态方法可以被实现接口的类继承
    public static long daysBetween(long from, long to) {
        long gap = to - from;
        if (gap < 0) {
            return -1;
        }
        return gap / (24 * 3600 * 1000);
    }

    default void testDuplicatedMethod() {
    }

}
