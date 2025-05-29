package tag07_Mitarbeiter;

public abstract  class Mitarbeiter {
    private String mitarbeiterID;
    private String name;
    private String position;
    private int erfahrungsjahre;
    private String abteilung;

    public Mitarbeiter(String mitarbeiterID, String name, String position, int erfahrungsjahre, String abteilung) {
        this.mitarbeiterID = mitarbeiterID;
        this.name = name;
        this.position = position;
        this.erfahrungsjahre = erfahrungsjahre;
        setAbteilung(abteilung); // kontrol burada
    }

    public String getMitarbeiterID() { return mitarbeiterID; }
    public void setMitarbeiterID(String mitarbeiterID) { this.mitarbeiterID = mitarbeiterID; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getPosition() { return position; }
    public void setPosition(String position) { this.position = position; }

    public int getErfahrungsjahre() { return erfahrungsjahre; }
    public void setErfahrungsjahre(int erfahrungsjahre) { this.erfahrungsjahre = erfahrungsjahre; }

    public String getAbteilung() { return abteilung; }
    public void setAbteilung(String abteilung) {
        if (abteilung.equals("Entwicklung") || abteilung.equals("IT-Sicherheit")) {
            this.abteilung = abteilung;
        } else {
            System.out.println("Ungültige Abteilung. Wird auf 'unbekannt' gesetzt.");
            this.abteilung = "unbekannt";
        }
    }

    public void zeigeMitarbeiterInfo() {
        System.out.println("ID: " + mitarbeiterID + ", Name: " + name + ", Position: " + position +
                ", Erfahrung: " + erfahrungsjahre + " Jahre, Abteilung: " + abteilung);
    }
}