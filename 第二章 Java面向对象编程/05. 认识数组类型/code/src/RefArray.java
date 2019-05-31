public class RefArray {

    public static void main(String[] args) {
        Merchandise[] merchandises = new Merchandise[9];
        merchandises[0] = new Merchandise();
        merchandises[1] = new Merchandise();
        merchandises[0].name = "笔记本";
        System.out.println(merchandises[0].name);

        System.out.println(merchandises[2]);
    }
}
