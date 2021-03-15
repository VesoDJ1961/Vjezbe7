import java.util.Scanner;

public class Vjezba7_1 {
    public static void main(String[] args) {
        // Ocjenjivanje studenata prema postignutim rezultatima

        //  Oglasna tabla - ispis
        ispisRezultata();

    }

    public static void ispisRezultata() {
        // unos brpja studenata
        Scanner unos = new Scanner(System.in);
        System.out.println("Unesite sljedeće podatke:");
        System.out.print("Broj studenata = ");
        int brojStudenata = unos.nextInt();
        // unos rezultata za svakog studenta
        int maxScore = 0;
        int[] bodoviStudent = new int[brojStudenata];
        for (int i = 0; i < brojStudenata; i++) {

            System.out.print("\n Broj bodova " + (i + 1) + ".  studenta = ");
            bodoviStudent[i] = unos.nextInt();
            if (bodoviStudent[i] > maxScore) {
                maxScore = bodoviStudent[i];
            }
        }
        for (int i = 0; i < brojStudenata; i++) {

            int pomocniBroj = bodoviStudent[i];
           System.out.print("\n Broj bodova " + (i + 1) + ".  studenta = " +bodoviStudent[i]+ "  i ocjena je " + getOcjena(bodoviStudent[i], maxScore));
        }
    }


    public static char getOcjena(int brojBodova, int maxOcjena) {
        char ocjena = ' ';

        if (brojBodova >= (maxOcjena - 10)) {
            ocjena = 'A';
        } else if (brojBodova >= (maxOcjena - 20)) {
            ocjena = 'B';
        } else if (brojBodova >= (maxOcjena - 30)) {
            ocjena = 'C';
        } else if (brojBodova >= (maxOcjena - 40)) {
            ocjena = 'D';
        } else {
            ocjena = 'F';
        }
        return ocjena;
    }
}
