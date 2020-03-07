public class CalcDivFor {
    public static void main(String[] args) {
        int divided = 100;
        int divisor = 3;

        for (int i = 0; i < 100; i++) {
            if (divided % divisor == 0) {
                System.out.println(divided + "可以整除" + divisor + "。商为" + divided / divisor);
            }
            divided++;

        }


    }
}

/**
 * 源代码来自极客时间里的《零基础学Java》，带你零基础入门，夯实Java，欢迎订阅：https://time.geekbang.org/course/intro/181
 */
