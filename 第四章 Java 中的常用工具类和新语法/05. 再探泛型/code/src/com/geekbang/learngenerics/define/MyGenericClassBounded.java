package com.geekbang.learngenerics.define;

import com.geekbang.learngenerics.ext.GrandParent;

// >> TODO 定义泛型，就是把需要的类型定义在类后面的尖括号里，然后在类里面就可以把定义好的泛型像符号一样使用
public class MyGenericClassBounded<MyType extends GrandParent> {

    // >> TODO 实际上这个引用是GrandParent类型的
    private MyType myType;

    public MyGenericClassBounded(MyType myType) {
        // >> TODO 所以在这里可以通过这个引用，调用GrandParent的方法
        myType.getNum();
        this.myType = myType;
    }

    public void setMyType(MyType myType) {
        this.myType = myType;
    }
}
