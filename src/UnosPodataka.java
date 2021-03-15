import java.util.Scanner;

public class UnosPodataka {
    public static int[] unesiNiz(int brojElemenata){
        int[] niz=new int[brojElemenata];
        Scanner unos= new Scanner(System.in);
        System.out.println("Unesite "+ brojElemenata + "cijelih brojeva");
        for(int i=0; i<brojElemenata;i++) {
            niz[i]=unos.nextInt();
        }
        return niz;
    }
    public static double[] unesiNiz1(int brojElemenata){
        double[] niz=new double[brojElemenata];
        Scanner unos= new Scanner(System.in);
        System.out.println("Unesite "+ brojElemenata + "decimalnih brojeva");
        for(int i=0; i<brojElemenata;i++) {
            niz[i]=unos.nextDouble();
        }
        return niz;
    }
}
