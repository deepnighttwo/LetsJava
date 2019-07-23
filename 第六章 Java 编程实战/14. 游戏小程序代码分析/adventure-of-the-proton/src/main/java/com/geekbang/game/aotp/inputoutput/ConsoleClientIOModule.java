package com.geekbang.game.aotp.inputoutput;

import com.geekbang.game.aotp.util.OutputText;
import org.apache.commons.lang3.StringUtils;

import java.util.Scanner;

import static com.geekbang.game.aotp.util.Utils.sleepMS;

public class ConsoleClientIOModule implements ClientIOModule {

    private Scanner input = new Scanner(System.in);


    @Override
    public String getSingleChar() {
        return getLine().substring(0, 1).toUpperCase();
    }

    @Override
    public String getSingleCharWithDefault(String defaultVal) {
        while (true) {
            String line = StringUtils.trim(input.nextLine() + defaultVal);
            if (StringUtils.isEmpty(line)) {
                continue;
            }
            return line.substring(0, 1).toUpperCase();
        }
    }

    @Override
    public String getLine() {
        while (true) {
            String line = StringUtils.trim(input.nextLine());
            if (StringUtils.isEmpty(line)) {
                continue;
            }
            return line;
        }
    }

    @Override
    public void outputText(OutputText outputText) {
        for (String line : outputText.getTextLines()) {
            for (char ch : line.toCharArray()) {
                sleepMS(outputText.getInterval());
                System.out.print(ch);
            }
            sleepMS(outputText.getInterval());
            System.out.println();
        }
    }


}
