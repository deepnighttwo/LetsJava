package com.geekbang.chatroom;

import com.geekbang.chatroom.client.ChatRoomClient;

import java.io.IOException;

public class ChatRoomClientAppMain {
    public static void main(String[] args) throws IOException {
        String server = args[0];
        ChatRoomClient client = new ChatRoomClient(server);
        client.start();
    }
}

/**
 * 源代码来自极客时间里的《零基础学Java》，带你零基础入门，夯实Java，欢迎订阅：https://time.geekbang.org/course/intro/181
 */
