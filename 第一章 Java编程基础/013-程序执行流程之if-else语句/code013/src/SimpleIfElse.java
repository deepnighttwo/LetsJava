public class SimpleIfElse {

    public static void main(String[] args) {
        boolean condition = true;

        if (condition) {
            System.out.println("condition的值为真");
        } else {
            System.out.printf("condition的值为假");
        }

        int a = 10;
        int b = 20;
        if (a < b) {
            System.out.println("a的值为" + a + ", b的值为" + b + ". a<b是真的");
        }

        System.out.println("如论如何都会执行到");
    }

}

/**
 * 源代码来自极客时间里的《零基础学Java》，带你零基础入门，夯实Java，欢迎订阅：https://time.geekbang.org/course/intro/181
 */
