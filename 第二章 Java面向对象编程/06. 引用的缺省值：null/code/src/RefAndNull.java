public class RefAndNull {
    public static void main(String[] args) {
        // 数组在创建出来之后，会按照类型给数组中的每个元素赋缺省值。
        // 引用类型的缺省值是null
        Merchandise[] merchandises = new Merchandise[9];
        // 给索引为偶数的引用赋值
        for (int i = 0; i < merchandises.length; i++) {
            if (i % 2 == 0) {
                merchandises[i] = new Merchandise();
            }
        }
        // 依次输出数组的值
        for (int i = 0; i < merchandises.length; i++) {
            System.out.println(merchandises[i]);
        }

        for (int i = 0; i < merchandises.length; i++) {
            if (i % 2 == 0) {
                Merchandise m = merchandises[i];
                System.out.println(m.price);
                System.out.println(m.count);
                System.out.println(m.name);
                System.out.println(m.id);
            }
        }
    }
}

/**
 * 源代码来自极客时间里的《零基础学Java》，带你零基础入门，夯实Java，欢迎订阅：https://time.geekbang.org/course/intro/181
 */
