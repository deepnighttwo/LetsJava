public class CompareIndex {
    public static void main(String[] args) {
        int size = 60;
        double[] array = new double[size];

        for (int i = 0; i < 10; i++) {
            int index = (int) (Math.random() * size * 3);
            if (index < array.length) {
                System.out.println(array[index]);
            } else {
                System.out.println("数组出界！");
            }
        }
    }
}

/**
 * 源代码来自极客时间里的《零基础学Java》，带你零基础入门，夯实Java，欢迎订阅：https://time.geekbang.org/course/intro/181
 */
