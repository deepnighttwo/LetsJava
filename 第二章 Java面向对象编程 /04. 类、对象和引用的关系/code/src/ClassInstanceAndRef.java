public class ClassInstanceAndRef {
    public static void main(String[] args) {
        Merchandise m = new Merchandise();
        Merchandise1 m1 = new Merchandise1();

        // Merchandise merchandise = m;
        // 即使Merchandise和Merchandise1的内容一摸一样，那也是不同的类，不同类的引用不可以互相赋值。
        // 因为它们本质上是不同的对象。
        // Merchandise merchandise = m1;
    }
}
