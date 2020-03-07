package com.geekbang.game.aotp.item;

import com.geekbang.game.aotp.util.Constants;
import org.apache.commons.collections.CollectionUtils;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Inventory {

    public static final Inventory EMPTY_INVENTORY = new Inventory();

    private Map<ItemType, List<Item>> items = new HashMap<>();

    public void addItem(Item item) {
        items.computeIfAbsent(item.getItemType(), (k) -> new ArrayList<>())
                .add(item);
    }

    public boolean has(ItemType itemType) {
        return CollectionUtils.isNotEmpty(items.get(itemType));
    }

    public void use(ItemType itemType) {
        if (has(itemType)) {
            items.get(itemType).remove(0);
        }
    }

    public String describeInventory() {
        StringBuilder ret = new StringBuilder();
        for (Map.Entry<ItemType, List<Item>> entry : items.entrySet()) {
            ret.append(entry.getKey()).append(":").append(entry.getValue().size()).append(Constants.LINE);
        }
        return ret.toString();
    }

    public void addInventory(Inventory inventory) {
        inventory.items.keySet().forEach(itemType ->
                items.compute(itemType, (k, v) -> {
                    if (v == null) {
                        return inventory.items.get(itemType);
                    } else {
                        v.addAll(inventory.items.get(itemType));
                        return v;
                    }
                }));
    }


}
