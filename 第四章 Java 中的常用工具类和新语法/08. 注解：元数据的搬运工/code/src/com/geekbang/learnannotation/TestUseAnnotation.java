package com.geekbang.learnannotation;
public class TestUseAnnotation{
//    @PrimaryProperty(defaultValue = "testbggg", targetClass = TestUseAnnotation.class,
//        abc = 9, defaultValues = {"aaa", "bbb"})
    private Object abc;

    @Deprecated
    // TODO 给annotation里的属性赋值的方式
    @PrimaryProperty(defaultValue = "testbggg", targetClass = TestUseAnnotation.class,
        abc = 9, defaultValues = {"aaa", "bbb"})
    public void test() {

    }


}

/**
 * 源代码来自极客时间里的《零基础学Java》，带你零基础入门，夯实Java，欢迎订阅：https://time.geekbang.org/course/intro/181
 */
