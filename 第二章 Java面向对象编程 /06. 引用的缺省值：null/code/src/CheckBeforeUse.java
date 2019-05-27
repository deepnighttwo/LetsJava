public class CheckBeforeUse {
    public static void main(String[] args) {
        // 数组在创建出来之后，会按照类型给数组中的每个元素赋缺省值。
        // 引用类型的缺省值是null
        Merchandise[] merchandises = new Merchandise[9];
        // 给索引为偶数的引用赋值
        for (int i = 0; i < merchandises.length; i++) {
            if (i % 2 == 0) {
                merchandises[i] = new Merchandise();
            }
        }

        // merchandises[7].name = "不存在的商品，不存在的名字";

        for (int i = 0; i < merchandises.length; i++) {
            if (merchandises[i] != null) {
                merchandises[i].name = "商品" + i;
            }
        }

        for (int i = 0; i < merchandises.length; i++) {
            if (merchandises[i] != null) {
                System.out.println(merchandises[i].name);
            }
        }
    }
}
