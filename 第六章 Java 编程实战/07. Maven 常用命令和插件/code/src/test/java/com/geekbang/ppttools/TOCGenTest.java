package com.geekbang.ppttools;


import org.junit.Assert;
import org.junit.Test;

import java.io.File;

public class TOCGenTest {

    @Test
    public void isThePPTNotPPTFile() {
        boolean ret = TOCGen.isThePPT(new File("noitppt"));
        Assert.assertFalse(ret);
    }

    @Test
    public void isThePPTIsPPTFile() {
        boolean ret = TOCGen.isThePPT(new File("001.pptx"));
        Assert.assertTrue(ret);
    }
}
/**
 * 源代码来自极客时间里的《零基础学Java》，带你零基础入门，夯实Java，欢迎订阅：https://time.geekbang.org/course/intro/181
 */
