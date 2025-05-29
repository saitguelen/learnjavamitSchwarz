package tag03_toString;

public class MitarbeiterklasseRun {

    public static void main(String[] args) {

        //a) Standart Konstruktor
        Mitarbeiterklasse m1 = new Mitarbeiterklasse();
        m1.setMitarbeiterID("");
        m1.setName("Max Mustermann");
        m1.setPosition("Entwickler");
        m1.setGehalt(50000);
        m1.setErfahrungsjahre(5);
        m1.zeigeMitarbeiterInfo();
        System.out.println(m1);
        System.out.println();


        // b) Konstruktor mit 3 Parametern
        Mitarbeiterklasse m2 =new Mitarbeiterklasse("EMP002", "Maria Müller","Manager");
        m2.setGehalt(75000);
        m2.setErfahrungsjahre(8);
        m2.zeigeMitarbeiterInfo();
        System.out.println(m2);
        System.out.println();


        // c) Konstruktor mit allen Parametern
        Mitarbeiterklasse m3 = new Mitarbeiterklasse("EMP003", "John Doe","Designer",45000,3);
        m3.zeigeMitarbeiterInfo();
        System.out.println(m3);
        System.out.println();

        // d) Validierungslogik testen
        m3.setGehalt(-1000); // wird ignoriertm3.setErfahrungsjahre(-2); // wird ignoriert
        m3.setMitarbeiterID(""); // wird ignoriert
        m3.zeigeMitarbeiterInfo(); // alte Werte bleiben bes


    }
}
