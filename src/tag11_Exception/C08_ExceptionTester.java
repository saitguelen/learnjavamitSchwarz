package tag11_Exception;

import java.util.InputMismatchException; // Diese Import-Zeile ist wichtig für den neuen Catch-Block
import java.util.Scanner;

public class C08_ExceptionTester {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int auswahl = -1;

        while (auswahl != 0) {
            System.out.println("\n=== RuntimeException Menü ===");
            System.out.println("1. NullPointerException testen");
            System.out.println("2. ArithmeticException testen");
            System.out.println("3. ArrayIndexOutOfBoundsException testen");
            System.out.println("4. NumberFormatException testen");
            System.out.println("5. ClassCastException testen");
            System.out.println("0. Beenden");
            System.out.print("Wählen Sie eine Option: ");

            // HIER IST DIE KORREKTUR: Try-Catch für die Menüauswahl
            try {
                auswahl = scanner.nextInt();

                switch (auswahl) {
                    case 1:
                        testeNullPointer();
                        break;
                    case 2:
                        testeArithmetic();
                        break;
                    case 3:
                        testeArrayIndex();
                        break;
                    case 4:
                        testeNumberFormat(scanner); // scanner.next() liest hier das nächste Token, was ok ist.
                        break;
                    case 5:
                        testeClassCast();
                        break;
                    case 0:
                        System.out.println("Programm wird beendet.");
                        break;
                    default:
                        System.out.println("Ungültige Auswahl! Bitte geben Sie eine Zahl zwischen 0 und 5 ein.");
                }
            } catch (InputMismatchException e) {
                // Fängt den Fehler, wenn der Benutzer keine ganze Zahl eingibt
                System.out.println("Fehler: Ungültige Eingabe für die Menüauswahl. Bitte geben Sie eine Zahl ein.");
                scanner.next(); // <-- SEHR WICHTIG: Löscht die ungültige Eingabe aus dem Puffer,
                // um eine Endlosschleife zu verhindern.
                auswahl = -1; // Setzen Sie die Auswahl auf einen ungültigen Wert, um die Schleife fortzusetzen.
            } catch (Exception e) {
                // Ein generischer Fang für andere unerwartete Fehler in der main-Schleife.
                System.out.println("Ein unerwarteter Fehler ist aufgetreten: " + e.getMessage());
                // e.printStackTrace(); // Nützlich für die Fehlersuche
                auswahl = -1;
            }
        }

        scanner.close();
    }

    // NullPointerException
    public static void testeNullPointer() {
        String text = null;
        try {
            System.out.println("Versuche NullPointerException...");
            System.out.println(text.length());
        } catch (NullPointerException e) {
            System.out.println("NullPointerException gefangen: " + e.getMessage());
        }
    }

    // ArithmeticException
    public static void testeArithmetic() {
        try {
            System.out.println("Versuche ArithmeticException (Division durch Null)...");
            int a = 10;
            int b = 0;
            int c = a / b; // Löst ArithmeticException aus
            System.out.println("Ergebnis: " + c); // Wird nicht erreicht
        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException gefangen: " + e.getMessage());
        }
    }

    // ArrayIndexOutOfBoundsException
    public static void testeArrayIndex() {
        int[] zahlen = {1, 2, 3}; // Gültige Indizes: 0, 1, 2
        try {
            System.out.println("Versuche ArrayIndexOutOfBoundsException...");
            System.out.println(zahlen[5]); // Greift auf Index außerhalb der Grenzen zu
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException gefangen: " + e.getMessage());
        }
    }

    // NumberFormatException
    public static void testeNumberFormat(Scanner scanner) { // Scanner als Parameter übergeben, da er in main ist
        try {
            System.out.print("Geben Sie eine Zahl ein (z.B. 'abc' für Fehler): ");
            // Wichtig: scanner.next() liest nur das nächste Wort/Token,
            // daher gibt es hier keine Probleme mit dem Newline von scanner.nextInt()
            String eingabe = scanner.next();
            System.out.println("Versuche NumberFormatException mit Eingabe: '" + eingabe + "'...");
            int zahl = Integer.parseInt(eingabe); // Löst NumberFormatException aus, wenn eingabe kein gültiger int ist
            System.out.println("Erfolg! Zahl = " + zahl);
        } catch (NumberFormatException e) {
            System.out.println("NumberFormatException gefangen: " + e.getMessage());
        }
    }

    // ClassCastException
    public static void testeClassCast() {
        try {
            System.out.println("Versuche ClassCastException...");
            Object obj = "Hallo"; // Ein String-Objekt
            Integer zahl = (Integer) obj; // Versucht, einen String in Integer zu casten
            System.out.println("Erfolg! Zahl = " + zahl); // Wird nicht erreicht
        } catch (ClassCastException e) {
            System.out.println("ClassCastException gefangen: " + e.getMessage());
        }
    }
}