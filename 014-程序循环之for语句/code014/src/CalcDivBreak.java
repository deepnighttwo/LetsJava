public class CalcDivBreak {
    public static void main(String[] args) {
        int dividend = 100;
        int divisor = 3;

        int foundCount = 0;
        int toBeFound = 5;
        for (int i = 0; i < 100; i++) {
            if (dividend % divisor == 0) {
                System.out.println(dividend + "可以整除" + divisor + "。商为" + dividend / divisor);
                foundCount++;
            }
            dividend++;

            if (foundCount >= toBeFound) {
                break;
            }
        }
        System.out.println("总共找到" + foundCount + "个可以整除" + divisor + "的数。");
    }
}
