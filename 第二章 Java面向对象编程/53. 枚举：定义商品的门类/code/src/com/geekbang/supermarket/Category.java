package com.geekbang.supermarket;

// >> TODO 使用enum而非class声明
public enum Category {

    // >> TODO 必须在开始的时候以这种形式，创建所有的枚举对象
    FOOD(1),
    // >> TODO 不可以重名
//    FOOD(1),
    COOK(3),
    SNACK(5),
    CLOTHES(7),
    ELECTRIC(9);

    // 可以有属性
    private int id;

    // >> TODO 构造方法必须是private的，不写也是private的
    Category(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

//    public void setId(int id) {
//        this.id = id;
//    }


    @Override
    public String toString() {
        return "Category{" +
            "id=" + id +
            '}';
    }

}

/**
 * 源代码来自极客时间里的《零基础学Java》，带你零基础入门，夯实Java，欢迎订阅：https://time.geekbang.org/course/intro/181
 */
