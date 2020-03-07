public class CalcDivBreakAndContinue {
    public static void main(String[] args) {
        int dividend = 10;
        int divisor = 21;

        int foundCount = 0;
        int toBeFound = 5;
        for (int i = 0; i < 200; i++, dividend++) {
            if (divisor > dividend) {
                System.out.println("跳过" + dividend + ", 因为它比除数" + divisor + "小。");
                continue;
            }
            if (dividend % divisor == 0) {
                System.out.println(dividend + "可以整除" + divisor + "。商为" + dividend / divisor);
                foundCount++;
            }

            if (foundCount >= toBeFound) {
                break;
            }
        }
        System.out.println("总共找到" + foundCount + "个可以整除" + divisor + "的数。");
    }
}
