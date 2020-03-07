package com.geekbang.game.aotp.events;

import java.util.HashMap;
import java.util.Map;

public class Event {

    // 战队状态还是行走状态
    private String status;
    // 在哪个操作面板
    private String operationPanel;
    // 时间源
    private String source;
    // 事件类型
    private String eventType;
    // 事件的值
    private Object value;
    // 标记事件是否被处理过了
    private boolean handled;
    // 事件发生的时间
    private Long time = System.currentTimeMillis();

    private Map<String, Object> properties = new HashMap<>();

    public Event(String status, String operationPanel, String source, String eventType, Object value) {
        this.status = status;
        this.operationPanel = operationPanel;
        this.source = source;
        this.eventType = eventType;
        this.value = value;
    }

    public void addPropertyByKey(String key, Object value) {
        properties.put(key, value);
    }

    @SuppressWarnings("unchecked")
    public <T> T getPropertyByKey(String key) {
        return (T) properties.get(key);
    }

    public String getOperationPanel() {
        return operationPanel;
    }

    public void setOperationPanel(String operationPanel) {
        this.operationPanel = operationPanel;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public String getEventType() {
        return eventType;
    }

    public void setEventType(String eventType) {
        this.eventType = eventType;
    }

    public Long getTime() {
        return time;
    }

    public void setTime(Long time) {
        this.time = time;
    }

    public Map<String, Object> getProperties() {
        return properties;
    }

    public void setProperties(Map<String, Object> properties) {
        this.properties = properties;
    }

    public Object getValue() {
        return value;
    }

    public void setValue(Object value) {
        this.value = value;
    }

    public boolean isHandled() {
        return handled;
    }

    public void setHandled(boolean handled) {
        this.handled = handled;
    }
}
