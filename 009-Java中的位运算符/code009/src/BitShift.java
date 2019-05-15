public class BitShift {
    public static void main(String[] args) {
        int a = 0x400;
        System.out.println(a);
        System.out.println(a >> 1);
        System.out.println(a >> 2);

        System.out.println(a << 1);
        System.out.println(a << 2);

        int b = -0x400;
        System.out.println(b);
        System.out.println(b >> 1);
        System.out.println(b >> 2);

        System.out.println(b << 1);
        System.out.println(b << 2);

        System.out.println(b >>> 1);
        System.out.println(b >>> 2);


    }
}
