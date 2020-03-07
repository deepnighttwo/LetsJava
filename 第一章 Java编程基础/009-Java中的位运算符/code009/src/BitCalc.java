public class BitCalc {
    public static void main(String[] args) {
        int a = 0xF8;
        int b = 0xF4;
        int c = 0xFF;
        System.out.println(a & b);
        System.out.println(a | b);
        System.out.println(a ^ b);

        System.out.println(~c);
    }
}

/**
 * 源代码来自极客时间里的《零基础学Java》，带你零基础入门，夯实Java，欢迎订阅：https://time.geekbang.org/course/intro/181
 */
