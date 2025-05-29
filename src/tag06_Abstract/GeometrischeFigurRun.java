package tag06_Abstract;

public class GeometrischeFigurRun {
    public static void main(String[] args) {
        // Erstellt Kreis- und Rechteck-Objekte.
        GeometrischeFigur meinKreis = new Kreis(5, 5, 3) ;

        GeometrischeFigur meinRechteck = new Rechteck(1, 2, 4, 6) ;

        // Gibt die Informationen, den Umfang und die Fläche des Kreises aus.
        System.out.println("--- Kreis ---");
        meinKreis.anzeigen();
        System.out.println("Umfang: " + meinKreis.berechneUmfang());
        System.out.println("Fläche: " + meinKreis.berechneFlaeche());

        // Gibt die Informationen, den Umfang und die Fläche des Rechtecks aus.
        System.out.println("\n--- Rechteck ---");
        meinRechteck.anzeigen();
        System.out.println("Umfang: " + meinRechteck.berechneUmfang());
        System.out.println("Fläche: " + meinRechteck.berechneFlaeche());
    }
}
