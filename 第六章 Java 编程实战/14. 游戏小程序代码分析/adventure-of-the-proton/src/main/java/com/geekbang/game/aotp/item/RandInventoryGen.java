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
