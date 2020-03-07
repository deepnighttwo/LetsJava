package com.geekbang.learnsocket;

import java.io.IOException;
import java.net.Socket;

import static com.geekbang.learnsocket.SimpleServer.SERVER_PORT;

public class SimpleClient {
    public static void main(String[] args) throws IOException {
        commWithServer();
    }

    private static void commWithServer() throws IOException {

        try (
                // 127.0.0.1
            Socket socket = new Socket("localhost", SERVER_PORT);
        ) {
            Chat chat = new Chat("服务器端", null, socket);
            chat.chatting();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        System.out.println("程序退出！");
    }

}

/**
 * 源代码来自极客时间里的《零基础学Java》，带你零基础入门，夯实Java，欢迎订阅：https://time.geekbang.org/course/intro/181
 */
