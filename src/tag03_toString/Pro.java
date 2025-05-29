package tag03_toString;

public class Pro {

    //Attribute
    private String mitarbeiterID;
    private  String name;
    private String position;
    private double gehalt;
    private int erfahrungsjahre;



    //Konstruktor mit allen Parametern
    /*
    public Pro(String mitarbeiterID, String name, String position, double gehalt, int erfahrungsjahre) {
        this.mitarbeiterID = mitarbeiterID;
        this.name = name;
        this.position = position;
        this.gehalt = gehalt;
        this.erfahrungsjahre = erfahrungsjahre;
    }*/

    //Konstruktor mit leeren Parametern
    public Pro(){
        this("","","",0.0,0);
    }

    // 3-Parameter-Konstruktor ruft auch den vollen Konstruktor auf

    public Pro(String mitarbeiterID, String name, String position) {
        this(mitarbeiterID,name,position,0.0,0);
    }
    //Setter
    public void setMitarbeiterID(String mitarbeiterID){
        if (mitarbeiterID != null && !mitarbeiterID.isEmpty()) {
            this.mitarbeiterID = mitarbeiterID;
        } else {
            System.out.println("Ungültige MitarbeiterID. Es wird 'Unbekannt' gesetzt.");
            this.mitarbeiterID = "Unbekannt";
        }

    }
    public void setName(String name) {
        if (name != null && !name.isEmpty()) {
            this.name = name;
        } else {
            System.out.println("Ungültiger Name. Standardwert 'Unbekannt' wird gesetzt.");
            this.name = "Unbekannt";
        }
    }
    public void setPosition(String position) {
        if (position != null && !position.isEmpty()) {
            this.position = position;
        } else {
            System.out.println("Ungültige Position. Standardwert 'Unbekannt' wird gesetzt.");
            this.position = "Unbekannt";
        }
    }
    public void setGehalt(double gehalt) {
        if (gehalt >= 0) {
            this.gehalt = gehalt;
        } else {
            System.out.println("Gehalt darf nicht negativ sein. Standardwert 0.0 wird gesetzt.");
            this.gehalt = 0.0;
        }
    }
    public void setErfahrungsjahre(int erfahrungsjahre) {
        if (erfahrungsjahre >= 0) {
            this.erfahrungsjahre = erfahrungsjahre;
        } else {
            System.out.println("Erfahrungsjahre dürfen nicht negativ sein. Standardwert 0 wird gesetzt.");
            this.erfahrungsjahre = 0;
        }
    }
    public Pro(String mitarbeiterID, String name, String position, double gehalt, int erfahrungsjahre) {
        setMitarbeiterID(mitarbeiterID);
        setName(name);
        setPosition(position);
        setGehalt(gehalt);
        setErfahrungsjahre(erfahrungsjahre);}

    //Getter


    public String getMitarbeiterID() {return mitarbeiterID; }

    public String getName() {return name;}

    public String getPosition() {return position;}

    public double getGehalt() {return gehalt;}

    public int getErfahrungsjahre() {return erfahrungsjahre;}

    public void zeigeMitarbeiterInfo() {
        System.out.println("MitarbeiterID: " + mitarbeiterID);
        System.out.println("Name: " + name);
        System.out.println("Position: " + position);
        System.out.println("Gehalt: " + gehalt + " €");
        System.out.println("Erfahrungsjahre: " + erfahrungsjahre);
        System.out.println();
    }

}
/*🟡 1. Einleitung
Guten Tag,
heute präsentiere ich meine Java-Klasse namens Pro, die eine verbesserte Mitarbeiterklasse darstellt.
Diese Klasse wurde mit dem Ziel entwickelt, sichere und valide Objekte zu erzeugen, selbst wenn fehlerhafte Daten eingegeben werden.

🟢 2. Attribute
Die Klasse enthält fünf Attribute, die einen Mitarbeiter beschreiben:

mitarbeiterID (Mitarbeiterkennung)

name

position

gehalt

erfahrungsjahre (Berufserfahrung in Jahren)

Alle Attribute sind als private deklariert, um das Prinzip der Kapselung einzuhalten.

🟢 3. Konstruktoren
Die Klasse verfügt über drei Konstruktoren:

Der Standard-Konstruktor ohne Parameter ruft den Hauptkonstruktor mit Standardwerten auf.

Ein Konstruktor mit 3 Parametern für ID, Name und Position.

Ein vollständiger Konstruktor mit allen Parametern, der alle Werte über Setter-Methoden mit Validierung setzt.
 4. Setter mit Validierung
Die Setter-Methoden prüfen, ob die übergebenen Werte gültig sind.
Bei ungültigen Eingaben werden:

Warnmeldungen ausgegeben,

und Standardwerte gesetzt.

Beispiele:

Ist name leer → wird "unbekannt" gesetzt.

Ist gehalt negativ → wird 0.0 gesetzt.

Ist erfahrungsjahre negativ → wird 0 gesetzt.

🟢 5. Ausgabemethode
Die Methode zeigeMitarbeiterInfo() gibt alle Informationen des Mitarbeiters formatiert auf der Konsole aus:*/
