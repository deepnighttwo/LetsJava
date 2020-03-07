public class Variable1 {
    public static void main(String[] args) {
        int a = 1;
        int b = 2;
        int c = 3;

        int x = 0;

        int y = a * x + b * (x * x) + c * (x * x * x);

        System.out.println(y);
    }
}

/**
 * 源代码来自极客时间里的《零基础学Java》，带你零基础入门，夯实Java，欢迎订阅：https://time.geekbang.org/course/intro/181
 */
