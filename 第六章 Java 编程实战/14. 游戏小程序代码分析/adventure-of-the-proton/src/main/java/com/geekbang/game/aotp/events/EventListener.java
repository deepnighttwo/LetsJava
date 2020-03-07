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

/**
 * 源代码来自极客时间里的《零基础学Java》，带你零基础入门，夯实Java，欢迎订阅：https://time.geekbang.org/course/intro/181
 */
