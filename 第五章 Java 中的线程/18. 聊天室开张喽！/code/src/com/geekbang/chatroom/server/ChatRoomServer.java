package com.geekbang.chatroom.server;

import com.geekbang.chatroom.common.ChatMessage;
import com.geekbang.chatroom.common.DataExchange;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import static com.geekbang.chatroom.common.Constants.*;
import static com.geekbang.chatroom.common.Utils.isValidUserName;

public class ChatRoomServer {

    private int port;

    private Map<String, DataExchange> name2DataEx = new ConcurrentHashMap<>();

    private ExecutorService service = Executors.newCachedThreadPool();

    public ChatRoomServer(int port) {
        this.port = port;
    }

    public void start() throws IOException {
        System.out.println("服务器已启动");
        ServerSocket ss = new ServerSocket(SERVER_PORT);
        while (true) {
            Socket socket = ss.accept();
            handleClientSocket(socket);
        }
    }

    private void handleClientSocket(Socket socket) {
        service.submit(new ClientHandler(socket));
    }

    class ClientHandler implements Runnable {

        private Socket socket;

        private String userName = null;

        public ClientHandler(Socket socket) {
            this.socket = socket;
        }

        @Override
        public void run() {
            System.out.println("处理来自" + socket.getRemoteSocketAddress() + "的连接");
            DataExchange dataExchange = null;
            try {
                dataExchange = new DataExchange(socket);
            } catch (IOException e) {
                e.printStackTrace();
                return;
            }

            initUser(dataExchange);

            while (true) {
                try {
                    ChatMessage chatMessage = dataExchange.receive();
                    String toName = chatMessage.getTo();
                    if (toName.equalsIgnoreCase(ADMIN_NAME)) {
                        handleServerCommand(chatMessage);
                    } else {
                        handleChatMessage(dataExchange, chatMessage, toName);
                    }
                } catch (IOException e) {
                    name2DataEx.remove(userName).close();
                    e.printStackTrace();
                    return;
                }
            }
        }

        private void handleChatMessage(DataExchange dataExchange, ChatMessage chatMessage, String toName) {
            DataExchange toEx = name2DataEx.get(toName);
            if (toEx == null) {
                dataExchange.send(new ChatMessage(ADMIN_NAME, chatMessage.getFrom(), "用户名\"" + toName + "\"不存在"));
            } else {
                toEx.send(chatMessage);
            }
        }

        private void handleServerCommand(ChatMessage chatMessage) {
            DataExchange from = name2DataEx.get(chatMessage.getFrom());
            String command = chatMessage.getMessage();

            if (command.equalsIgnoreCase(SERVER_COMMAND_LOGOFF)) {
                from.send(new ChatMessage(ADMIN_NAME, chatMessage.getFrom(), BYE));
                from.close();
                name2DataEx.remove(userName).close();
                System.out.println("用户\"" + chatMessage.getFrom() + "\"离开聊天室");
            } else if (command.equalsIgnoreCase(SERVER_COMMAND_LIST)) {
                String allNames = getAllNames();
                from.send(new ChatMessage(ADMIN_NAME, chatMessage.getFrom(), "所有在线用户：" + allNames));
            }
        }

        private String getAllNames() {
            String userNameListSep = ", ";
            if (name2DataEx.isEmpty()) {
                return CHAT_WITH_START + ADMIN_NAME;
            } else {
                return CHAT_WITH_START + ADMIN_NAME + userNameListSep + CHAT_WITH_START
                    + String.join(userNameListSep + CHAT_WITH_START, name2DataEx.keySet());
            }
        }

        private void initUser(DataExchange dataExchange) {
            String errorMsg = null;
            while (true) {
                String allNames = getAllNames();
                dataExchange.send(new ChatMessage(ADMIN_NAME, NO_NAME,
                    (errorMsg == null ? "" : "用户名非法，错误信息为：" + errorMsg + ":") +
                        "现有的用户名有：" + allNames
                        + "。请输入你的用户名："));

                try {
                    ChatMessage chatMessage = dataExchange.receive();
                    String userName = chatMessage.getMessage();
                    errorMsg = isValidUserName(userName);
                    if (errorMsg == null && (!name2DataEx.containsKey(userName))) {
                        this.userName = userName;
                        name2DataEx.put(userName, dataExchange);
                        dataExchange.send(new ChatMessage(ADMIN_NAME, userName, USER_NAME_PASS));
                        dataExchange.send(new ChatMessage(ADMIN_NAME, userName, COMMAND_INTRODUCTION));
                        return;
                    }
                } catch (IOException e) {
                    e.printStackTrace();
                    dataExchange.close();
                    return;
                }
            }
        }
    }

}
