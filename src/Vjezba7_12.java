/*
(Reverse an array) The reverse method in Section  7.7 reverses an array by
copying it to a new array. Rewrite the method that reverses the array passed in
the argument and returns this array. Write a test program that prompts the user to
enter ten numbers, invokes the method to reverse the numbers, and displays the
numbers.
 */


public class Vjezba7_12 {
    public static void main(String[] args) {
        double[] niz = {5, 2, 13.0, 15.5, 16.2, 7.9, 6.0, 7.3, 8.5, 9.1};
        double[] obrnutiNiz = reverse(niz);
        for(int i=0;i<niz.length;i++) {
            System.out.print(obrnutiNiz[i] + " ");
        }
    }

    public static double[] reverse(double[] red) {
        double[] rezultat = new double[red.length];

        for (int i = 0, j = red.length - 1; i < red.length; i++, j--) {
            rezultat[j] = red[i];
        }
        return rezultat;
    }
}
