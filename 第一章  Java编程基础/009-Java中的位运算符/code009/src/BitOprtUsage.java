public class BitOprtUsage {

    public static void main(String[] args) {
        int base = 1;
        int is_student_mask = base;
        int is_programmer_mask = base << 1;
        int is_driver_mask = base << 2;
        int is_painter_mask = base << 3;

        int data = 5;

        boolean isStudent = (data & is_student_mask) != 0;
        System.out.println(isStudent);

        boolean isProgrammer = (data & is_programmer_mask) != 0;
        System.out.println(isProgrammer);

        boolean isDriver = (data & is_driver_mask) != 0;
        System.out.println(isDriver);

        boolean isPainter = (data & is_painter_mask) != 0;
        System.out.println(isPainter);
    }
}
