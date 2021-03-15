/*
(Computing gcd)
Write a method that returns the gcd of an unspecified number
of integers. The method header is specified as follows:
public static int gcd(int... numbers)
Write a test program that prompts the user to enter five numbers, invokes the
method to find the gcd of these numbers, and displays the gcd.
 */


import java.util.Arrays;
import java.util.Collections;

public class Vjezba7_14 {


    public static void main(String[] args) {
        int[] niz1 = {13, 4, 5, 5, 6};
        Integer [] niz = new Integer[niz1.length];
        Arrays.sort(niz);
        int minElement= niz[0];
        int maxEl = niz[niz.length-1];
        System.out.println("maxEl = " + maxEl);
        System.out.println("minElement = " + minElement);
        for (Integer broj:niz) {
            System.out.println("broj = " + broj);
        }
    }

    public static int gcd(int... numbers) {
        for (int i = 0; i < numbers.length; i++) {


        }

        return 45;

    }

}

