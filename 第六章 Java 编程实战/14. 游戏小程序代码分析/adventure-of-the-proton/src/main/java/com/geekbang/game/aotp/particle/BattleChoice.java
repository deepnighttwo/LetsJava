package com.geekbang.game.aotp.particle;

public interface BattleChoice {

    boolean canEnable();

    String getChoiceId();

    String getChoiceName();

    int execute();

}
