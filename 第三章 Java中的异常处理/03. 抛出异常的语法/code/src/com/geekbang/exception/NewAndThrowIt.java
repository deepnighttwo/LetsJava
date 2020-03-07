package com.geekbang.exception;

public class NewAndThrowIt {

    public static void main(String[] args) throws Exception {
        causeException();
    }

    public static void causeException() throws Exception {
        // >> TODO 可以创建一个checked exception，然后用throw关键字扔出去
        // >> TODO 这时候就需要方法也要有throws语句，同样的，throws语句的类型要能覆盖实际异常的类型
        throw new Exception("");
    }

    public static void causeRuntimeException() throws RuntimeException {
        // >> TODO 可以创建一个unchecked exception，然后用throw关键字扔出去
        // >> TODO 这时候，方法可以有，也可以没有throws语句
        throw new RuntimeException("");
    }

}
