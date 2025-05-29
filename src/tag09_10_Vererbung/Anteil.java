package tag09_10_Vererbung;

public class Anteil extends BruchMitSeriennummer{
    private static Bruch verteilt = new Bruch(0,1);

    public Anteil(){
        super(0,1);
    }
    public Anteil(int z, int n){
        super(z,n);
        Bruch neuerAnteil = new Bruch(z,n);
        Bruch neueVerteilung=verteilt.addiere(neuerAnteil);

        if(neueVerteilung.dezimalwert()>1.0){
            System.out.println("Fehler: Gesamtanteil überschreitet 1.");
        }else{
            verteilt= neueVerteilung;
        }
    }
    public double getVerteilt(){
        return verteilt.dezimalwert();
    }
    public Bruch getVerteiltAlsBruch(){
        return verteilt;
    }
    public Bruch getRest(){
        return new Bruch(1,1).subtrahiere(verteilt);
    }
}
