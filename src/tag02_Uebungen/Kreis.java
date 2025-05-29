package tag02_Uebungen;

public class Kreis {

    //Attribut
    private double radius;

    //Konstruktor mit leerer Parameterliste
    public Kreis(){
        this.radius=0; //mit dem Wert 0 initialisiert

    }

    //Konstruktor mit der Parameterliste

    public Kreis(double radius){
        this.radius=radius;
    }

    //Getter und Setter
    //Getter
    public double getRadius(){
        return radius;
    }
    //Setter
    public void setRadius(double r){
        this.radius=r;
    }

    //jetzt erstellen wir zwei Methode

    //Erste method: umfang
    public double getUmfang(){
        return 2*Math.PI*radius;
    }

    //Zweite Method: Fläche

    public double getFlaeche(){
        return Math.PI*Math.pow(radius,2);
    }


}
