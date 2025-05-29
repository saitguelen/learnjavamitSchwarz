package tag06_Netzwerkgeraete;

public class Netzwerkgeraet {
    private String hersteller;
    private String modell;
    private String ipAdresse;

    public Netzwerkgeraet(String hersteller, String modell, String ipAdresse) {
        this.hersteller = hersteller;
        this.modell = modell;
        this.ipAdresse = ipAdresse;
    }


    public String getHersteller(){
        return hersteller;
    }
    public String getModell(){
        return modell;
    }
    public String getIpAdresse(){
        return ipAdresse;
    }

    @Override
    public String toString() {
        return "Netzwerkgeraet ==> " +
                "Hersteller='" + hersteller + '\'' +
                ", Modell='" + modell + '\'' +
                ", IpAdresse='" + ipAdresse + '\'' +
                '}';
    }
}
