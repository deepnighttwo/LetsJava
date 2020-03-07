package com.geekbang.learngenerics;

import com.geekbang.learngenerics.define.MyGenericClass;
import com.geekbang.learngenerics.ext.GrandParent;
import com.geekbang.learngenerics.ext.Parent;

import java.lang.reflect.Field;
// >> TODO 泛型的作用包括：1) 告诉编译器帮我们检查类型是否匹配，类型是什么不重要，类型一样才重要；
// >> TODO              2) 在使用的地方悄悄的帮我们做类型强制转换。
public class DefineGenericTypesAppMain {
    public static void main(String[] args) throws NoSuchFieldException {

        Field field2 = MyGenericClass.class.getDeclaredField("first");
        System.out.println("first的类型是" + field2.getType());

        MyGenericClass<String, Object> test = new MyGenericClass<>("inst1", new Object());
        MyGenericClass<String, Object> test2 = new MyGenericClass<>("inst2", "aaabbb");

        String first = test.getFirst();
        System.out.println(first);
        // String second = test.getSecond();

        // TODO >> 方法的类型参数也是一样，换到了使用的地方做类型强制转换
        String another = test.getAnother("safe");
//        String another = test.getAnother(new Object());
//         String another = (String) test.getAnother(new Object());


        // TODO >> 如果泛型信息缺失了，编译器也无法帮忙检查出类型不匹配，只能给出 unchecked 编译警告
        MyGenericClass mc = new MyGenericClass("", "");
        MyGenericClass<GrandParent, Parent> cast = mc;

        // TODO >> 会出错，因为cast指向的实例其实里面存的是两个String
//        GrandParent a = cast.getFirst();
        // TODO >> 只调用这个方法，不会出错
        cast.getFirst();

    }
}
