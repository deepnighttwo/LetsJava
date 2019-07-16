package com.geekbang.learnlambda;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Consumer;

public class IterateListLambdaAppMain {
    public static void main(String[] args) {
        List<String> myList = addElementsToList(new ArrayList<>());
        String outside = "outside string";

        for (String s : myList) {
            processString(outside + s);
        }

        // TODO 匿名内部类版
        myList.forEach(
                new Consumer<String>() {
                    @Override
                    public void accept(String s) {
                        processString(outside + s);
                    }
                }
        );
        // TODO lambda的表达式必须能够符合接口中定义的抽象方法，从参数，到返回值，到异常，都必须匹配

        // TODO lambda 完整版 (参数) -> {代码块}
        // TODO lambda可以有返回值，使用return语句就可以，当然我们这个接口没有，我们的lambda表达式也不能有
        // TODO lambda可以使用外部数据，怎么看都和匿名内部类是一样的
        myList.forEach(
                (s) -> {
                    processString(outside + s);
                }
        );

        // TODO lambda 单参数，代码单行 简化版，
        myList.forEach(s -> processString(outside + s));

        // TODO lambda 如果不使用外部变量，还有方法引用终极简化版
        myList.forEach(IterateListLambdaAppMain::processString);

        // TODO lambda 方法引用终极简化版：不是静态方法，用引用也可以
        IterateListLambdaAppMain inst = new IterateListLambdaAppMain();
        myList.forEach(inst::processStringInst);

        // TODO lambda也允许指定一个参数类型里的一个方法作为方法的引用
        myList.forEach(String::toUpperCase);

        Map<String, String> myMap = new HashMap<>();
        myMap.put("k1", "v1");
        myMap.put("k2", "v2");
        myMap.put("k3", "v3");
        // TODO 两个参数也没问题，把参数用括号扩起来，用逗号分开
        myMap.forEach((k, v) -> processTwoStrings(k, v));
        // TODO 省略也没问题
        myMap.forEach(IterateListLambdaAppMain::processTwoStrings);


    }

    public static List<String> addElementsToList(List<String> list) {
        for (int i = 0; i < 22; i++) {
            list.add("str" + i);
        }
        return list;
    }


    private static void processString(String str) {
        System.out.println(str);
    }

    private static void processTwoStrings(String str1, String str2) {
        System.out.println("s1=" + str1 + ", s2=" + str2);
    }

    private void processStringInst(String str) {
        System.out.println(str);
    }

}
