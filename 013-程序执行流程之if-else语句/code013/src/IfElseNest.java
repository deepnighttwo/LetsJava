public class IfElseNest {

    public static void main(String[] args) {
        int a = 10;
        int b = 99;
        int c = 99;

        System.out.println("a=" + a + ". b=" + b + ". c=" + c);
        if (a == b && b == c) {
            System.out.println("a，b和c三个数等大。");
        } else {
            if (a > b) {
                if (a > c) {
                    System.out.println("a是最大的数。");
                } else {
                    if (a == c) {
                        System.out.printf("a和c等大。");
                    } else {
                        System.out.println("c是最大的数。");
                    }
                }
            } else {
                if (b > c) {
                    if (b == a) {
                        System.out.println("a和b是等大的数。");
                    } else {
                        System.out.println("b是最大的数。");
                    }
                } else {
                    if (b == c) {
                        System.out.println("b和c等大。");
                    } else {
                        System.out.println("c是最大的数。");
                    }
                }
            }
        }
    }
}
