public class IfElseNestSimple {

    public static void main(String[] args) {
        int a = 10;
        int b = 7;
        int c = 99;

        System.out.println("a=" + a + ". b=" + b + ". c=" + c);
        if (a == b && b == c) {
            System.out.println("a，b和c相等。");
        } else if (a > b & a > c) {
            System.out.println("a的值最大。");
        } else if (b > a && b > c) {
            System.out.println("b的值最大。");
        } else if (c > a && c > b) {
            System.out.println("c的值最大。");
        } else if (a == b && b > c) {
            System.out.println("a和b等大最大。");
        } else if (b == c && b > a) {
            System.out.println("b和c等大最大。");
        } else if (a == c && b > c) {
            System.out.println("a和c等大最大。");
        }
    }
}
