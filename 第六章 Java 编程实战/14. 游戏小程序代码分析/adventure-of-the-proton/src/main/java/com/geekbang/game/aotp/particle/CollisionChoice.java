package com.geekbang.game.aotp.particle;

import com.geekbang.game.aotp.item.Inventory;
import com.geekbang.game.aotp.util.OutputText;

import static com.geekbang.game.aotp.AOTPAppMain.Game;
import static com.geekbang.game.aotp.item.Inventory.EMPTY_INVENTORY;
import static com.geekbang.game.aotp.util.Constants.COLLISION_CHOICE;
import static com.geekbang.game.aotp.util.Constants.LINE;

public class CollisionChoice implements BattleChoice {

    @Override
    public boolean canEnable() {
        return true;
    }

    @Override
    public String getChoiceId() {
        return COLLISION_CHOICE;
    }

    @Override
    public String getChoiceName() {
        return "粒子撞击";
    }


    @Override
    public int execute() {

        Particle enemy = Game.getEnemy();
        Particle theProton = Game.getTheProton();

        if (enemy.getEnergy() == theProton.getEnergy()) {
            return 0;
        } else if (enemy.getEnergy() < theProton.getEnergy()) {
            return 1;
        } else if (enemy.getEnergy() > theProton.getEnergy()) {
            return -1;
        }

        return 1;
    }
}
