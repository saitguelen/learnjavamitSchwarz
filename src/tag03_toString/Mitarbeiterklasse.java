package tag03_toString;

public class Mitarbeiterklasse {
    /*Das Problem
Entwickle eine Klasse namens Mitarbeiter, die einen Mitarbeiter in einem Unternehmen repräsentiert.
Die Mitarbeiterklasse soll über folgende Attribute verwenden: mitarbeiterID, name, position,
gehalt und erfahrungsjahre. Die Attribute sollen entsprechend gekapselt werden
mit implementierten Gettern/Settern. (Attribute private, öffentliche Methoden public (Encapsulation)).
Die Klasse soll über einen Standard-Konstruktor ohne Parameter verfügen, der alle Attribute
auf Standard-Werte setzt. Neben dem Standard-Konstruktor soll es noch zwei weitere mit entsprechenden
Parametern geben (siehe Schritte für Details), um den Nutzern unserer Klasse entgegenzukommen.
Die Klasse soll ebenfalls über eine Methode verfügen, die alle ihre Werte auf der Konsole ausgibt.*/

    //Attribute
    private String mitarbeiterID;
    private String name;
    private String position;
    private double gehalt;
    private int erfahrungsjahre;

    //Standart Konstruktur
    public Mitarbeiterklasse() {
        this.mitarbeiterID = "";
        this.name = "";
        this.position = "";
        this.gehalt = 0.0;
        this.erfahrungsjahre = 0;
    }

    //Konstruktor mit 3 Parametern


    public Mitarbeiterklasse(String mitarbeiterID, String name, String position) {
        this.mitarbeiterID = mitarbeiterID;
        this.name = name;
        this.position = position;
        this.gehalt = 0.0;
        this.erfahrungsjahre = 0;

    }

    //Konstruktor mit allen Parametern


    public Mitarbeiterklasse(String mitarbeiterID, String name, String position, double gehalt, int erfahrungsjahre) {
        this.mitarbeiterID = mitarbeiterID;
        this.name = name;
        this.position = position;
        this.gehalt = gehalt;
        this.erfahrungsjahre = erfahrungsjahre;
    }

    //Getter & Setter mit Validierung(Überprüfung)
    /*i. Prüft, ob die Eingabe nicht leer ist. Nur, wenn die Eingabe nicht leer ist, wird die
mitarbeiterID gesetzt. Achtung: Es ist sinnvoll, die Variable erst einmal auf
null zu prüfen, bevor man auf eine Variable Methoden anwendet. Also: if (mitarbeiter
!= null && …)
    i. Prüft, ob gehalt nicht negativ ist. Nur, wenn es positiv ist, darf das Attribut gesetzt
werden
    i. Prüft, ob erfahrungsjahre nicht negativ ist. Nur, wenn es positiv ist, darf das Attribut
gesetzt werden*/



    public void setMitarbeiterID(String mitarbeiterID) {
        if (mitarbeiterID != null && !mitarbeiterID.isEmpty()) {
            this.mitarbeiterID = mitarbeiterID;
        }else{
            System.out.println("MitarbeiterID darf nicht leer sein");
        }

    }

    public void setGehalt(double gehalt) {
        if (gehalt >= 0) {
            this.gehalt = gehalt;
        }else{
            System.out.println("Gehalt kann nicht negativ sein");
        }
    }

    public void setErfahrungsjahre(int erfahrungsjahre) {
        if (erfahrungsjahre >= 0) {
            this.erfahrungsjahre = erfahrungsjahre;
        }else{
            System.out.println("Erfahrungsjahre können nicht negativ sein");
        }
    }

    public String getMitarbeiterID() {
        return mitarbeiterID;
    }

    public int getErfahrungsjahre() {
        return erfahrungsjahre;
    }

    public double getGehalt() {
        return gehalt;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    //Ausgabe
    public void zeigeMitarbeiterInfo()
    {
        System.out.println("MitarbeiterID: "+mitarbeiterID);
        System.out.println("Name: "+name);
        System.out.println("Position: "+position);
        System.out.println("Gehalt: "+gehalt + " €");
        System.out.println("Erfahrungsjahre: "+erfahrungsjahre);
        System.out.println();

    }

    @Override
    public String toString() {
        return "Mitarbeiterklasse{" +
                "MitarbeiterID = '" + mitarbeiterID + '\'' +
                ", Name = '" + name + '\'' +
                ", Position = '" + position + '\'' +
                ", Gehalt = " + gehalt +
                ", Erfahrungsjahre = " + erfahrungsjahre +
                '}';
    }
}
