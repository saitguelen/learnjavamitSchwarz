package tag11_Exception;

import java.io.IOException;

public class C13_Aufgabe4_UncheckedException {

    /*Wird eine unchecked exception innerhalb einer Methode geworfen, so muss man die
Signatur der Methode nicht um eine throws-Klausel ergänzen. Zeigen Sie das.*/

    public static void wirfFehler(){
        throw new IllegalArgumentException("Das ist eine Unchecked Exception!");
    }
    public static void ladeDatei() throws IOException {
        throw new IOException("Datei konnte nicht geladen werden!");
    }

    public static void main(String[] args) {
        try{
            wirfFehler();
        }
        catch (IllegalArgumentException e){
            System.out.println("Fehler gefangen: "+ e.getMessage());
        }

        System.out.println();
        System.out.println("man muss 'throws' ergänzen");

        try{
            ladeDatei();
        }
        catch (IOException e){
            System.out.println("Fehler"+e.getMessage());
        }
    }
}
