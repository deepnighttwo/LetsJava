public class StringVariable {
    public static void main(String[] args) {
        int a = 10;
        String str = "a的值是";
        str = str + a;
        System.out.println(str);

        String s2 = "a的值是";
        System.out.println(str + a);
        System.out.println(s2);
    }
}

/**
 * 源代码来自极客时间里的《零基础学Java》，带你零基础入门，夯实Java，欢迎订阅：https://time.geekbang.org/course/intro/181
 */
