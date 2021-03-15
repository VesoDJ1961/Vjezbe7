import java.util.Scanner;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

public class Pomoc {
    public static void main(String[] args) {


        int[] ocene = new int[5];

        String ocenaStr;
        for (int i = 0; i < 5; i++) {
            ocenaStr = JOptionPane.showInputDialog("Unesi ocjenu");
            ocene[i] = Integer.parseInt(ocenaStr);
        }

        int suma = 0;
        for (int x : ocene) {
            suma += x;
            System.out.print(x + " ");
        }
        System.out.println("\nSuma    " + suma);

        JOptionPane.showMessageDialog(null, "Suma = " + suma, "R E Z U L T A T", JOptionPane.INFORMATION_MESSAGE);
        int a = JOptionPane.showConfirmDialog(null, "Da li ste sigurni...", "Potvrda", JOptionPane.YES_NO_CANCEL_OPTION);
        System.out.println("a= " + a);
    }
}