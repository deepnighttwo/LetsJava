package com.geekbang.game.aotp.util;

import com.geekbang.game.aotp.inputoutput.ClientIOModule;
import com.geekbang.game.aotp.inputoutput.ConsoleClientIOModule;
import com.geekbang.game.aotp.item.CaiquanEntanglement;
import com.geekbang.game.aotp.item.Energy;
import com.geekbang.game.aotp.item.InventoryGen;
import com.geekbang.game.aotp.item.RandInventoryGen;
import com.geekbang.game.aotp.particle.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static com.geekbang.game.aotp.util.Constants.BATTLE_STATUS;
import static com.geekbang.game.aotp.util.Constants.WALK_STATUS;

public class GameContext {

    private List<BattleChoice> choiceList = new ArrayList<>();

    private String currentStatus;

    private String currentPanel;

    private ClientIOModule ioModule = new ConsoleClientIOModule();

    private Particle theProton;

    private Particle enemy;

    private Map<String, Object> properties = new HashMap<>();

    private InventoryGen inventoryGen = new RandInventoryGen();

    public void initChoiceList(){
        choiceList.add(new CollisionChoice());
        choiceList.add(new CaiquanChoice());
    }

    public void createTheProton() {
        theProton = new Particle(ParticleType.Photon, ParticleType.Photon.getMaxEnergy());
        theProton.getInventory().addItem(new Energy());
        theProton.getInventory().addItem(new Energy());
        theProton.getInventory().addItem(new Energy());
        theProton.getInventory().addItem(new CaiquanEntanglement());
        theProton.getInventory().addItem(new CaiquanEntanglement());
        theProton.getInventory().addItem(new CaiquanEntanglement());
        theProton.setParticleGroup(new ParticleGroup());
    }

    public void addPropertyByKey(String key, Object value) {
        properties.put(key, value);
    }

    @SuppressWarnings("unchecked")
    public <T> T getPropertyByKey(String key) {
        return (T) properties.get(key);
    }


    public String getCurrentStatus() {
        return currentStatus;
    }

    public void setCurrentStatus(String currentStatus) {
        this.currentStatus = currentStatus;
    }

    public String getCurrentPanel() {
        return currentPanel;
    }

    public void setCurrentPanel(String currentPanel) {
        this.currentPanel = currentPanel;
    }

    public ClientIOModule getIoModule() {
        return ioModule;
    }

    public void setIoModule(ClientIOModule ioModule) {
        this.ioModule = ioModule;
    }

    public Particle getTheProton() {
        return theProton;
    }

    public void setTheProton(Particle theProton) {
        this.theProton = theProton;
    }

    public Map<String, Object> getProperties() {
        return properties;
    }

    public void setProperties(Map<String, Object> properties) {
        this.properties = properties;
    }

    public InventoryGen getInventoryGen() {
        return inventoryGen;
    }

    public void setInventoryGen(InventoryGen inventoryGen) {
        this.inventoryGen = inventoryGen;
    }

    public Particle getEnemy() {
        return enemy;
    }

    public void setEnemy(Particle enemy) {
        this.currentStatus = BATTLE_STATUS;
        this.enemy = enemy;
    }

    private void clearEnemy() {
        this.currentStatus = WALK_STATUS;
        this.enemy = null;
    }

    public List<BattleChoice> getChoiceList() {
        return choiceList;
    }

    public void setChoiceList(List<BattleChoice> choiceList) {
        this.choiceList = choiceList;
    }
}
