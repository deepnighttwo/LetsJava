package com.geekbang.game.aotp.inputoutput;

import com.geekbang.game.aotp.util.OutputText;

public interface ClientIOModule {
    String getSingleChar();

    String getSingleCharWithDefault(String defaultVal);

    String getLine();

    void outputText(OutputText outputText);
}

/**
 * 源代码来自极客时间里的《零基础学Java》，带你零基础入门，夯实Java，欢迎订阅：https://time.geekbang.org/course/intro/181
 */
