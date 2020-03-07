package com.geekbang.game.aotp.particle;

import com.geekbang.game.aotp.item.ItemType;
import com.geekbang.game.aotp.util.OutputText;

import static com.geekbang.game.aotp.AOTPAppMain.Game;
import static com.geekbang.game.aotp.util.Constants.CAIQUAN_CHOICE;

public class CaiquanChoice implements BattleChoice {
    @Override
    public boolean canEnable() {
        // FIXME: 可能有更多的实现
        return Game.getTheProton().getInventory().has(ItemType.Entanglement);
    }

    @Override
    public String getChoiceId() {
        return CAIQUAN_CHOICE;
    }

    @Override
    public String getChoiceName() {
        return "猜量子纠缠拳";
    }

    @Override
    public int execute() {
        Game.getTheProton().getInventory().use(ItemType.Entanglement);
        Game.getIoModule().outputText(new OutputText("0，1，2代表剪刀石头布，波尔助我一臂之力，我要猜："));
        int num = Integer.parseInt(Game.getIoModule().getSingleChar());
        int enemyGuess = (int) (Game.getEnemy().getEnergy() % 3);
        // 猜拳比较
        int ret = 0;
        if (num == enemyGuess) {
            ret = 0;
        } else {
            if ((num == 1 && enemyGuess == 0)
                    || (num == 2 && enemyGuess == 1)
                    || (num == 0 && enemyGuess == 2)) {
                ret = 1;
            } else {
                ret = -1;
            }
        }
        if (ret == 1) {
            Game.getIoModule().outputText(new OutputText("量子猜拳我最棒！跟我混吧"));
            Game.getTheProton().getParticleGroup().addToGroup(Game.getEnemy());
        }
        return ret;
    }
}
