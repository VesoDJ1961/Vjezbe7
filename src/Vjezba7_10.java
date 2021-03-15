/*
(Find the index of the smallest element)
Write a method that returns the index of
the smallest element in an array of integers. If the number of such elements is
greater than 1, return the smallest index. Use the following header:
public static int indexOfSmallestElement(double[] array)
Write a test program that prompts the user to enter ten numbers, invokes this
method to return the index of the smallest element, and displays the index.
 */


public class Vjezba7_10 {
    public static void main(String[] args) {

        double[] niz = {11.1, 20, 13.0, 8.5, 8.2, 8.9, 4.0, 7.3, 8.5, 9.1};
        System.out.println(indexOfSmallestElement(niz));
    }

    public static int indexOfSmallestElement(double[] array) {
        int indeks=0;
        double minBroj = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] < minBroj) {
                minBroj = array[i];
                indeks = i;

                System.out.println("i " + i);
            }
        }
        return indeks;
    }
}
