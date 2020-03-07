public class OneStatementIfEles {
    public static void main(String[] args) {

        int a = 10;

        System.out.println("省略大括号");
        if (a > 0)
            System.out.println("a大于0");
        else
            System.out.printf("a小于等于0");

        System.out.println("比较大小的完整的写法");
        if (a > 0) {
            System.out.println("a大于0");
        } else {
            if (a == 0) {
                System.out.println("a等于0");
            } else {
                System.out.println("a小于0");
            }
        }

        System.out.println("比较大小的省略所有大括号的方法");
        if (a > 0)
            System.out.println("a大于0");
        else if (a == 0)
            System.out.println("a等于0");
        else
            System.out.println("a小于0");


        System.out.println("比较大小的代码块有多个语句的最优写法");
        if (a > 0) {
            System.out.println("a大于0");
            System.out.printf("买" + a + "个肉包子");
        } else if (a == 0) {
            System.out.println("a等于0");
            System.out.printf("不买肉包子了！");
        } else {
            System.out.println("a小于0");
            System.out.println("肉包子吃多了！");
        }
    }
}

/**
 * 源代码来自极客时间里的《零基础学Java》，带你零基础入门，夯实Java，欢迎订阅：https://time.geekbang.org/course/intro/181
 */
