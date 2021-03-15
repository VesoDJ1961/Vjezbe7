import java.util.Scanner;

public class Vjezba7_14_C {

    public static void main(String[] args) {
        Scanner unos = new Scanner(System.in);
        System.out.println("*****************************************************************");
        System.out.println("*                                                               *");
        System.out.println("*             Proračun najvećeg zajedničkog djelioca            *");
        System.out.println("*                   gcd  GreatestCommonDivisor                  *");
        System.out.println("*                                                               *");
        System.out.println("*****************************************************************");

        System.out.println();
        System.out.println("Za koliko cijelih brojeva želite da izračunate najveći zajednički djelilac ");
        //int ukupnoBrojeva = unos.nextInt();
        int ukupnoBrojeva = 2;
        int[] nizBrojeva = {102, 210};
        //int[] nizBrojeva = new int[ukupnoBrojeva];
        //for (int i = 0; i < ukupnoBrojeva; i++) {
        //    System.out.print("\n Unesite " + i + ". cio broj ");
        //    nizBrojeva[i] = unos.nextInt();
        //}
        System.out.println();
        // pronalaženje najmanjeg broja u nizuBrojeva i njegovo postavljanje na nultu poziciju

        minPrviElement(nizBrojeva);

        for (int i = 0; i < nizBrojeva.length; i++) {
            System.out.println(i + " " + nizBrojeva[i]);
        }

        System.out.println("gcd  " + getGCD(nizBrojeva));
    }

    public static void minPrviElement(int... nizBrojeva) {
        int minBroj = nizBrojeva[0];
        int pomoc = nizBrojeva[0];
        for (int i = 0; i < nizBrojeva.length; i++) {
            if (nizBrojeva[i] < minBroj) {
                minBroj = nizBrojeva[i];
                pomoc = nizBrojeva[0];
                nizBrojeva[0] = nizBrojeva[i];
                nizBrojeva[i] = pomoc;
            }
        }
    }

    public static int getGCD(int... nizBrojeva) {
        int gcd = 1;
        for (int j = 2; j < nizBrojeva[0]; j++) {
            int trenutniGCD = 1;
            int brojac = 0;
            for (int i = 1; i < nizBrojeva.length; i++) {
                if (nizBrojeva[0] % j == 0 && nizBrojeva[i] % j == 0) {
                    trenutniGCD = j;
                    brojac++;
                    System.out.println("trenutni gcd " + trenutniGCD + " brojac " + brojac);
                }
            }
            if (brojac == nizBrojeva.length - 1) {
                gcd = trenutniGCD;
                System.out.println("TRENUTNO " + gcd);
            }
        }
        return gcd;
    }
}

