public class IfElseNum {
    public static void main(String[] args) {

        int n = 1;

        String ret = n + "对应的汉字是";
        if (n == 0) {
            ret = ret + "零";
        } else if (n == 1) {
            ret = ret + "壹";
        } else if (n == 2) {
            ret = ret + "贰";
        } else if (n == 3) {
            ret = ret + "叁";
        } else if (n == 4) {
            ret = ret + "肆";
        } else if (n == 5) {
            ret = ret + "伍";
        } else if (n == 6) {
            ret = ret + "陆";
        } else if (n == 7) {
            ret = ret + "柒";
        } else if (n == 8) {
            ret = ret + "捌";
        } else if (n == 9) {
            ret = ret + "玖";
        } else {
            System.out.println("错误的值" + n + "。值需要在大于等于1，小于等于9。");
        }

        System.out.println(ret);
    }
}
