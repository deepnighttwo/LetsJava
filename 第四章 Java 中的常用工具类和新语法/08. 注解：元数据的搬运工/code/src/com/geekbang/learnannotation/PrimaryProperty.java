package com.geekbang.learnannotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

// TODO 注解可以被用在哪个/哪些元素上
@Target(ElementType.METHOD)
// TODO 注解会被留存到哪阶段
@Retention(RetentionPolicy.RUNTIME)
// TODO 以上两个元素是每个注解都必须要有的

// TODO 定义一个自己的annotation，需要@interfae，实际上这个接口会继承Annotation接口
public @interface PrimaryProperty {
    // >> TODO  annotation支持的类型有基本数据类型，Class，String，枚举，其它注解，以上类型的数组
    // TODO 可以指定缺省值
    String defaultValue() default "N/A";

    Class targetClass();

    int abc();

    String[] defaultValues();

    // TODO 注解类型的缺省值
    Override is() default @Override;

}
