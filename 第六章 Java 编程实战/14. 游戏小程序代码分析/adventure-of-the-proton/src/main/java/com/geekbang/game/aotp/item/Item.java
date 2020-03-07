package com.geekbang.game.aotp.item;

import java.util.HashMap;
import java.util.Map;

public abstract class Item {

    private ItemType itemType;

    // 方便扩展，可以使用other作为itemType，然后用itemId区分不同的item类型
    private String itemId;

    private Map<String, Object> properties = new HashMap<>();

    public Item(ItemType itemType) {
        this.itemType = itemType;
    }

    public ItemType getItemType() {
        return itemType;
    }

    public void setItemType(ItemType itemType) {
        this.itemType = itemType;
    }

    public String getItemId() {
        return itemId;
    }

    public void setItemId(String itemId) {
        this.itemId = itemId;
    }

    public Map<String, Object> getProperties() {
        return properties;
    }

    public void setProperties(Map<String, Object> properties) {
        this.properties = properties;
    }


    public void addPropertyByKey(String key, Object value) {
        properties.put(key, value);
    }

    @SuppressWarnings("unchecked")
    public <T> T getPropertyByKey(String key) {
        return (T) properties.get(key);
    }

}
