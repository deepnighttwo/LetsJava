public class AssignArray {
    public static void main(String[] args) {
        int[] array = new int[3];

        array[0] = 9;

        System.out.println("array长度为" + array.length + "。array[0] = " + array[0]);

        array = new int[32];

        System.out.println("array长度为" + array.length + "。array[0] = " + array[0]);
    }
}

/**
 * 源代码来自极客时间里的《零基础学Java》，带你零基础入门，夯实Java，欢迎订阅：https://time.geekbang.org/course/intro/181
 */
