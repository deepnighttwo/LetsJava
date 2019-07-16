package com.geekbang.learncollection;

import com.geekbang.learncollection.mylist.MyArrayList;

import java.util.Collection;

public class UseListAppMain {

    public static void main(String[] args) {
        // >> TODO 设断点，看看是不是真的跑到了我们刚刚实现的iterator方法里
        printCollection(addElementsToCollection(new MyArrayList()));
    }


    public static Collection addElementsToCollection(Collection collection) {
        for (int i = 0; i < 10; i++) {
            collection.add("str" + (i % 5));
        }
        return collection;
    }

    public static void printCollection(Collection collection) {
        System.out.println();
        System.out.println("输出" + collection.getClass() + "中的元素，共" + collection.size() + "个");
        try {
            for (Object element : collection) {
                System.out.println(element);
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

}
