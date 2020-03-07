package com.geekbang.learngenerics.define;

// >> TODO 定义泛型，就是把需要的类型定义在类后面的尖括号里，然后在类里面就可以把定义好的泛型像符号一样使用
public class MyGenericClass<First, Second> {

    // >> TODO 实际上这两个引用都是Object类型的
    private First first;

    private Second second;

    public MyGenericClass(First first, Second second) {
        this.first = first;
        this.second = second;
    }

    public First getFirst() {
        return first;
    }

    public void setFirst(First first) {
        this.first = first;
    }

    public Second getSecond() {
        return second;
    }

    public void setSecond(Second second) {
        this.second = second;
    }


    public <Another> Another getAnother(Object val) {
        return (Another) val;
    }

}

/**
 * 源代码来自极客时间里的《零基础学Java》，带你零基础入门，夯实Java，欢迎订阅：https://time.geekbang.org/course/intro/181
 */
