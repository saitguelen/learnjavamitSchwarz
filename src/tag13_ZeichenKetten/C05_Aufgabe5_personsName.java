package tag13_ZeichenKetten;

import java.util.Scanner;

public class C05_Aufgabe5_personsName {
    /*
 Write and run a Java program that inputs a person’s name in the form First Middle Last and
the prints it in the form Last, First M., where “M.” is the person’s middle iniBal.
For example, the input
William Jefferson Clinton
would produce the output
Clinton, William J.         */
    public static void main(String[] args) {

        //Eingabe von Nutzer

        Scanner scanner = new Scanner(System.in);
        System.out.println("Geben Sie den vollständigen Namen ein:");  //William Jefferson Clinton
        String name = scanner.nextLine();

        String[] teilen = name.split(" ");  //Teilt den eingegebenen Namen an den Leerzeichen in ein Array mit drei Elementen:
        String vorname = teilen[0];   // Weist den einzelnen Array-Elementen sinnvoll benannte Variablen zu.
        String zweitname = teilen[1];
        String nachname = teilen[2];
        System.out.println(vorname);
        System.out.println(zweitname);
        System.out.println(nachname);
        String initiale = zweitname.charAt(0)+".";  // Nimmt den ersten Buchstaben des zweiten Namens und fügt einen Punkt hinzu, z.B J.

        System.out.println(nachname+", "+vorname+" "+initiale);   // Gibt den Namen im Format Nachname, Vorname Initiale. aus.

    }
}
