package com.geekbang.chatroom;

import com.geekbang.chatroom.server.ChatRoomServer;

import java.io.IOException;

import static com.geekbang.chatroom.common.Constants.SERVER_PORT;

public class ChatRoomServerAppMain {
    public static void main(String[] args) throws IOException {
        ChatRoomServer server = new ChatRoomServer(SERVER_PORT);
        server.start();
    }
}

/**
 * 源代码来自极客时间里的《零基础学Java》，带你零基础入门，夯实Java，欢迎订阅：https://time.geekbang.org/course/intro/181
 */
