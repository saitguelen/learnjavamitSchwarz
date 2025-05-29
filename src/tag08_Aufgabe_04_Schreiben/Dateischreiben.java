package tag08_Aufgabe_04_Schreiben;

public class Dateischreiben implements Schreiben{

    public void oeffnen(){
        System.out.println("Datei geöffnet!");
    }
    public void schreiben(){
        System.out.println("In Datei schreiben!");
    }
    public void schliessen(){
        System.out.println("Datei geschlossen!");
    }
}
