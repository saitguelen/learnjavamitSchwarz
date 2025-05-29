package tag11_Exception;

public class C06_NumberFormatException {

    public static void main(String[] args) {
        String zahlenString1 = "123";
        System.out.println("Gültiger Zahlen-String wird versucht...");
        int zahl1 = Integer.parseInt(zahlenString1);
        System.out.println("Umwandlung erfolgreich: "+zahl1);

        String zahlenString2 = "abc"; //nicht numerische zeichen
        System.out.println("Zweite eingegebenen Wert: "+ zahlenString2);

        System.out.println("\nUngültiger Zahlen-String wird versucht ('abc')...");
        // Diese Zeile wird eine NumberFormatException auslösen
        try{
            int zahl2 = Integer.parseInt(zahlenString2); // <= Fehler tritt hier auf!
            System.out.println("Umwandlung erfolgreich: " + zahl2); // Diese Zeile wird nicht ausgeführt
        } catch (NumberFormatException e) {
            System.out.println("Sie haben nicht richtige String-Zahlen Format eingegeben!!!");
        }



    }
    }

