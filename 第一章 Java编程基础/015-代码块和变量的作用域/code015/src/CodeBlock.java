public class CodeBlock {
    public static void main(String[] args) {
        int outer = 100;

        {
            int inner = 10;
            System.out.println("outer变量的值是" + outer + "。inner变量的值是" + inner + "。");
        }

        int a1 = 1;
        {
            int a2 = a1 + 1;
            {
                int a3 = a2 + 1;
            }
            {
                int a3 = a2 + 10;
            }
            System.out.println(a2);
        }
    }
}

/**
 * 源代码来自极客时间里的《零基础学Java》，带你零基础入门，夯实Java，欢迎订阅：https://time.geekbang.org/course/intro/181
 */
