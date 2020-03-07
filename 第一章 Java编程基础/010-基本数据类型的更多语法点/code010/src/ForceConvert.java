public class ForceConvert {
    public static void main(String[] args) {
        int intVal = 99;
        long longVal = 19999;
        intVal = (int) longVal;

        float floatVal = 11.32f;
        double doubleVal = 3344556.789;
        floatVal = (float) doubleVal;

        int a = 65;
        char b = (char) a;

    }
}

/**
 * 源代码来自极客时间里的《零基础学Java》，带你零基础入门，夯实Java，欢迎订阅：https://time.geekbang.org/course/intro/181
 */
