package tag08_Aufgabe_04_Schreiben;

public class PlanetTest {
    //Wir erstellen eine Methode, die für alle Planeten funktionieren soll.
    public static void waehlePlanet(Planet p) {
        if(p instanceof Erde)
            //Wir müssen dann Casten, um eine Methode aus der Kindsklasse auszuführen
            ((Erde) p).erdeBerichtet();
        else if(p instanceof Mars)
            ((Mars) p).marsBerichtet();
        else
            System.out.println("Unbekannter Planet.");

    }

    public static void main(String[] args) {
        // Hier ein paar Objekte instanziieren
        Erde p1 = new Erde();
        Mars p2 = new Mars();
        Planet p3 = new Planet();

        waehlePlanet(p1);
        waehlePlanet(p2);
        waehlePlanet(p3);
    }

}