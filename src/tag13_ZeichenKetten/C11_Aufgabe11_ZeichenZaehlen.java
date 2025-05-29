package tag13_ZeichenKetten;

import java.util.Scanner;

public class C11_Aufgabe11_ZeichenZaehlen {

    /*Schreiben Sie ein Programm, das zählt, wie oft ein bestimmtes Zeichen in einem gegebenen Text vorkommt.

Beispiel:
Eingabe Text: "Ananas"

Gesuchtes Zeichen: 'a'

Ausgabe: Anzahl: 3

*/
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); //Liest den gesamten Text vom Benutzer

        // Text abfragen
        System.out.print("Geben Sie einen Text ein: ");
        String text = scanner.nextLine();

        // Zeichen abfragen
        System.out.print("Welches Zeichen möchten Sie zählen? ");
        char zeichen = scanner.next().charAt(0); //Holt das erste Zeichen der Eingabe

        text=text.toLowerCase();
        zeichen=Character.toLowerCase(zeichen);//Wir ändern den Text und das Zeichen in Kleinbuchstaben

        int anzahl = 0;

        for(int i =0; i<text.length();i++){  //Durchläuft jeden Buchstaben im Text
            if(text.charAt(i)==zeichen){     //Vergleicht jedes Zeichen mit dem gesuchten
                anzahl ++;                     //Erhöht den Zähler bei Übereinstimmung
            }
        }
        System.out.println("Das Zeichen '" + zeichen + "' kommt " + anzahl + " mal vor.");
    }
}
