public class MultiTable {

    public static void main(String[] args) {
        for (int i = 1; i <= 9; i++) {
            String line = "";
            for (int j = 1; j <= 9; j++) {
                if (i < j) {
                    break;
                }
                line = line + j + "*" + i + "=" + (j * i) + "\t";
            }
            System.out.println(line);
        }
    }
}

/**
 * 源代码来自极客时间里的《零基础学Java》，带你零基础入门，夯实Java，欢迎订阅：https://time.geekbang.org/course/intro/181
 */
