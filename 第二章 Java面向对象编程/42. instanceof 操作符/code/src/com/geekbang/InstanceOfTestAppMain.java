package com.geekbang;

import com.geekbang.supermarket.LittleSuperMarket;
import com.geekbang.supermarket.MerchandiseV2;
import com.geekbang.supermarket.Phone;
import com.geekbang.supermarket.ShellColorChangePhone;

public class InstanceOfTestAppMain {
    public static void main(String[] args) {
        int merchandiseCount = 600;
        LittleSuperMarket superMarket = new LittleSuperMarket("大卖场",
            "世纪大道1号", 500, merchandiseCount, 100);

        // >> TODO instanceof 操作符，可以判断一个引用指向的对象是否是某一个类型或者其子类
        //    TODO 是则返回true，否则返回false
        for(int i =0;i<merchandiseCount;i++){
            MerchandiseV2 m = null;// superMarket.getMerchandiseOf(i);
            if(m instanceof MerchandiseV2){
                // TODO 先判断，再强制类型转换，比较安全
                MerchandiseV2 ph = (MerchandiseV2)m;
                System.out.println(ph.getName());
            }else {
                System.out.println("not an instance");
            }
        }

        // >> TODO 如果引用是null，则肯定返回false


    }
}
