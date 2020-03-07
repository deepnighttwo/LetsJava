public class FindNDivBetter {
    public static void main(String[] args) {
        int n = 5;

        int dividend = 100;
        int divisor = 2000000000;

        String start = "从" + dividend + "开始递增，";

        int found = 0;
        while (found < n) {
            if (dividend < 0) {
                System.out.println("被除数溢出，未找到足够的数。循环结束。");
                break;
            }
            if (dividend % divisor == 0) {
                System.out.println(dividend + "可以整除" + divisor + "。商是" + dividend / divisor);
                found++;
            }
            dividend++;
        }

        System.out.println(start + "共找到" + found + "个可以整除" + divisor + "的数。");

        System.out.println(dividend);
    }
}
