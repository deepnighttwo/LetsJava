package com.geekbang.chatroom.server;

public interface ServerCommand {

    String commandName();

    String process(ChatRoomServer chatRoomServer) throws Exception;

}



