package tag06_Netzwerkgeraete;

public class AccessPoint extends Netzwerkgeraet{
    private  int maxVerbindungen;
    public AccessPoint(String hersteller, String modell, String ipAdresse, int maxVerbindungen) {
        super(hersteller, modell, ipAdresse);
        this.maxVerbindungen = maxVerbindungen;
    }

    public int getMaxVerbindungen() {
        return maxVerbindungen;
    }
    public void verbindeGeraet(){
        System.out.println("Access Point verbindet Geräte mit dem Netzwerk.");
    }
    @Override
    public String toString() {
        return super.toString() + ", Maximale Verbindungen: " + maxVerbindungen;
    }
}
