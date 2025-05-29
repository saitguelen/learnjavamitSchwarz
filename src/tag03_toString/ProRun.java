package tag03_toString;

public class ProRun {
    public static void main(String[] args) {
        // a) Standard-Konstruktor
        Pro p1 = new Pro();
        p1.setMitarbeiterID("");
        p1.setName("");
        p1.setPosition("");
        p1.setGehalt(-45000);
        p1.setErfahrungsjahre(-4);
        p1.zeigeMitarbeiterInfo();

        // b) Konstruktor mit 3 Parametern
        Pro p2 = new Pro("EMP002", "", "Manager");
        p2.setGehalt(75000);
        p2.setErfahrungsjahre(8);
        p2.zeigeMitarbeiterInfo();

        // c) Konstruktor mit allen Parametern
        Pro p3 = new Pro("", "John Doe", "Designer", -65000, -7);
        p3.zeigeMitarbeiterInfo();


        // d) Fehlerhafte Eingaben testen
        Pro p4 = new Pro();
        p4.setMitarbeiterID(""); // sollte zu 'Unbekannt' führen
        p4.setName(null); // sollte zu 'Unbekannt' führen
        p4.setPosition(""); // sollte zu 'Keine Angabe' führen
        p4.setGehalt(-1000); // sollte zu 0.0 führen
        p4.setErfahrungsjahre(-5); // sollte zu 0 führen
        p4.zeigeMitarbeiterInfo();
    }
}


