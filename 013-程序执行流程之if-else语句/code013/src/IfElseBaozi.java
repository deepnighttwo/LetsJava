public class IfElseBaozi {
    public static void main(String[] args) {
        int baozi = 3;

        boolean baoziGangchuLong = true;

        if (baoziGangchuLong) {
            baozi = baozi + 2;
            System.out.println("包子刚刚出笼，买了" + baozi + "个肉包子");
        } else {
            System.out.println("买了" + baozi + "个肉包子");
        }
    }
}
