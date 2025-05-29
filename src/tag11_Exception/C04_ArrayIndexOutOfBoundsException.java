package tag11_Exception;

public class C04_ArrayIndexOutOfBoundsException {
    public static void main(String[] args) {
        String [] schueler = {"Markus", "Ali", "Johanny", "Dimos", "Zeynep"};
        System.out.println(schueler.length);//5


        // Gültige Indizes: 0, 1, 2
        System.out.println("1. Schüler: " + schueler[0]);
        System.out.println("2. Schüler: " + schueler[1]);
        System.out.println("3. Schüler: " + schueler[2]);
        System.out.println("4. Schüler: " + schueler[3]);
        System.out.println("5. Schüler: " + schueler[4]);

        System.out.println("Versuchter Zugriff auf den 6. Schüler...");
        // Diese Zeile wird eine ArrayIndexOutOfBoundsException auslösen

        try {
            // Direkt den ungültigen Index ausprobieren
            System.out.println("6. Schüler: " + schueler[5]); // ⚠️ Hata burada
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Fehler: Es gibt keinen Schüler an diesem Index.");
        }



    }

}
