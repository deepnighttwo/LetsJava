package com.geekbang.learnsocket.writeit;

import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;

import static com.geekbang.learnsocket.writeit.MyServer.MY_SERVER_PORT;

public class MyClient {
    public static void main(String[] args) {
        commWithServer();
    }

    private static void commWithServer() {
        try (
                Socket s = new Socket("localhost", MY_SERVER_PORT);
        ) {
//            System.out.println("客户端连接到：" + s.getRemoteSocketAddress());
            MyChat myChat = new MyChat("服务器端", null, s);
            myChat.chatting();
        } catch (UnknownHostException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

/**
 * 源代码来自极客时间里的《零基础学Java》，带你零基础入门，夯实Java，欢迎订阅：https://time.geekbang.org/course/intro/181
 */
