package tag06_Abstract;

public  class Rechteck extends GeometrischeFigur{

    private double laenge;
    private double breite;

    // Konstruktor

    public Rechteck(double x, double y, double laenge, double breite) {
        super(x, y);
        this.laenge = laenge;
        this.breite = breite;
    }

    // Getter-Methode für Länge
    public double getLaenge() {
        return laenge;
    }

    // Setter-Methode für Länge
    public void setLaenge(double laenge) {
        this.laenge = laenge;
    }

    // Getter-Methode für Breite
    public double getBreite() {
        return breite;
    }

    // Setter-Methode für Breite
    public void setBreite(double breite) {
        this.breite = breite;
    }

    // berechneUmfang()
    @Override
    public double berechneUmfang() {
        return 2 * (laenge + breite);
    }

    // berechneFlaeche()
    @Override
    public double berechneFlaeche() {
        return laenge * breite;
    }

    // zeige
    @Override
    public void anzeigen() {
        super.anzeigen(); // Ruft die Methode der Oberklasse auf.
        System.out.println("Länge: " + laenge + ", Breite: " + breite);
    }
}

