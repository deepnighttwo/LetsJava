package com.geekbang;

import com.geekbang.supermarket.LittleSuperMarket;
import com.geekbang.supermarket.MerchandiseV2;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class ReflectionAppMain {
    public static void main(String... args) throws NoSuchFieldException, IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        LittleSuperMarket superMarket = new LittleSuperMarket("大卖场",
                "世纪大道1号", 500, 600, 100);

        MerchandiseV2 m100 = superMarket.getMerchandiseOf(100);

        // TODO 另一种获得Class实例的方法，直接类名点
        Class clazz = MerchandiseV2.class;
//
//        Field countField = clazz.getField("count");
//        System.out.println("通过反射获取count的值："+countField.get(m100));
//
//        Method buyMethod = clazz.getMethod("buy", int.class);
//        System.out.println(buyMethod.invoke(m100, 10));

//        Field countField = clazz.getDeclaredField("count");
//        countField.setAccessible(true);
//        System.out.println(countField.get(m100));
//        countField.set(m100, 999);
//        System.out.println(countField.get(m100));
//        System.out.println(m100.count);

//        printFields(clazz);
//
//        Field field = clazz.getField("STATIC_MEMBER");
//        System.out.println(field.get(null));

        Method descMethod = clazz.getDeclaredMethod("describe");
        descMethod.setAccessible(true);
        descMethod.invoke(m100);
        descMethod.invoke(superMarket.getMerchandiseOf(0));
        descMethod.invoke(superMarket.getMerchandiseOf(10));
//        m100.describe();

//        Method staticMethod = clazz.getMethod("getNameOf", MerchandiseV2.class);
//        String str = (String) staticMethod.invoke(null, m100);
//        System.out.println(str);

//        Method buyMethod = clazz.getMethod("buy", int.class);
//        buyMethod.invoke(m100, 1);
//        m100.buy(10);


    }

    public static void printFields(Class clazz) {
        System.out.println(clazz.getName() + "里的field");
        for (Field field : clazz.getFields()) {
            System.out.println(field.getType() + " " + field.getName());
        }
    }

}
