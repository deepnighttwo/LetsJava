package com.geekbang.game.aotp;

import com.geekbang.game.aotp.mainflow.MainFlowModule;
import com.geekbang.game.aotp.util.GameContext;
import com.geekbang.game.aotp.util.OutputText;

import static com.geekbang.game.aotp.util.Constants.*;

public class AOTPAppMain {

    public static final GameContext Game = new GameContext();

    public static void main(String[] args) {
        Game.createTheProton();
        Game.getIoModule().outputText(new OutputText(
                "从混沌之中，我逃了出来。不，准确的说我是来自混沌之中",
                "周围很空旷，好像只有我自己。我看不到自己，但是我能感觉到我的存在。",
                "我是谁？我身体内有一股能量，但是我是谁？是这股能量支撑了我的存在吗？我不知道. . . . . . ",
                "一股隐隐约约的力量冲了过来，现在越来越明显了",
                "我不知道它为何而来，但直觉告诉我它是冲我来的，好像没有时间瞎想了",
                "在搞清楚自己是谁之前，我得先存在下去，体内的能量好像被激发了，本能告诉我要有碰撞了！！！"
        ));

        Game.initChoiceList();

        MainFlowModule mainFlowModule = new MainFlowModule();

        mainFlowModule.start();
    }


}