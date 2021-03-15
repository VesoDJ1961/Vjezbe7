import java.util.Scanner;

public class Vjezba7_5 {
    /*
(Print distinct numbers)
Write a program that reads in ten numbers and displays the number of distinct numbers
and the distinct numbers separated by exactly one
space (i.e., if a number appears multiple times, it is displayed only once). (Hint:
Read a number and store it to an array if it is new. If the number is already in the
array, ignore it.) After the input, the array contains the distinct numbers. Here is
the sample run of the program:

     */

    public static void main(String[] args) {
        ispisiRezultat();

    }

    public static void ispisiRezultat() {
        Scanner sc = new Scanner(System.in);
        int[] nizBrojeva = new int[10];
        int[] rezultatNiz = new int[10];

        for (int i = 0; i < 10; i++) {

            // nizBrojeva[i]=sc.nextInt();
            nizBrojeva[i] = (int) (Math.random() * 10 + 1);
            System.out.print(nizBrojeva[i] + " ");
        }
        System.out.println();
        int z = 0;
        for (int i = 0; i < 10; i++) {
            for (int j = i + 1; j < 10; j++) {
                if (i != j || nizBrojeva[i] != -1) {
                    if (nizBrojeva[i] == nizBrojeva[j]) {
                        nizBrojeva[j] = -1;
                    }
                }
            }
        }
/*
        System.out.println();
        for (int i = 0; i < 10; i++) {
            System.out.print(nizBrojeva[i] + " ");

        }
        System.out.println();

 */
        for (int i = 0; i < 10; i++) {
            if (nizBrojeva[i] != -1) {
                System.out.print(nizBrojeva[i] + " ");
            }
        }
    }
}