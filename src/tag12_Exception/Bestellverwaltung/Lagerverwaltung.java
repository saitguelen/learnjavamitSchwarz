package tag12_Exception.Bestellverwaltung;

public class Lagerverwaltung {
    private int lagerbestand;
    public Lagerverwaltung(int anfangsBestand){
        this.lagerbestand= anfangsBestand;
    }

    public int getLagerbestand() {
        return lagerbestand;
    }

    public void bestellungsDurchfuehren(int bestellmenge) throws OutOfStockException{
        if(bestellmenge>lagerbestand){
            throw new OutOfStockException(lagerbestand,bestellmenge);
        }
        lagerbestand -=bestellmenge;
        if(bestellmenge<0){
            throw new IllegalArgumentException("Bestelmenge soll positiv sein!!!");
        }

    }
}
