package tag02_Uebungen;

public class Rechteck {

    //Attribute
    double laenge;
    double breite;

    //Konstruktor mit leerer Parameterliste
    public Rechteck(){
        this.laenge=0;
        this.breite=0; //mit dem Wert 0 initialisiert
    }
    //Konstruktor mit der Parameterliste
    public Rechteck(double laenge, double breite){
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


    //Dritte Aufgabe ❓Was passiert hier genau?
    public  void laengeAusgeben(){
        double laenge = 5.4;
       System.out.println("Länge: "+laenge); //gibt immer 5.4 aus – weil sich laenge hier auf die lokale Variable bezieht, nicht auf das Attribut der Klasse.
        System.out.println("Länge: "+this.laenge);    //this.laenge ist das Attribut der Klasse → wurde beim Erzeugen des Objekts auf 10.0 gesetzt
    }
/*
Wird eine lokale Variable mit dem Namen laenge deklariert.

Diese Variable gilt nur innerhalb der Methode laengeAusgeben() – sie ist lokal.

Der Name laenge ist identisch mit dem Attribut der Klasse (oben im Code: private double laenge).

In Java gilt: Lokale Variablen haben Vorrang vor Klassenattributen, wenn sie denselben Namen haben.

Das bedeutet:

laenge bezieht sich hier ausschließlich auf die lokale Variable mit dem Wert 5.4.

Das Klassenattribut laenge ist innerhalb dieser Methode nicht sichtbar, außer man benutzt this.laenge.

*/



}
