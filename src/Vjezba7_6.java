/*
(Revise Listing 5.15, PrimeNumber.java)
Listing 5.15 determines whether a number n is prime by checking whether 2, 3, 4, 5, 6, ..., n/2 is a divisor.
If a divisor is found, n is not prime. A more efficient approach is to check whether any of the
prime numbers less than or equal to   Sqrt(n)   can divide n evenly. If not, n is prime.
Rewrite Listing 5.15 to display the first 50 prime numbers using this approach.
You need to use an array to store the prime numbers and later use them to check
whether they are possible divisors for n.

 */

import java.util.Scanner;

public class Vjezba7_6 {
    public static void main(String[] args) {

        ispisProstihBrojeva();

    }
    public static void ispisProstihBrojeva(){
        int brojac=0;
        int ispitivaniBroj=0;
        int brojProstihBrojeva;
        Scanner unos = new Scanner(System.in);
        System.out.println("Unesite koliko želite da bude prikazano na displeju");
        brojProstihBrojeva= unos.nextInt();

        do {
            ispitivaniBroj++;
            if(isPrimeNumber(ispitivaniBroj)) {
                brojac++;
                if(brojac%10==0){
                    System.out.println();
                }
                System.out.print(ispitivaniBroj + " ");
            }
        }while(brojac<brojProstihBrojeva);
    }

    public static boolean isPrimeNumber(int broj){
        boolean odgovor=true;
        for(int i =2;i<broj;i++){
            if(broj%i==0){
              odgovor = false;
              break;
            }
        }
        return odgovor;
    }
}
