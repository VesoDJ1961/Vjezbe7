/*
(Count single digits)
Write a program that generates 100 random integers between
0 and 9 and displays the count for each number. (Hint: Use an array of ten integers,
say counts, to store the counts for the number of 0s, 1s, . . . , 9s.)

 */

import java.util.Scanner;

public class Vjezba7_7 {
    public static void main(String[] args) {
        ispisRjesenja();
    }

    public static void ispisRjesenja() {

        int[] brojPonavljanja = new int[10];
        int broj;

        for (int i = 0; i < 100; i++) {
            broj = (int) (Math.random() * 10);
           brojPonavljanja[broj]++;
        }
        for(int i=0;i<10;i++){
            System.out.println(i + " ponavlja se " + brojPonavljanja[i] + " puta.");
        }
    }
}
