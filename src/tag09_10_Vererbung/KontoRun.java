package tag09_10_Vererbung;

public class KontoRun {

    public static void main(String[] args) {
        Konto konto1= new Konto("000000001",1000.0);

        System.out.println("Kontonr: "+konto1.getKontonummer());
        System.out.println("Kontostand: "+konto1.getKontostand()+" €");

        konto1.einzahlen(500);

        konto1.auszahlen(750.50);

        System.out.println("Kontonummer nach Transaktionen: " + konto1.getKontonummer());
        System.out.println("Kontostand nach Transaktionen: " + konto1.getKontostand() + " €");
    }
}
