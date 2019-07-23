package com.geekbang.game.aotp.util;

import java.util.concurrent.TimeUnit;

public interface Constants {

    String BATTLE_STATUS = "battle";
    String WALK_STATUS = "walk";

    String LEFT = "A";
    String RIGHT = "D";
    String FORWARD = "W";

    String INVENTORY = "S";
    String GROUP = "E";

    String COLLISION_CHOICE = "1";
    String CAIQUAN_CHOICE = "2";

    String LESS_ENERGY = "要死要死要死，这枚粒子能量好像比我大，好怕怎么办？";
    String MORE_OR_EQUAL_ENERGY = "这枚粒子好像没有我的能量多嘛～哈哈哈哈哈嗝，这是送粒子头来了";

    long SLOW_INTERVAL = TimeUnit.SECONDS.toMillis(800);

    long NORMAL_INTERVAL = TimeUnit.MILLISECONDS.toMillis(50);

    long QUICK_INTERVAL = TimeUnit.MILLISECONDS.toMillis(20);

    String ACTION_CHOICE = "我要";

    String LINE = "\n";
}
