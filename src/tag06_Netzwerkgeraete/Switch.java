package tag06_Netzwerkgeraete;

public class Switch extends Netzwerkgeraet{
    private double verarbeitungskapazitaet;

    public Switch(String hersteller, String modell, String ipAdresse, double verarbeitungskapazitaet){
        super(hersteller,modell,ipAdresse);
        this.verarbeitungskapazitaet= verarbeitungskapazitaet;

    }

    public double getVerarbeitungskapazitaet() {
        return verarbeitungskapazitaet;
    }
    public void schalteDaten(){
        System.out.println("Switch verarbeitet Daten mit hoher Geschwindigkeit.");
    }

    @Override
    public String toString() {
        return super.toString()+ ", Verarbeitungskapazität: "+ verarbeitungskapazitaet+ " Mbps.";
    }
}
