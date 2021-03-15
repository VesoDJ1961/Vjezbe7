/*
7.14 (Computing gcd)
Write a method that returns the gcd of an unspecified number
of integers. The method header is specified as follows:
public static int gcd(int... numbers)
Write a test program that prompts the user to enter five numbers, invokes the
method to find the gcd of these numbers, and displays the gcd.
 */


import java.util.Scanner;

public class Vjezba7_14_A {

    public static void main(String[] args) {
        // Create a Scanner
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter two integers
        System.out.print("Enter first integer: ");
        int n1 = input.nextInt();
        System.out.print("Enter second integer: ");
        int n2 = input.nextInt();

        int gcd= getGreatestCommonDivision(n1, n2);

        System.out.println("The geatest common divisor for " + n1 +
                " and " + n2 + " is " + gcd);
    }

    public static int getGreatestCommonDivision(int prviBroj, int drugiBroj) {
        int gcd = 1; // Initial gcd is 1
        int k = 2; // Possible gcd
        while (k <= prviBroj && k <= drugiBroj) {
            if (prviBroj % k == 0 && drugiBroj % k == 0)
                gcd = k; // Update gcd
            k++;
        }
        return gcd;
    }
}


