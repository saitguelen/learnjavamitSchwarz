package tag11_Exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class C09_InputMismatchException {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean gültig = false;

        while (!gültig) {
            try {
                System.out.print("Bitte geben Sie eine ganze Zahl ein: ");
                int zahl = scanner.nextInt(); // wir warten auf: int
                System.out.println("Danke! Ihre Zahl ist: " + zahl);
                gültig = true;
            } catch (InputMismatchException e) {
                System.out.println("Fehler: Das war keine ganze Zahl!");
                scanner.nextLine(); // ⚠️ Löscht den Puffer für fehlerhafte Eingaben
            }
        }

        scanner.close();
    }
}

