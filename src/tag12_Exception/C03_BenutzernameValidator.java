package tag12_Exception;

import java.util.Scanner;

public class C03_BenutzernameValidator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean gültig = false;

        String benutzername = "null";
        while (!gültig) {
            System.out.println("Bitte geben Sie einen Benutzernamen ein: ");
            benutzername = scanner.nextLine().trim();

            // 1. trim



            //2. Länge prüfen

            if (benutzername.length() < 5 || benutzername.length() > 20) {
                System.out.println("Der Benutzername muss zwischen 5 und 20 Zeichen lang sein");
                continue;

            }
            // 3. Nur Buchstaben und Ziffern erlaubt
            if (benutzername.matches("[a-zA-Z0-9]+")) {
                System.out.println("Der Benutzername darf nur Buchstaben und Zahlen enthalten");
                continue;

            }
            // 4. In kleinbuchstaben umwandeln

            benutzername = benutzername.toLowerCase();

            // 5 . Prüfung auf 'admin'

            if (benutzername.endsWith("admin")) {
                System.out.println("Der Benutzername endet mit 'admin'!");
            } else {
                System.out.println("Der Benutzername ist in Ordnung.");

            }gültig = true;

        }

        // Ausgabe des Formatierten Namens
        System.out.println("Formatierter Benutzername: " + benutzername);
    }

}
