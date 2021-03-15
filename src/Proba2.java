import java.util.Scanner;

public class Proba2 {
    public static void main(String[] args) {
        int[] brojevi = new int[5];
        Scanner unos = new Scanner(System.in);
        for (int i = 0; i < brojevi.length; i++) {
            brojevi[i] = unos.nextInt();
        }
        for (int i = 0; i < brojevi.length; i++) {
            System.out.println(" " + i + " " + brojevi[i] + " ");
        }
        for (int m : brojevi) {
            System.out.println(m + " " + brojevi[m - 1] + " ");
        }
    }
}
