package com.geekbang.learncollection.mylist;

import java.util.*;

// >> TODO 泛型可以不变，也可以让它 extends 一个类
public class MyArrayList<T> implements List<T> {

    private Object[] elements;

    private int curr;

    public MyArrayList() {
        elements = new Object[16];
        curr = 0;
    }

    @Override
    public int size() {
        return curr;
    }

    @Override
    public boolean isEmpty() {
        return curr == 0;
    }

    @Override
    public boolean contains(Object o) {

        for (Object ele : elements) {
            if (Objects.equals(ele, o)) {
                return true;
            }
        }

        return false;
    }

    @Override
    public void clear() {
        curr = 0;
    }

    // >> TODO SuppressWarnings注解只是源码级别的，告诉编译器哪个编译警告我们已经知晓了，不用再在编译的时候报出来了
    @SuppressWarnings("unchecked")
    @Override
    public T get(int index) {
        if (index > curr || index < 0) {
            throw new IndexOutOfBoundsException("out of bound " + curr + " for " + index);
        }
        return (T) elements[index];
    }

    // >> TODO 使用泛型之后，在实现接口的时候，用泛型代替原来的Object
    @Override
    public boolean add(T o) {
        if (curr == elements.length - 1) {
            elements = new Object[elements.length * 2];
        }
        elements[curr] = o;
        curr++;
        return true;
    }

    // >> TODO 实现 Iterable 接口里定义的iterator接口
    @Override
    public Iterator<T> iterator() {
        return new Iterator<>() {

            int pointer = 0;

            @Override
            public boolean hasNext() {
                return pointer < size();
            }

            @SuppressWarnings("unchecked")
            @Override
            public T next() {
                return (T) elements[pointer++];
            }
        };
    }

    @Override
    public Object[] toArray() {
        throw new UnsupportedOperationException();
    }

    @Override
    public boolean remove(Object o) {
        throw new UnsupportedOperationException();
    }

    @Override
    public boolean addAll(Collection c) {
        throw new UnsupportedOperationException();
    }

    @Override
    public boolean addAll(int index, Collection c) {
        throw new UnsupportedOperationException();
    }


    @Override
    public Object set(int index, Object element) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void add(int index, Object element) {
        throw new UnsupportedOperationException();
    }

    @Override
    public T remove(int index) {
        throw new UnsupportedOperationException();
    }

    @Override
    public int indexOf(Object o) {
        throw new UnsupportedOperationException();
    }

    @Override
    public int lastIndexOf(Object o) {
        throw new UnsupportedOperationException();
    }

    @Override
    public ListIterator listIterator() {
        throw new UnsupportedOperationException();
    }

    @Override
    public ListIterator listIterator(int index) {
        throw new UnsupportedOperationException();
    }

    @Override
    public List subList(int fromIndex, int toIndex) {
        throw new UnsupportedOperationException();
    }

    @Override
    public boolean retainAll(Collection c) {
        throw new UnsupportedOperationException();
    }

    @Override
    public boolean removeAll(Collection c) {
        throw new UnsupportedOperationException();
    }

    @Override
    public boolean containsAll(Collection c) {
        throw new UnsupportedOperationException();
    }

    @Override
    public Object[] toArray(Object[] a) {
        throw new UnsupportedOperationException();
    }
}
