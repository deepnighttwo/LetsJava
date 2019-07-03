package com.geekbang;

import com.geekbang.supermarket.Category;

import java.util.Scanner;

public class UseEnum {
    public static void main(String[] args) {
        // >> TODO 获取所有枚举，看看枚举实例有哪些方法
        for (Category category : Category.values()) {
            System.out.println("-----------" + category.getId() + "------------");
            System.out.println(category.ordinal());
            System.out.println(category.name());
            System.out.println(category.toString());
        }

        System.out.println();
        // >> TODO 根据名字获取枚举
        System.out.println(Category.valueOf("FOOD"));
//        System.out.println(Category.valueOf("food"));

        Scanner in = new Scanner(System.in);
        System.out.println("请输入枚举的名字：");
        String categoryName = in.next();
        Category enumInput = Category.valueOf(categoryName.trim().toUpperCase());
        System.out.println("枚举的信息：" + enumInput.toString());

        System.out.println("请输入要比较的枚举的名字：");
        String categoryName2 = in.next();
        Category enumInput2 = Category.valueOf(categoryName2.trim().toUpperCase());
        System.out.println("第二次输入的枚举的信息：" + enumInput2.toString());

        System.out.println(enumInput == enumInput2);


    }
}
