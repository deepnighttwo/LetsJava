public class IfElseSwitchNoBreak {
    public static void main(String[] args) {

        int n = 5;

        String ret = n + "对应的汉字是";

        switch (n) {
            case 1:
                ret = ret + "壹";
            case 2:
                ret = ret + "贰";
            case 3:
                ret = ret + "叁";
            case 4:
                ret = ret + "肆";
            case 5:
                ret = ret + "伍";
            case 6:
                ret = ret + "陆";
            case 7:
                ret = ret + "柒";
            case 8:
                ret = ret + "捌";
            case 9:
                ret = ret + "玖";
            default:
                System.out.println("错误的值" + n + "。值需要大于等于1，小于等于9。");
        }
        System.out.println(ret);
    }
}
