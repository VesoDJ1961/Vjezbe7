import java.util.Scanner;

public class Vjezba7_3 {
    public static void main(String[] args) {
     /*
        (Count occurrence of numbers) Write a program that reads the integers
        between 1 and 100 and counts the occurrences of each. Assume the input ends with 0.
        Here is a sample run of the program:
      */

        ispisNaDisplej();
    }

    public static void ispisNaDisplej() {
        Scanner unos = new Scanner(System.in);
        int[] brojPonavljanja = new int[101];
        int uneseniBroj=0;
        brojPonavljanja[0]=0;

        do {
            uneseniBroj= unos.nextInt();
            brojPonavljanja[uneseniBroj] ++;
        } while (uneseniBroj!=0);

        for(int i=1;i<100;i++){
            if(brojPonavljanja[i]!=0){
                System.out.println(i + " se ponavlja " + brojPonavljanja[i] + " puta");
            }
        }
    }
}
