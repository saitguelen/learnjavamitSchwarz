package tag19_SingletonPattern.DruckerUbung;

public class Drucker {

    // Statische Variable für die einzige Instanz
    private static Drucker instanz;

    // Privater Konstruktor verhindert externe Instanzierung
    private Drucker() {
        System.out.println(" Drucker wird erstellt...");
    }

    // Methode zur Rückgabe der einzigen Instanz (Lazy Initialization)
    public static synchronized Drucker getInstance() {
        if (instanz == null) {
            instanz = new Drucker();
        }
        return instanz;
    }

    // Beispielmethode: drucken
    public void drucken(String dokument) {
        System.out.println("📄 Dokument wird gedruckt: " + dokument);
    }

}
