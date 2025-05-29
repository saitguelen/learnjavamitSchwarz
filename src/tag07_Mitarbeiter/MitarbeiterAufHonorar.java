package tag07_Mitarbeiter;

public abstract class MitarbeiterAufHonorar extends Mitarbeiter {
    private double stundenlohn;
    private int arbeitsstunden;

    public MitarbeiterAufHonorar(String mitarbeiterID, String name, String position,
                                 int erfahrungsjahre, String abteilung, double stundenlohn, int arbeitsstunden) {
        super(mitarbeiterID, name, position, erfahrungsjahre, abteilung);
        setStundenlohn(stundenlohn);
        setArbeitsstunden(arbeitsstunden);
    }

    public double getStundenlohn() {
        return stundenlohn;
    }

    public void setStundenlohn(double stundenlohn) {
        if (stundenlohn < 0) {
            System.out.println("Stundenlohn darf nicht negativ sein. Wert wird auf 0 gesetzt.");
            this.stundenlohn = 0;
        } else {
            this.stundenlohn = stundenlohn;
        }
    }

    public int getArbeitsstunden() {
        return arbeitsstunden;
    }

    public void setArbeitsstunden(int arbeitsstunden) {
        if (arbeitsstunden < 0) {
            System.out.println("Arbeitsstunden dürfen nicht negativ sein. Wert wird auf 0 gesetzt.");
            this.arbeitsstunden = 0;
        } else {
            this.arbeitsstunden = arbeitsstunden;
        }
    }

    public abstract double berechneVerguetung();
}