package com.geekbang.chatroom.common;

import java.io.*;
import java.net.Socket;

import static com.geekbang.chatroom.common.Constants.DEFAULT_CHARSET;

// TODO 增加心跳功能，server和client互相发送心跳消息，过一段时间不发送，则认为网络连接已经断开，释放资源，更新在线用户
public class DataExchange {

    private Socket socket;

    private BufferedReader reader;

    private PrintWriter writer;

    private boolean isClosed = false;

    public DataExchange(Socket socket) throws IOException {
        this.socket = socket;
        init(socket);
    }

    private void init(Socket socket) throws IOException {
        reader = new BufferedReader(new InputStreamReader(socket.getInputStream(), DEFAULT_CHARSET));
        writer = new PrintWriter(new OutputStreamWriter(socket.getOutputStream(), DEFAULT_CHARSET));
    }

    public void send(ChatMessage chatMessage) {
        writer.println(chatMessage.toMessageString());
        writer.flush();
    }

    public ChatMessage receive() throws IOException {
        String line = null;
        while (true) {
            line = reader.readLine();
            if (line != null && line.length() > 0) {
                break;
            }
        }
        return ChatMessage.buildFrom(line);
    }

    public void close() {
        try {
            reader.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        try {
            writer.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        try {
            socket.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        isClosed = true;
    }


}
