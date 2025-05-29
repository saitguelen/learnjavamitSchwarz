package tag07_Mitarbeiter;

public abstract class MitarbeiterFestangestellt extends Mitarbeiter {
    private double gehalt;

    public MitarbeiterFestangestellt(String mitarbeiterID, String name, String position,
                                     int erfahrungsjahre, String abteilung, double gehalt) {
        super(mitarbeiterID, name, position, erfahrungsjahre, abteilung);
        setGehalt(gehalt);  // kontrol burada
    }

    public double getGehalt() {
        return gehalt;
    }

    public void setGehalt(double gehalt) {
        if (gehalt < 0) {
            System.out.println("Gehalt darf nicht negativ sein. Wert wird auf 0 gesetzt.");
            this.gehalt = 0;
        } else {
            this.gehalt = gehalt;
        }
    }

    public double berechneBonus(double faktor) {
        return gehalt * faktor;
    }

    public double berechneBonus(double faktor, double sonderzulage) {
        return gehalt * faktor + sonderzulage;
    }
}
