package tag15_Array_ArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class C07_Aufgabe4_NotenDurchschnittmitArrayList {

      /*Aufgabe : Notendurchschnitt berechnen
Ein Programm soll die Noten eines Benutzers erfragen, den Durchschnitt berechnen und sowohl die eingegebenen
Noten als auch den Durchschnitt als Ergebnis zurückgeben. Dabei soll die Ausgabe der Noten
als String erfolgen, wobei das letzte Element des Arrays ohne ein nachfolgendes Komma ausgegeben
wird. Es sollen ausschließlich Java-Standard-Arrays verwendet werden.

Anforderungen:
1. Der Nutzer soll die Anzahl der einzugebenden Noten selbst eingeben können.
2. Der Nutzer gibt die Noten als Dezimalzahl ein. Hierbei soll auch die Nummerierung der Noten
hochzählen. (siehe Eingabe-Screenshot)
3. Der Durchschnitt wird berechnet.
4. Die Ausgabe gibt die eingegebenen Noten aus sowie den Notendurchschnitt. Bei der letzten eingegebenen
Zahl darf kein Komma stehen..*/

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Double> notenListe = new ArrayList<>();

        //Noten Anzahl

        System.out.print("Wie viele Noten werden Sie eingeben? :\n");
        int anzahl = scanner.nextInt();
        double summe =0;

        for(int i =0; i<anzahl;i++){
            System.out.print("Geben Sie bitte "+(i+1)+". Note ein:");
            double note = scanner.nextDouble();
            notenListe.add(note);
            summe += note;

        }
        double durchschnitt = summe/ notenListe.size();

        System.out.println("Eingegebne Note: ");
        for(int i=0;i< notenListe.size();i++){
            System.out.print(notenListe.get(i));
            if(i< notenListe.size()-1){
                System.out.print(", ");
            }
        }
        System.out.printf("\nDer Notendurchschnitt beträgt: %.2f\n ",durchschnitt);
    }
}
