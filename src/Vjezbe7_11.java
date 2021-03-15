/*
(Statistics: compute deviation) Programming Exercise 5.45 computes the standard deviation of numbers.
This exercise uses a different but equivalent formula to

compute the standard deviation of n numbers.



To compute the standard deviation with this formula,
        you have to store the individual numbers using an array,
        so that they can be used after the mean is obtained.
Your program should contain the following methods:
 Compute the deviation of double values
public static double deviation(double[] x)
 Compute the mean of an array of double values
public static double mean(double[] x)
        Write a test program that prompts the user to enter ten numbers and displays the
        mean and standard deviation, as shown in the following sample run:
 */


public class Vjezbe7_11 {
    public static void main(String[] args) {

        double[] niz = {1.9, 2.5, 3.7, 2, 1, 6, 3, 4, 5, 2};
        System.out.println(mean(niz));
        System.out.println(deviation(niz));
    }

    public static double mean(double[] x) {
        double prosjek = 0;
        for (int i = 0; i < x.length; i++) {
            prosjek = prosjek + x[i];
        }
        return prosjek / x.length;
    }

    public static double deviation(double[] x) {
        double odstupanje = 0;
        double prosjek = mean(x);
        for (int i = 0; i < x.length; i++) {
            odstupanje = odstupanje + (x[i] - prosjek) * (x[i] - prosjek);
        }
        odstupanje = Math.sqrt(odstupanje / (x.length - 1));
        return odstupanje;
    }

}
