/*
(Find the smallest element)
Write a method that finds the smallest element in an
array of double values using the following header:
public static double min(double[] array)
Write a test program that prompts the user to enter ten numbers, invokes this
method to return the minimum value, and displays the minimum value. H
 */

public class Vjezba7_9 {
    public static void main(String[] args) {

        double[] niz = {11.1, 12.5, 13.0, 15.5, 16.2, 7.9, 6.0, 7.3, 8.5, 9.1};
        System.out.println(min(niz));
    }


    public static double min(double[] array){
        double minBroj=array[0];
        for(int i =0; i<array.length;i++){
            if(array[i]<minBroj){
                minBroj=array[i];
                System.out.println("min "+minBroj);
            }
        }
        return minBroj;
    }
}
