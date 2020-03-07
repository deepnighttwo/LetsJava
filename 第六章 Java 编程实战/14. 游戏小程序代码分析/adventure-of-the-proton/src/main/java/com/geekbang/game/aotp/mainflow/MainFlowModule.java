package com.geekbang.game.aotp.mainflow;

import com.geekbang.game.aotp.item.Inventory;
import com.geekbang.game.aotp.particle.BattleChoice;
import com.geekbang.game.aotp.particle.Particle;
import com.geekbang.game.aotp.particle.ParticleType;
import com.geekbang.game.aotp.util.OutputText;

import java.util.List;

import static com.geekbang.game.aotp.AOTPAppMain.Game;
import static com.geekbang.game.aotp.item.Inventory.EMPTY_INVENTORY;
import static com.geekbang.game.aotp.util.Constants.*;

public class MainFlowModule {

    public void start() {
        battle();
        while (true) {
            Game.getIoModule().outputText(new OutputText("输入" + INVENTORY + "查看物品信息。输入" + GROUP + "查看粒子信息。" +
                    "输入分别向ADW向左右前进发"));
            String input = Game.getIoModule().getSingleChar();
            if (input.equalsIgnoreCase(LEFT) || input.equalsIgnoreCase(RIGHT) || input.equalsIgnoreCase(FORWARD)) {
                battle();
            } else if (input.equalsIgnoreCase(GROUP)) {
                checkGroup();
            } else if (input.equalsIgnoreCase(INVENTORY)) {
                checkInventory();
            }
        }
    }

    public void battle() {
        Particle enemy = new Particle(ParticleType.randType());
        Game.setEnemy(enemy);
        Particle theProton = Game.getTheProton();
        if (enemy.getEnergy() > theProton.getEnergy()) {
            Game.getIoModule().outputText(new OutputText(LESS_ENERGY));
        } else {
            Game.getIoModule().outputText(new OutputText(MORE_OR_EQUAL_ENERGY));
        }

        StringBuilder choice = new StringBuilder();
        List<BattleChoice> choiceList = Game.getTheProton().getChoiceForBattle();
        for (BattleChoice c : Game.getTheProton().getChoiceForBattle()) {
            choice.append(c.getChoiceId()).append(":").append(c.getChoiceName()).append(LINE);
        }
        choice.deleteCharAt(choice.length() - 1);
        Game.getIoModule().outputText(new OutputText(choice.toString()));

        String chooseId = Game.getIoModule().getSingleChar();

        for (BattleChoice c : choiceList) {
            if (c.getChoiceId().equalsIgnoreCase(chooseId)) {
                int won = c.execute();
                if (won > 0) {
                    Inventory enemyInventory = enemy.getInventory();
                    StringBuilder sb = new StringBuilder("赢了，获得如下物品：");
                    sb.append(LINE);
                    sb.append(enemyInventory.describeInventory());
                    theProton.getInventory().addInventory(enemyInventory);
                    Game.getIoModule().outputText(new OutputText(sb.toString()));
                } else if (won < 0) {
                    long lostEnergy = (long) (theProton.getEnergy() * 0.5 * (1 - 1.0 * theProton.getEnergy() / enemy.getEnergy()));
                    long leftEnergy = theProton.getEnergy() - lostEnergy;
                    theProton.setEnergy(leftEnergy);
                    String battleReport = "损失能量" + lostEnergy + "剩余能量为" + leftEnergy + "。失去所有物品......";
                    Game.getIoModule().outputText(new OutputText(battleReport));
                    enemy.setInventory(EMPTY_INVENTORY);
                } else {
                    Game.getIoModule().outputText(new OutputText("嗖嗖嗖，擦身而过"));
                }
                break;
            }
        }

    }

    public void checkInventory() {
        Game.getIoModule().outputText(new OutputText(Game.getTheProton().getInventory().describeInventory()));

    }

    public void checkGroup() {
        Game.getIoModule().outputText(new OutputText(Game.getTheProton().getParticleGroup().describeGroup()));

    }

}
