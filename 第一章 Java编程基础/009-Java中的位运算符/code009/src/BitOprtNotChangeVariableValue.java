public class BitOprtNotChangeVariableValue {
    public static void main(String[] args) {
        int a = 0x400;
        int b = 0xF4;
        int c = 0xFF;

        System.out.println(a >> 2);
        System.out.println(~a);
        System.out.println(a | 0x8);

        System.out.println(a);

    }
}

/**
 * 源代码来自极客时间里的《零基础学Java》，带你零基础入门，夯实Java，欢迎订阅：https://time.geekbang.org/course/intro/181
 */
