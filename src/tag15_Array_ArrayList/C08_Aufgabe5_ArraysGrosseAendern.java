package tag15_Array_ArrayList;

import javax.swing.*;
import java.util.Arrays;
import java.util.Scanner;

public class C08_Aufgabe5_ArraysGrosseAendern {
    /*Aufgabe 1 : Standard – Array Größe verändern
Ein Array in Java hat nach der Initialisierung eine feste Größe, die nicht geändert werden kann. Um die
Größe eines Arrays zu erweitern, muss ein neues, größeres Array erstellt werden. Dieses neue Array wird
dann mit den Werten des alten Arrays gefüllt, und es werden zusätzliche Elemente hinzugefügt.
 Es soll so viele Elemente zum Array hinzugefügt werden, wie der Benutzer über eine Eingabe
bestimmt. Verwende hierfür eine for-Schleife.
 Erstelle eine Konstante USR_AMOUNT, die den vom Benutzer eingegebenen Wert enthält, um
das Array zu vergrößern.
 Ein temporäres Array mit der Länge arr.length + USR_AMOUNT soll erstellt werden.
 Übertrage die vorhandenen Werte des Arrays in das temporäre Array.
 Lasse das ursprüngliche Array auf das neue, größere Array zeigen.
 Gib das vergrößerte Array über ein Dialogfenster (JOptionPane) aus. Es soll kein Komma am
Ende der Liste stehen.*/


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        final String[]  arr={"Hans", "Khalid","Lisa" };

        System.out.println("Unsere Liste ist:");
        String ausgabe = Arrays.toString(arr);
        System.out.println(ausgabe);//[Hans, Khalid, Lisa]
       /* oder
       for(String name: arr){
            System.out.print(name+ " ");
        }*/

        // Wie viele Elemnte zum Array hinzufügen
        System.out.println("\nWie viele neue Elemente sollen hinzugefügt werden?");
        final int anzahl = scanner.nextInt();
        scanner.nextLine();

        // Neu Array erstellen
        String[] temp= new String[arr.length+anzahl];

        //Wir kopieren alter Array zu neu Array
        for(int i =0; i< arr.length;i++){
            temp[i]=arr[i];

        }
        // neue werte eingeben
        for(int i = arr.length;i<temp.length;i++){

            System.out.print("Schreib bitte " +(i+1)+". Elemnent: ");
            temp[i]= scanner.nextLine();
        }
        //temp array anzeigen
        StringBuilder output = new StringBuilder();
        for(int i =0; i< temp.length;i++){
            output.append(temp[i]);
            if(i< temp.length-1){
                output.append(", ");
            }
        }
        System.out.println("Neue Liste: ");
        String ausgabe2 = Arrays.toString(temp);
        System.out.println(ausgabe2);
        System.out.println( "Neue Liste: "+ output);
        JOptionPane.showMessageDialog(null, "Neue Liste: " + output);

    }
}
