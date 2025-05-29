package tag13_ZeichenKetten;

import org.w3c.dom.ls.LSOutput;

import java.util.Arrays;
import java.util.Scanner;

public class C06_Aufgabe6_formatCorrectlymitSchleife {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Geben Sie bitte einen Satz oder Namen ein:"); //asDDSAsji kdFnoSafi YNBjnis BBX USkndsannd BnjndNJBIDb

        String satz = scanner.nextLine();

        if (!satz.matches("[a-zA-ZäöüÄÖÜß ]+")) {
            throw new IllegalArgumentException("Ungültiger Eingabetext: Nur Buchstaben und Leerzeichen erlaubt!");
        }

        String[] teilen = satz.split(" ");

        String ergebnis = "";
        for (int i = 0; i < teilen.length; i++) {
            String korrektur = teilen[i].substring(0, 1).toUpperCase() + teilen[i].substring(1).toLowerCase();
            ergebnis += korrektur + " ";
        }
        System.out.println("Formatierte Text: " + ergebnis);
    }


}
