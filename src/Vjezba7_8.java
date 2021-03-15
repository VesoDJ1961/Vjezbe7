/*
(Average an array)
Write two overloaded methods that return the average of an
array with the following headers:
public static int average(int[] array)
public static double average(double[] array)
Write a test program that prompts the user to enter ten double values, invokes this
method, and displays the average value.
 */


public class Vjezba7_8 {
    public static void main(String[] args) {
        // int[] intNiz = new int[10];
        // double[] doubleNiz = new double[10];
        int[] intNiz = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        double[] doubleNiz = {11.1, 12.5, 13.0, 15.5, 16.2, 7.9, 6.0, 7.3, 8.5, 9.1};
        System.out.println(average(intNiz));
        System.out.println(average(doubleNiz));
    }

    public static int average(int[] array) {
        int zbir = 0;
        for (int i = 0; i < array.length; i++) {
            zbir += array[i];
            // System.out.println(" Z " + zbir);
        }
        // System.out.println("Zbir int " + zbir/array.length);
        return zbir / array.length;
    }

    public static double average(double[] array) {
        double zbir = 0;
        for (int i = 0; i < 10; i++) {
            zbir += array[i];
            System.out.println(" Z " + zbir);
        }
        System.out.println("Zbir double " + zbir / 10);
        return zbir / 10;
    }
}
