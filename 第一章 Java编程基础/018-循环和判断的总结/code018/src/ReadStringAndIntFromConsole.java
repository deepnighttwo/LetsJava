import java.util.Scanner;

public class ReadStringAndIntFromConsole {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("请问你的名字是？");

        String str = in.nextLine();

        System.out.println(str + "，你好。");

        System.out.println("请问你几岁了？");

        int age = in.nextInt();

        System.out.println("好的，" + str + age + "岁了。");

    }
}

/**
 * 源代码来自极客时间里的《零基础学Java》，带你零基础入门，夯实Java，欢迎订阅：https://time.geekbang.org/course/intro/181
 */
