package tag15_Array_ArrayList;

import java.sql.SQLOutput;
import java.util.Scanner;

public class C05_Aufgabe3_Erweitert {
    /*Aufgabe 2: Ergänzen einer Eingabe
Das Programm soll so erweitert werden, dass der Benutzer die Werte für das Array selbst eingeben
kann. Die Länge des Arrays bleibt auf 5 Werte beschränkt. Nach der Eingabe sollen die maximalen und
minimalen Werte berechnet und ausgegeben werden. Es soll keine split()-Methode oder andere String-
Methoden verwendet werden.
Der Nutzer gibt z.B. folgende Zahlenfolge ein: 8, 3, 15, 4, 11*/

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int[] zahlen= new int[5];

        System.out.println("Geben Sie bitte fünf ganza Zahlen ein: ");

        for(int i=0; i< zahlen.length; i++){
            System.out.print((i+1)+" . zahl:");
            zahlen[i] = scanner.nextInt();

        }
        int min = zahlen[0];
        int max = zahlen[0];

        for(int zahl:zahlen){
            if(max<zahl){
                max= zahl;
            }else if(min>zahl){
                min=zahl;
            }
        }
        System.out.println();
        System.out.println("liste ist: ");
        for (int zahl:zahlen){
            System.out.print(zahl+" ");
        }
        System.out.println();
        System.out.println("Maximum : "+max);
        System.out.println("Minimum: "+min);
    }
}
