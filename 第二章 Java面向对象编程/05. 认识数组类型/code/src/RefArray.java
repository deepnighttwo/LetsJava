public class RefArray {

    public static void main(String[] args) {
        Merchandise[] merchandises = new Merchandise[9];
        merchandises[0] = new Merchandise();
        merchandises[1] = new Merchandise();
        merchandises[0].name = "笔记本";
        System.out.println(merchandises[0].name);

        System.out.println(merchandises[2]);
    }
}

/**
 * 源代码来自极客时间里的《零基础学Java》，带你零基础入门，夯实Java，欢迎订阅：https://time.geekbang.org/course/intro/181
 */
