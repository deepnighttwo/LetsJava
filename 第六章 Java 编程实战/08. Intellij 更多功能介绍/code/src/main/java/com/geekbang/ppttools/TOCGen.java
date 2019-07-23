package com.geekbang.ppttools;

import com.geekbang.ppttools2.PPTXUtils123;

import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.nio.charset.StandardCharsets;

public class TOCGen {
    public static void main(String[] args) throws Exception {

        String toc = genTocFromPPTX("/Users/geektime/Downloads/javaforgeek-master/Part6/08. Intellij 更多功能介绍/code/src/main/resources/ppts");

        PrintWriter pw = new PrintWriter(new OutputStreamWriter(new FileOutputStream("toc.md"), StandardCharsets.UTF_8));

        pw.println(toc);
        pw.flush();
        pw.close();
    }

    private static String genTocFromPPTX(String s) throws Exception {
        File rootDir = new File(s);
        StringBuilder ret = new StringBuilder("# 0.自我介绍\n\n");
        for (File pptx : rootDir.listFiles()) {
            if (isThePPT(pptx)) {
                ret.append('\n').append(PPTXUtils123.getToc(pptx)).append('\n');
            }
        }

        return ret.toString();
    }

    public static boolean isThePPT(File pptx) {
        String pptxName = pptx.getName();
        if (!pptxName.endsWith("pptx")) {
            return false;
        }
        for (char ch : pptxName.substring(0, pptxName.indexOf('.')).toCharArray()) {
            if (!Character.isDigit(ch)) {
                return false;
            }
        }
        return true;
    }
}
