import java.util.Scanner;

public class Vjezba7_2 {

    public static void main(String[] args) {
        ispisiReversniNiz();
    }

    public static void ispisiReversniNiz() {

        int[] pomocniNiz = reverzniNiz();
        System.out.println();
        for (int i = 0; i < pomocniNiz.length; i++) {
            System.out.print(pomocniNiz[i] + " ");
        }
    }

    public static int[] reverzniNiz(int... niz) {
        int[] pomocniNiz = unesiNiz();
        int[] revezniNiz = new int[pomocniNiz.length];
        for (int i = 0, j = pomocniNiz.length - 1; i < pomocniNiz.length; i++, j--) {
            revezniNiz[j] = pomocniNiz[i];
        }
        return revezniNiz;
    }

    public static int[] unesiNiz() {
        Scanner unos = new Scanner(System.in);
        System.out.println("Unesi koliko niz ima elemenata ");
        int brojElemenata = unos.nextInt();

        int[] niz = new int[brojElemenata];

        System.out.println("Unesite vrijednosti za elemente niza");
        for (int i = 0; i < brojElemenata; i++) {
            System.out.println(i + ". element = ");
            niz[i] = unos.nextInt();
        }
        return niz;
    }

}
