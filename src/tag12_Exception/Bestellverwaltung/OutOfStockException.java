package tag12_Exception.Bestellverwaltung;

public class OutOfStockException extends Exception{
    public OutOfStockException(int bestand, int menge){
        super("Nicht genügendLagerbestand verfügbar!\n"+
                "Bestellte Menge: "+menge+"\n"+
                "Verfügbarer Lagerstand: "+bestand);
    }
}
