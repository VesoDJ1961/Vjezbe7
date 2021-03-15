import java.util.Scanner;

public class Vjezba7_4 {
    public static void main(String[] args) {
     /*
        (Analyze scores)
        Write a program that reads an unspecified number of scores and
        determines how many scores are above or equal to the average and how many
        scores are below the average. Enter a negative number to signify the end of the
        input. Assume that the maximum number of scores is 100.
      */

        ispisNaDisplej();
    }

    public static void ispisNaDisplej() {
        Scanner unos = new Scanner(System.in);
        int[] rezultat = new int[100];
        int zbir = 0;

        for (int i = 0; i < 100; i++) {
            // rezultat[i] = unos.nextInt();
            rezultat[i] =(int)(Math.random()*100);
            zbir += rezultat[i];
        }
        int prosjek = zbir / 100;
        int brojJednakIVeciOdProsjeka = 0;
        int brojIspodProsjeka = 0;
        for (int i = 0; i < 100; i++) {
            if (rezultat[i] >= prosjek) {
                brojJednakIVeciOdProsjeka++;
            } else {
                brojIspodProsjeka++;
            }
        }
        System.out.println("broj brojeva jednak i iznad prosjeka " + brojJednakIVeciOdProsjeka);
        System.out.println("broj brojeva ispod prosjeka " + brojIspodProsjeka);
    }
}
