import java.util.Scanner;

public class UseVariable {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int a;
        System.out.println("创建了变量a，输入一个整数：");
        a = in.nextInt();
        System.out.println("给a赋值，a的值为" + a+"，请再次输入一个整数：");

        a = in.nextInt();
        System.out.println("再次给赋值，现在a的值为" + a);
    }
}

/**
 * 源代码来自极客时间里的《零基础学Java》，带你零基础入门，夯实Java，欢迎订阅：https://time.geekbang.org/course/intro/181
 */
