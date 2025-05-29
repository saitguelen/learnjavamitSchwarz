package tag11_Exception;

public class C12_Aufgabe3_finallyDemo {
    /*Überzeugen Sie sich selbst, dass finally auf jeden Fall ausgeführt wird. Schreiben Sie
dazu eine statische Methode, die einen int-Wert erhält und einen String zurückgibt. Die
Methode enthält ein try-catch-finally Konstrukt. Für negative Übergabeparameter
wird in try eine ArithmeticException ausgelöst. Schreiben Sie ans Ende des try
Blockes return "try" und ans Ende des catch Blockes return "catch". Der
finally-Block enthalte lediglich die Meldung System.out.println("finally
"). Testen Sie ihre Methode mit verschiedenen Parametern und geben Sie den return-
Wert der Methode aus.*/

    public static String pruefeZahl(int zahl) {
        try {
            if (zahl < 0) {
                throw new ArithmeticException("Negative Zahl!!");
            }
            return "try";
        } catch (ArithmeticException e) {
            return "catch";
        } finally {
            System.out.println("Finally");
        }

    }

    public static void main(String[] args) {
        System.out.println("Ergebnis bei positiver Zahl: " + pruefeZahl(5));
        System.out.println("Ergebnis bei negativer Zahl: " + pruefeZahl(-3));
    }
}
