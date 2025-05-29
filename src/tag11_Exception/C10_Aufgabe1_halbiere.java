package tag11_Exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class C10_Aufgabe1_halbiere {

    /*Schreiben Sie eine Methode halbiere, die eine Zahl als Parameter erwartet. Ist diese Zahl
gerade, dann soll die Methode die Hälfte der Zahl zurückgeben. Ist die Zahl ungerade, dann
soll eine IllegalArgumentException geworfen werden. Schreiben Sie dann eine
main()-Methode, die so lange Zahlen vom Benutzer erfragt, bis eine Eingabe halbiert
werden kann.
Reagieren Sie auf ungerade Eingaben, indem Sie die von halbiere geworfene Exception
behandeln.*/
    public static int halbiere(int zahl){
        if (zahl % 2 != 0){
            throw new IllegalArgumentException("Die Zahl muss gerade sein, um halbiert zu werden.");
        }else{
            return  zahl/2;
        }


    }

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        boolean erfolgreich = false;

        while (!erfolgreich){
            try{
                System.out.println("Geben Sie bitte eine Zahl ein: ");
                int eingabe = scn.nextInt();

                int ergebnis = halbiere(eingabe);
                System.out.println("Die Hälfte der Zahl ist: "+ergebnis);

                erfolgreich = true;
            }catch (IllegalArgumentException e){
                System.out.println("Es gibt einen Fehler!!");
                System.out.println("Bitte versuchen Sie es mit einer GERADEN Zahl erneut.");
            }catch (InputMismatchException e){
                System.out.println("Ungültige Eingabe. Bitte eine ganze Zahl eingeben!");
                scn.nextLine();
            }
        }
        scn.close();
        System.out.println("\nProgramm beendet!!!");

    }
}
