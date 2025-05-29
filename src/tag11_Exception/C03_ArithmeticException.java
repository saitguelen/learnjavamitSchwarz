package tag11_Exception;

public class C03_ArithmeticException {

    public static void main(String[] args) {

        int zaehler =10;
        int nenner=0;  //Das problem! Wir werden versuchen, durch  null zu teilen

        System.out.println("Teilungsoperation beginnt....");

        //Diese Zeile wird eine Arithmetische Ausnahme auslösen
        int ergebnis = 0;  //<== Fehler tritt hier auf!
        try {
            ergebnis = zaehler/nenner;
            System.out.println("Ergebnis :"+ ergebnis);
        } catch (ArithmeticException e) {
            System.out.println("Du darfst nicht mit null andere zahl durchteilen");
        }


        System.out.println("Programm beendet");
    }
}
