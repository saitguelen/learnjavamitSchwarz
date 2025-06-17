package tag19_SingletonPattern.DruckerUbung;

public class DruckerTest {

    public static void main(String[] args) {

        // Mehrere Versuche, eine Drucker-Instanz zu bekommen
        Drucker d1 = Drucker.getInstance();
        d1.drucken("Bericht.pdf");

        Drucker d2 = Drucker.getInstance();
        d2.drucken("Rechnung.docx");

        // Prüfen, ob beide Referenzen gleich sind
        if (d1 == d2) {
            System.out.println(" Beide Referenzen zeigen auf dieselbe Instanz.");
        } else {
            System.out.println("Unterschiedliche Instanzen! Singleton funktioniert nicht.");
        }
    }
}

