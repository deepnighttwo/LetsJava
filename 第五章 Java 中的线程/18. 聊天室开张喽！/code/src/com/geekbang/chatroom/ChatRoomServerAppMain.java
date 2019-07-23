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
