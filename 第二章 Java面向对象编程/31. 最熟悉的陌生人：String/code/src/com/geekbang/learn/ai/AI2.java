package com.geekbang.learn.ai;

public class AI2 {

    public String answer(String question) {

        String ret = null;

        ret = handleCanStart(question);

        if (ret != null) {
            return ret;
        }

        ret = handleAskTail(question);

        if (ret != null) {
            return ret;
        }

        return handleUnknown(question);

    }

    private String handleCanStart(String question) {
        String[] canStart = new String[]{"会", "能", "有", "敢", "在"};
        for (int i = 0; i < canStart.length; i++) {
            if (question.startsWith(canStart[i])) {
                return canStart[i] + "！";
            }
        }
        return null;
    }

    private String handleAskTail(String question) {
        String[] askTail = new String[]{"吗？", "吗?", "吗"};
        for (int i = 0; i < askTail.length; i++) {
            if (question.endsWith(askTail[i])) {
                return question.replace(askTail[i], "！");
            }
        }
        return null;
    }

    private String handleUnknown(String question) {
        return question + "!";
    }

}
