import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        tusk1();
        tusk2();
        tusk3();
        tusk4();
    }

    public static void tusk1() {
        System.out.println("Задание 1");
        int[] integer = new int[3];
        integer[0] = 1;
        integer[1] = 2;
        integer[2] = 3;

        double[] fractional = new double[3];
        fractional[0] = 1.57;
        fractional[1] = 7.654;
        fractional[2] = 9.986;

        int[] arbitrary = {5, 10, 15, 20, 25};

        System.out.println();
    }

    public static void tusk2() {
        System.out.println("Задание 2");
        int[] integer = new int[3];
        integer[0] = 1;
        integer[1] = 2;
        integer[2] = 3;
        for (int i = 0; i < integer.length; i++) {
            if (i == integer.length - 1) {
                System.out.println(integer[i]);
                break;
            }
            System.out.print(integer[i] + ", ");
        }

        double[] fractional = new double[3];
        fractional[0] = 1.57;
        fractional[1] = 7.654;
        fractional[2] = 9.986;
        for (double y = 0; y < fractional.length; y++) {
            if (y == fractional.length - 1) {
                System.out.println(fractional[(int) y]);
                break;
            }
            System.out.print(fractional[(int) y] + ", ");
        }

        int[] arbitrary = {5, 10, 15, 20, 25};
        for (int x = 0; x < arbitrary.length; x++) {
            if (x == arbitrary.length - 1) {
                System.out.println(arbitrary[x]);
                break;
            }
            System.out.print(arbitrary[x] + ", ");
        }
        System.out.println();
    }

    public static void tusk3() {
        System.out.println("Задание 3");
        int[] integer = new int[3];
        integer[0] = 1;
        integer[1] = 2;
        integer[2] = 3;
        for (int i = integer.length - 1; i >= 0; i--) {
            if (i == 0) {
                System.out.println(integer[i]);
                break;
            }
            System.out.print(integer[i] + ", ");
        }

        double[] fractional = new double[3];
        fractional[0] = 1.57;
        fractional[1] = 7.654;
        fractional[2] = 9.986;
        for (double y = fractional.length - 1; y >= 0; y--) {
            if (y == 0) {
                System.out.println(fractional[(int) y]);
                break;
            }
            System.out.print(fractional[(int) y] + ", ");
        }

        int[] arbitrary = {5, 10, 15, 20, 25};
        for (int x = arbitrary.length - 1; x >= 0; x--) {
            if (x == 0) {
                System.out.println(arbitrary[x]);
                break;
            }
            System.out.print(arbitrary[x] + ", ");
        }
        System.out.println();
    }

    public static void tusk4() {
        System.out.println("Задание 4");
        int[] integer = new int[3];
        integer[0] = 1;
        integer[1] = 2;
        integer[2] = 3;

        for (int i = 0; i < integer.length; i++) {
            if (integer[i] % 2 == 1) {
                integer[i] = integer[i] + 1;
            }
        }
        System.out.println(Arrays.toString(integer));
    }

}