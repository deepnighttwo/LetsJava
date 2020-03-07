package com.geekbang.game.aotp.events;

import com.geekbang.game.aotp.util.GameContext;

public interface EventListener {

    /**
     * @param context game context
     * @param event   触发的事件
     * @return 如果返回true则继续调用别的listener，如果返回false则不再调用别的listener
     */
    boolean processEvent(GameContext context, Event event);

    /**
     * 事件监听器的优先级
     *
     * @return 越大优先级越高
     */
    int getPriority();

}
