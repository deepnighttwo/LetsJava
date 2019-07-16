import java.util.Scanner;

public class OneArrayForAll {
    public static void main(String[] args) {

        // 声明六个变量， 分别代表六门科目的成绩
        int YuWenIndex = 0;
        int ShuXueIndex = 1;
        int WaiYuIndex = 2;
        int WuLiIndex = 3;
        int HuaXueIndex = 4;
        int ShengWuIndex = 5;

        // 每门课的名字
        String[] names = new String[6];
        names[YuWenIndex] = "语文";
        names[ShuXueIndex] = "数学";
        names[WaiYuIndex] = "外语";
        names[WuLiIndex] = "物理";
        names[HuaXueIndex] = "化学";
        names[ShengWuIndex] = "生物";

        Scanner scanner = new Scanner(System.in);

        System.out.println("请输入共有多少年的成绩：");

        int yearCount = scanner.nextInt();

        double[][] scores = new double[yearCount][names.length];

        for (int i = 0; i < yearCount; i++) {
            for (int j = 0; j < names.length; j++) {
                scores[i][j] = 80 + Math.random() * 20;
            }
        }

        System.out.println("请问要查看第几年的成绩？");

        int yearToUse = scanner.nextInt() - 1;

        System.out.println("请问要查看第几科的成绩？");

        int scoreToUse = scanner.nextInt() - 1;

        System.out.println("第" + (yearToUse + 1) + "年的第" + (scoreToUse + 1) + "门的成绩是：" + scores[yearToUse][+scoreToUse]);

    }
}
