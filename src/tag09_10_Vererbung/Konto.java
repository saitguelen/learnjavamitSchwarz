package tag09_10_Vererbung;

public class Konto {

    //Attribiute

    private String kontonummer;
    private double kontostand;

    public String getKontonummer() {
        return kontonummer;
    }

    public double getKontostand() {
        return kontostand;
    }

    public void einzahlen(double betrag){
        kontostand +=betrag;
       // System.out.println("Kontostand nach Einzahlen: "+kontostand+" €");
    }

    public void auszahlen(double betrag){
        kontostand -=betrag;
        //System.out.println("Kontostand nach Auszahlen: "+kontostand+" €");

    }

    public Konto(String kontonummer, double kontostand){
        this.kontonummer=kontonummer;
        this.kontostand=kontostand;






    }
}

