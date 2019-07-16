public class IfElseSwitchNoBreak2 {
    public static void main(String[] args) {

        int n = 3;

        switch (n) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                System.out.println("n的值小于等于1大于等于5，为" + n);
            case 6:
            case 7:
            case 8:
            case 9:
                System.out.println("n的值小于等于6大于等于9，为" + n);
            default:
                System.out.println("错误的值" + n + "。值需要大于等于1，小于等于9。");
        }
    }
}
