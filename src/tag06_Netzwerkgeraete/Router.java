package tag06_Netzwerkgeraete;

public class Router extends Netzwerkgeraet{
    private int anzahlPorts;


    public Router(String hersteller, String modell, String ipAdresse, int anzahlPorts){
        super(hersteller, modell,ipAdresse);
        this.anzahlPorts=anzahlPorts;
    }

    public int getAnzahlPorts(){
        return anzahlPorts;
    }
    public void routeVerbindung(){
        System.out.println("Router leitet Daten weiter.");
    }

    @Override
    public String toString() {
        return super.toString()+" , Anzahl der Ports: "+anzahlPorts;
    }
}
