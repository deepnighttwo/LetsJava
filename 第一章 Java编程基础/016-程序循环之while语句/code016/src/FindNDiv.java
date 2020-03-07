public class FindNDiv {
    public static void main(String[] args) {
        int n = 10;

        int dividend = 100;
        int divisor = 89;

        int found = 0;
        while (found < n) {
            if (dividend % divisor == 0) {
                System.out.println(dividend + "可以整除" + divisor + "。商是" + dividend / divisor);
                found++;
            }
            dividend++;
        }

    }
}

/**
 * 源代码来自极客时间里的《零基础学Java》，带你零基础入门，夯实Java，欢迎订阅：https://time.geekbang.org/course/intro/181
 */
