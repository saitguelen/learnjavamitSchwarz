package tag14_StringBuilder;

import java.util.Scanner;

public class C07_Aufgabe2_ValidierungUndFormatierung {
    /*
 -Name vom Benutzer erhalten

-trim() → führende/endende Leerzeichen entfernen

-Länge prüfen → length()

-Ungültiges Zeichen → regex oder contains()

-In Kleinbuchstaben umwandeln → toLowerCase()

-endet mit "admin"? → endsWith("admin")

*/
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Bitte Geben Sie einen Benutzernamen ein: ");
        String benutzername = scanner.nextLine();//Name vom Benutzer erledigt

        benutzername = benutzername.trim();// trim() erledigt

        if(benutzername.length()<5 || benutzername.length()>20){//Lände prüfen--> erledigt
            System.out.println("Benutzername muss zwischen 5 und 20 Zeichen lang sein.");
            return;

        }
        //Alles klein schreiben
        benutzername = benutzername.toLowerCase();
        // ungültige Zeichen prüfen
        if(benutzername.contains("@") || benutzername.contains("$") || benutzername.contains("#")){
            System.out.println(" Benutzername darf keine Sonderzeichen wie @, #, $ enthalten.");
            return;
        }
        // Endet der Name mmit "Admin"
        if (benutzername.endsWith("admin")){
            System.out.println("Benutzername endet mit 'admin'.");
        }else{
            System.out.println("Benutzername ist gültig: "+benutzername);
        }
    }
}
