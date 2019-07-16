package com.geekbang.learnannotation;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.util.Arrays;

public class ReadAnnotationAppMain {
    public static void main(String[] args) throws NoSuchMethodException {
        Class clazz = TestUseAnnotation.class;
        Method method = clazz.getMethod("test");
        for (Annotation annotation : method.getAnnotations()) {
            System.out.println(annotation.annotationType());
        }

        // TODO 读取到注解的内容，可以根据注解的内容，作为相应功能的配置，来实现相应的功能
        PrimaryProperty primaryPropertyAnnotation = method.getAnnotation(PrimaryProperty.class);
        System.out.println(primaryPropertyAnnotation.abc());
        System.out.println(primaryPropertyAnnotation.defaultValue());
        System.out.println(Arrays.asList(primaryPropertyAnnotation.defaultValues()));
        System.out.println(primaryPropertyAnnotation.targetClass());

    }
}
