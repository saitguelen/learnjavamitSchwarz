package tag13_ZeichenKetten;

import java.util.Arrays;
import java.util.Scanner;

public class C10_Aufgabe10_DoppeltesLeerzeichenEntfernen {

    /*chreiben Sie ein Programm, das mehrfache Leerzeichen in einem Satz durch ein einziges Leerzeichen ersetzt.
Beispiel:
"Dies ist ein Satz" → "Dies ist ein Satz"*/

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Geben Sie einen Satz mit mehreren Leerzeichen ein:");
        String eingabe = scanner.nextLine();  // Örnek: "Dies   ist   ein   Test"

        // Zuweisung für alle Leerzeichen (kann mehr als ein Leerzeichen sein)
        String [ ] woerter = eingabe.split("\\s+");
        System.out.println(Arrays.toString(woerter));

        // // Zusammenführen mit einfachem Leerzeichen
        String ergebnis = String.join(" ", woerter);

        System.out.println("Bereinigter Satz: " + ergebnis);
    }
}
