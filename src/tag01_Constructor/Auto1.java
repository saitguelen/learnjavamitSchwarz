package tag01_Constructor;

public class Auto1 {
    //Attribute
    private int baujahr;
    private String marke;
    private int kilometerstand;
    private boolean automatik;
    private int preis;

    //Konstruktor --> um Instanzvariablen mit sinnvollen Startwerten zu füllen
    //Ist leider nicht sichtbar
    //Methode, die den Namen der Klasse trägt

    //public Auto() {

    //}
    //Sobald wir einen EIGNEN Konstruktor schreiben, z.B. diesen parametrisierten Konstruktor, ist der Standardkonstruktor weg!!!!
    //Wenn ihr diesen Standardkonstruktor trotzdem haben wollt, müsst ihr ihn explizit reinschreiben.

    //Standardkonstruktor

    public Auto1() {

    }

    //Parametrisierter Konstruktor
    public Auto1(int pBaujahr, String pMarke, int pKilometerstand, boolean pAutomatik, int pPreis) {
        baujahr = pBaujahr;
        marke = pMarke;
        kilometerstand = pKilometerstand;
        automatik = pAutomatik;
        preis = pPreis;

    }


    //Lesezugriff: Getter: Methoden mit Rückgabewert leerer Parameterliste
    public int getBaujahr() {
        return baujahr;
    }
    //Schreibzugriff: Setter: Methode mit Rückgabewert void, Parameter oder Parameterliste
    public void setBaujahr(int baujahr) {
        this.baujahr = baujahr;
    }

    public String getMarke() {
        return marke;
    }

    public void setMarke(String marke) {
        this.marke = marke;
    }

    public int getKilometerstand() {
        return kilometerstand;
    }

    public void setKilometerstand(int kilometerstand) {
        this.kilometerstand = kilometerstand;
    }
    //Bei boolean gibt es eine abweichende Notation (Getter): man verwendet das Präfix "istFrühlich"
    public boolean isAutomatik() {
        return automatik;
    }

    public void setAutomatik(boolean automatik) {
        this.automatik = automatik;
    }

    public int getPreis() {
        return preis;
    }

    public void setPreis(int preis) {
        this.preis = preis;
    }

    //Methoden
    public void macheProbefahrt(int pKilometer) {
        kilometerstand = kilometerstand + pKilometer;
    }

    public void aenderePreisUm(int pAenderung) {
        if(preis + pAenderung > 0)
            preis = preis + pAenderung;
        else
            System.out.println("Die Änderung ist nicht zulässig!");
    }

}
