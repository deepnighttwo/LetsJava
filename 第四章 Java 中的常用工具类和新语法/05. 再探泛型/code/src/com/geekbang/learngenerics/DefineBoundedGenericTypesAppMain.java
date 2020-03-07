package com.geekbang.learngenerics;

import com.geekbang.learngenerics.define.MyGenericClassBounded;

import java.lang.reflect.Field;

public class DefineBoundedGenericTypesAppMain {
    public static void main(String[] args) throws NoSuchFieldException {
//        MyGenericClassBounded bounded = new MyGenericClassBounded("");
        // >> TODO 如果在定义的时候就指定了类型，那么引用的类型就是指定的类型的最父级的类型，在这里就是GrandParent
        Field field = MyGenericClassBounded.class.getDeclaredField("myType");
        System.out.println(field.getType());


    }
}
