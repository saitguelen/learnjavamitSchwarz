package tag15_Array_ArrayList;

import javax.swing.*;
import java.util.Arrays;
import java.util.Scanner;

public class C08_Aufgabe5_2Arrays_copyOf {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // final entfernen
        String[] arr = {"Hans", "Khalid", "Lisa"};

        System.out.println("Unsere Liste ist:");
        System.out.println(Arrays.toString(arr));

        // wie viele elemnte hinzugefügt werden
        System.out.println("Wie viele neue Elemente sollen hinzugefügt werden?");
        final int anzahl = scanner.nextInt();
        scanner.nextLine(); // nextInt sonrası boş satır temizliği

        // großern array
        arr = Arrays.copyOf(arr, arr.length + anzahl);

        // neue element
        for (int i = 3; i < arr.length; i++) {
            System.out.print("Bitte " + (i + 1) + ". Element eingeben: ");
            arr[i] = scanner.nextLine();
        }

        // ausgabe
        StringBuilder output = new StringBuilder();
        for (int i = 0; i < arr.length; i++) {
            output.append(arr[i]);
            if (i < arr.length - 1) {
                output.append(", ");
            }
        }

        System.out.println("Neue Liste: " + output);
        JOptionPane.showMessageDialog(null, "Neue Liste: " + output);
    }
}
