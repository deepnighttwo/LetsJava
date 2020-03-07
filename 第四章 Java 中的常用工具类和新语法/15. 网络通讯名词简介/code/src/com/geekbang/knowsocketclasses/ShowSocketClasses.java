package com.geekbang.knowsocketclasses;

import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.UnknownHostException;

public class ShowSocketClasses {
    public static void main(String[] args) throws UnknownHostException {
        ServerSocket ss = null;
        Socket s;
        InetAddress address = InetAddress.getByName("www.geekbang.com");
        System.out.println(address);
    }
}

/**
 * 源代码来自极客时间里的《零基础学Java》，带你零基础入门，夯实Java，欢迎订阅：https://time.geekbang.org/course/intro/181
 */
