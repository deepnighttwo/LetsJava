public class ScoreArrayMaxScore {
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

        // 每门课的成绩
        double[] scores = new double[6];

        // 用随机数给成绩赋值
        for (int i = 0; i < 6; i++) {
            scores[i] = 80 + Math.random() * 20;
        }

        // 计算最高成绩和最高成绩对应的科目的索引
        double maxScore = -1;
        int maxScoreIndex = -1;
        for (int i = 0; i < 6; i++) {
            System.out.println(names[i] + "的成绩为" + scores[i]);
            if (maxScore < scores[i]) {
                maxScore = scores[i];
                maxScoreIndex = i;
            }
        }

        // 输出最高成绩科目和成绩
        System.out.println("最高分的科目为" + names[maxScoreIndex] + "，成绩为：" + maxScore);

    }
}
