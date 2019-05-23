public class WuZiQiHuaQiPan {
    public static void main(String[] args) {
        // 代表不同的角色
        int black = 0;
        int white = 1;
        int empty = 2;

        // 不同的角色的不同的棋子字符
        char[] qizi = new char[3];
        qizi[0] = '●';
        qizi[1] = '○';
        qizi[2] = ' ';

        // 刚刚下好的棋子，用不一样的图形提示
        // 这里使用了一种新的创建数组的语法，可以不显示的指定数组的大小，而是在一对打括号里按照顺序指定数组里的每个元素的值
        // 这样数组的创建和赋值就合二为一了。当然这样创建的数组大小也是不可变的，结果没有不同。
        char[] qiziJustMove = new char[]{'■', '□', ' '};


        int size = 20;
        int qipan[][] = new int[size][size];

        int roleJustMove = 1;

        int justMoveLine = size / 2;
        int justMoveColumn = size / 2;


        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (i == justMoveLine && j == justMoveColumn) {
                    qipan[i][j] = black;
                } else {
                    qipan[i][j] = (i + j) % qizi.length;
                }
            }
        }


        // String form = "└┘┌┐├┤│┬┴ ┼";
        String header = "\t";
        for (int j = 0; j < size; j++) {
            header += (j + 1) + "\t";
        }
        System.out.println(header);
        for (int i = 0; i < size; i++) {
            String line = "" + (i + 1) + "\t";
            for (int j = 0; j < size; j++) {
                char[] arrayToUse =
                    // Java中的三元操作符，?前面是一个boolean表达式，
                    // 如果boolean表达式的值为true，则这个表达式的值为冒号前面的值，
                    // 如果boolean表达式的值为false，则这个表达式的值为冒号后面的值
                    (i == justMoveLine && j == justMoveColumn) ? qiziJustMove : qizi;
                //这个表达式等价于
//            char[] arrayToUse;
//            if (i == justMoveLine && j == justMoveColumn) {
//                arrayToUse = qiziJustMove;
//            } else {
//                arrayToUse = qizi;
//            }


                line += arrayToUse[qipan[i][j]] + "\t";
            }
            System.out.println(line + (i + 1));
        }
        System.out.println(header);


    }
}
