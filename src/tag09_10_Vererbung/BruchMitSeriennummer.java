package tag09_10_Vererbung;

public class BruchMitSeriennummer extends Bruch {

    private final  int seriennummer;
    private static int seriennumernZaehler=0;

    public BruchMitSeriennummer(int zaehler,int nenner) {
        super(zaehler,nenner);
        seriennumernZaehler++;
        this.seriennummer=seriennumernZaehler;
    }
    public int getSeriennummer(){
        return seriennummer;
    }
}
