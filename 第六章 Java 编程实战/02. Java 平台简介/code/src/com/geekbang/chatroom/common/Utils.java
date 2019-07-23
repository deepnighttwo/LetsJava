package com.geekbang.chatroom.common;

import static com.geekbang.chatroom.common.Constants.*;

public class Utils {

    public static String isValidUserName(String userName) {
        String ret = isValidToUserName(userName);
        if (ret != null) {
            return ret;
        }

        if (userName.toLowerCase().contains(ADMIN_NAME)) {
            return "用户名不可以包含" + ADMIN_NAME;
        }

        return null;
    }


    public static String isValidToUserName(String userName) {

        if (userName.trim().length() == 0) {
            return "用户名不可以为空";
        }
        if (userName.contains(MESSAGE_SEP_STR)) {
            return "用户名不可以包含分隔符";
        }
        if (userName.contains(CHAT_WITH_START)) {
            return "用户名不可以包含" + CHAT_WITH_START;
        }
        if (userName.toLowerCase().contains(NO_NAME)) {
            return "用户名不可以包含" + NO_NAME;
        }
        if (userName.contains(SPACE_STRING)) {
            return "用户名不可以包含空格";
        }
        return null;
    }

    public static String getNormalizedUserName(String userName) {
        return userName.trim();
    }

}
