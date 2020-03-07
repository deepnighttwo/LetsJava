public class ForceConvertValueLoss {
    public static void main(String[] args) {
        int intVal = 99;
        long longVal = 5555555555555L;
        intVal = (int) longVal;
        System.out.println(intVal);

        float floatVal = 11.32f;
        double doubleVal = 1234567890.123456;
        floatVal = (float) doubleVal;
        System.out.println(floatVal);
        System.out.println(doubleVal);


    }
}

/**
 * 源代码来自极客时间里的《零基础学Java》，带你零基础入门，夯实Java，欢迎订阅：https://time.geekbang.org/course/intro/181
 */
