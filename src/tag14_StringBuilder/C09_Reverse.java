package tag14_StringBuilder;

import java.util.Scanner;

public class C09_Reverse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StringBuilder ergebnis = new StringBuilder();

        for (int i = 1; i < 4; i++) {
            System.out.println("Geben Sie bitte eines Wort ein:");
            String wort = scanner.nextLine();
            wort = wort.substring(0, 1).toUpperCase() + wort.substring(1).toLowerCase();

            ergebnis.append(wort).append(" ");

        }
        System.out.println("die endgültige zusammengeführte Version: " + ergebnis); //Haus Fenster Blume
        ergebnis = ergebnis.reverse();
        System.out.println("Umgekehrte Version:" + ergebnis.toString()); //emulB ret sneF suaH

    }
}
