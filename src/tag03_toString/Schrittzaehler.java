package tag03_toString;

class Schrittzaehler {
    //Attribute
    private int anzahlSchritte;
    private String datum;

    //Konstruktor
    public Schrittzaehler(String datum) {
        this.datum = datum;
        this.anzahlSchritte = 0;
    }

    public int erhoeheAnzahlSchritte() {
        return this.anzahlSchritte++;
    }

    @Override
    public String toString() {
        return "Am " + this.datum + " bin ich " + this.anzahlSchritte + " Schritte gegangen.";
    }

}



