package tag07_Mitarbeiter;

public class ScrumMaster extends MitarbeiterFestangestellt {
    private int anzahlZugewieseneMitarbeiter;

    public ScrumMaster(String mitarbeiterID, String name, String position, int erfahrungsjahre,
                       String abteilung, double gehalt, int anzahlZugewieseneMitarbeiter) {
        super(mitarbeiterID, name, position, erfahrungsjahre, abteilung, gehalt);
        setAnzahlZugewieseneMitarbeiter(anzahlZugewieseneMitarbeiter);
    }

    public int getAnzahlZugewieseneMitarbeiter() {
        return anzahlZugewieseneMitarbeiter;
    }

    public void setAnzahlZugewieseneMitarbeiter(int anzahl) {
        if (anzahl < 3 || anzahl > 10) {
            System.out.println("Anzahl der zugewiesenen Mitarbeiter muss zwischen 3 und 10 liegen. Wert wird auf 3 gesetzt.");
            this.anzahlZugewieseneMitarbeiter = 3;
        } else {
            this.anzahlZugewieseneMitarbeiter = anzahl;
        }
    }

    @Override
    public void zeigeMitarbeiterInfo() {
        super.zeigeMitarbeiterInfo();
        System.out.println("Gehalt: " + getGehalt() + " EUR");
        System.out.println("Zugewiesene Mitarbeiter: " + anzahlZugewieseneMitarbeiter);
    }
}
