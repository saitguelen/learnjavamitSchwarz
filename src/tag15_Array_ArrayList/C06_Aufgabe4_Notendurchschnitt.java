package tag15_Array_ArrayList;

import java.util.Scanner;

public class C06_Aufgabe4_Notendurchschnitt {

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

        // Erste Schritt Note Anzahl
        System.out.print("Wie viele Noten werden Sie eingeben?: ");
        int anzahl= scanner.nextInt();
        double[] noten = new double[anzahl];
        double summe = 0;
        System.out.println();

        //Nimm die Notizen vom Benutzer
        for(int i=0; i<anzahl;i++){
            System.out.print("Bitte geben Sie "+(i+1)+". Note ein:");
            noten[i]=scanner.nextDouble();
            summe += noten[i];
        }

        //Durchschnitt berechnen
        double durchschnitt = summe/ noten.length;

        //Noten ausgeben ohne Komma
        System.out.println("Die eingegebenen Noten betragen: " );
        for (int i =0;i< noten.length;i++){
            System.out.print(noten[i]);
            if(i<noten.length-1){
                System.out.print(", ");
            }
        }
        System.out.println();
        //Durchschnitt ausgeben
        System.out.printf("\nDer Notendurchschnitt beträgt: %.2f\n ",durchschnitt);



    }
}
