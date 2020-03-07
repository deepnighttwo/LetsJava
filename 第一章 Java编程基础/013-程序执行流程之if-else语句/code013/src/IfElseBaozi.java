public class IfElseBaozi {
    public static void main(String[] args) {
        int baozi = 3;

        boolean baoziGangchuLong = true;

        if (baoziGangchuLong) {
            baozi = baozi + 2;
            System.out.println("包子刚刚出笼，买了" + baozi + "个肉包子");
        } else {
            System.out.println("买了" + baozi + "个肉包子");
        }
    }
}

/**
 * 源代码来自极客时间里的《零基础学Java》，带你零基础入门，夯实Java，欢迎订阅：https://time.geekbang.org/course/intro/181
 */
