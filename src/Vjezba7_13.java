/*
*7.13 (Random number chooser) Write a method that returns a random number between
1 and 54, excluding the numbers passed in the argument. The method header is
specified as follows:
public static int getRandom(int... numbers)
 */


public class Vjezba7_13 {
    public static void main(String[] args) {

        int[] niz = new int[54];
        for (int i = 0; i < niz.length; i++) {
            niz[i] = i + 1;
            System.out.print(niz[i] + ", ");
        }

        System.out.println(slucajanBroj(niz));

    }

    public static int slucajanBroj(int... brojevi) {
        System.out.println();
        int index = (int) (Math.random() * 53 + 1);
        System.out.println("Index " + index);
        int rezultat = brojevi[index];
        return rezultat;
    }
}
