package com.geekbang.game.aotp.inputoutput;

import com.geekbang.game.aotp.util.OutputText;

public interface ClientIOModule {
    String getSingleChar();

    String getSingleCharWithDefault(String defaultVal);

    String getLine();

    void outputText(OutputText outputText);
}
