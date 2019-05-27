public class CompareIndex {
    public static void main(String[] args) {
        int size = 60;
        double[] array = new double[size];

        for (int i = 0; i < 10; i++) {
            int index = (int) (Math.random() * size * 3);
            if (index < array.length) {
                System.out.println(array[index]);
            } else {
                System.out.println("数组出界！");
            }
        }
    }
}
