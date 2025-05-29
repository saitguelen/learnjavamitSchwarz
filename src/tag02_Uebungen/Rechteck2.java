package tag02_Uebungen;

public class Rechteck2 {    //Attribute
    double laenge;
    double breite;

    //Konstruktor mit leerer Parameterliste
    public Rechteck2(){
        this.laenge=0;
        this.breite=0; //mit dem Wert 0 initialisiert
    }
    //Konstruktor mit der Parameterliste
    public Rechteck2(double laenge, double breite){
        this.laenge=laenge;
        this.breite=breite;

    }
    //Getter und Setter

    //Setter


    public void setBreite(double breite) {
        this.breite = breite;
    }

    public void setLaenge(double laenge) {
        this.laenge = laenge;
    }
    public void setSeiten(double laenge, double breite){
        this.breite=breite;
        this.laenge=laenge;
    }


    //Getter
    public double getLaenge(){
        return laenge;
    }
    public double getBreite(){
        return breite;
    }

    public double getLangeSeite(){
        if (laenge>breite)
            return laenge;
        else
            return breite;
    }
    public double getKurzeSeite(){
        if (laenge<breite)
            return laenge;
        else
            return breite;

    }
    public double getDiagonale() {
        return Math.sqrt(Math.pow(laenge, 2) + Math.pow(breite, 2));
    }

    public double getFlaeche(){
        return (laenge*breite);

    }
    public double getUmfang(){
        return 2*(laenge+breite);
    }

    public void laengeVergroessern(double wert){
        this.laenge += wert;
    }
    public void breiteVergroessern(double wert){
        this.breite +=wert;

    }
    public void laengeVerkleinern(double wert){
        this.laenge -=wert;
    }
    public void breiteVerkleinern(double wert){
        this.breite -=wert;
    }

}
