package com.geekbang.learnthrread;

public class SingleThreadSimple {
    public static void main(String[] args) {

        // TODO 对一个数据进行相同次数的加减，而且也没有溢出，最后的结果应该是0

        DataHolder dataHolder = new DataHolder();

        ChangeData increase = new ChangeData(2, Integer.MAX_VALUE, dataHolder);

        increase.run();

        ChangeData decrease = new ChangeData(-2, Integer.MAX_VALUE, dataHolder);

        decrease.run();

    }
}
