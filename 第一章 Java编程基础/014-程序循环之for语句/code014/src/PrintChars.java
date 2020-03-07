public class PrintChars {
    public static void main(String[] args) {
        char ch = '我';
        int startNum = ch;
        for (int i = 0; i < 26; i++) {
            int newNum = startNum + i;
            System.out.println(newNum + "\t" + ((char) newNum));
        }
    }
}

/**
 * 源代码来自极客时间里的《零基础学Java》，带你零基础入门，夯实Java，欢迎订阅：https://time.geekbang.org/course/intro/181
 */
