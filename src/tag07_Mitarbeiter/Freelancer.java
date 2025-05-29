package tag07_Mitarbeiter;

public class Freelancer extends MitarbeiterAufHonorar {

    public Freelancer(String mitarbeiterID, String name, String position, int erfahrungsjahre,
                      String abteilung, double stundenlohn, int arbeitsstunden) {
        super(mitarbeiterID, name, position, erfahrungsjahre, abteilung, stundenlohn, arbeitsstunden);
    }

    @Override
    public double berechneVerguetung() {
        return getStundenlohn() * getArbeitsstunden();
    }

    @Override
    public void zeigeMitarbeiterInfo() {
        super.zeigeMitarbeiterInfo();
        System.out.println("Stundenlohn: " + getStundenlohn() + " EUR");
        System.out.println("Arbeitsstunden: " + getArbeitsstunden());
        System.out.println("Vergütung: " + berechneVerguetung() + " EUR");
    }
}
