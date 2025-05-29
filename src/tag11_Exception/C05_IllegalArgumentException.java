package tag11_Exception;

public class C05_IllegalArgumentException {
    //Methode zur Einstellung des Alters eines Schülers
    public static void schuelerAlterEinstellen(int alter){
        if(alter < 0 || alter>120){  // Wir überprüfen, ob das Alter in einem sinnvollen Bereich liegt
            // Wenn das Alter ungültig ist, lösen wir eine IllegalArgumentException aus
            throw new IllegalArgumentException("Das Alter muss zwischen 0 und 120 liegen: " + alter);
    }
        System.out.println("Schüleralter erfolgreich eingestellt: " + alter);
}

    public static void main(String[] args) {
        System.out.println("Gültiges Alter wird versucht...");
        schuelerAlterEinstellen(25); // Ein gültiges Alter

        System.out.println("\nUngültiges Alter wird versucht (-5)...");
        // Dieser Aufruf wird eine IllegalArgumentException auslösen
        try{
            schuelerAlterEinstellen(-5); // <= Fehler tritt hier auf!
        }
        catch (IllegalArgumentException e){
            System.out.println("--> den ungültigen Wert angegeben wurde");
        }


        System.out.println("\nProgramm läuft weiter..."); // Diese Zeile wird nicht ausgeführt
    }
}
