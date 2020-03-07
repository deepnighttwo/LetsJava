package com.geekbang.game.aotp.item;

public class RandInventoryGen implements InventoryGen {

    @Override
    public Inventory genInventory() {
        Inventory inventory = new Inventory();
        addToInventory(inventory, Energy.class, 0.85);
        addToInventory(inventory, CaiquanEntanglement.class, 0.33);
        return inventory;
    }

    private void addToInventory(Inventory inventory, Class<? extends Item> clazz, double chance) {
        if (Math.random() < chance) {
            try {
                inventory.addItem(clazz.getConstructor().newInstance());
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }


}

/**
 * 源代码来自极客时间里的《零基础学Java》，带你零基础入门，夯实Java，欢迎订阅：https://time.geekbang.org/course/intro/181
 */
